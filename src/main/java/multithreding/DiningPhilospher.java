package multithreding;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DiningPhilospher {

	public static void main(String args[]) {

	}
}

class ChopStick {
	private Lock lock;

	ChopStick() {
		lock = new ReentrantLock();
	}

}
