package multithreding;

import java.util.concurrent.locks.ReentrantLock;

import utils.Common;

public class ReentrantLockTest {

	static ReentrantLock lock = new ReentrantLock();

	public static void main(String args[]) throws InterruptedException {
		// Let us create task that is going to
		// wait for four threads before it starts
		ReentrantLockTest rant = new ReentrantLockTest();
		new Thread(() -> rant.lactchMethod(), "first1").start();
		new Thread(() -> rant.lactchMethod(), "first2").start();
		Common.println("isHeldByCurrentThread: " + lock.isHeldByCurrentThread());
		Common.println("getHoldCount: " + lock.getHoldCount());

		new Thread(() -> rant.lactchMethod(), "first3").start();
		new Thread(() -> rant.lactchMethod(), "first4").start();
		Common.print(lock.isFair());

	}

	private void lactchMethod() {
		lock.lock();
		System.out.println("HELLO " + Thread.currentThread().getName());
		lock.unlock();
	}
}
