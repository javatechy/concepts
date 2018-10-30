package mcq;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

import utils.Common;

/**
 * 
 * https://www.geeksforgeeks.org/output-of-java-program-set-16-threads/
 *
 * @author deepak
 *
 */
public class CyclicBarrierTest implements Runnable {
	public static CyclicBarrier cyclicBarrier = new CyclicBarrier(3);

	public static void main(String args[]) throws InterruptedException, BrokenBarrierException {
		Thread t1 = new Thread(new CyclicBarrierTest());
		Thread t2 = new Thread(new CyclicBarrierTest());
		t1.start();
		t2.start();
		Common.println("Both thread started");// 3
		// cyclicBarrier.await();
		cyclicBarrier.await();
		Common.println("Both thread ended");// 4
	}

	@Override
	public void run() {

		Common.println("GeeksforGeeks THREAD START"); // 1
		try {
			cyclicBarrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Common.println("GeeksforGeeks THREAD END");// 2

	}
}
