/**
 * 
 */
package com.DSA2019.Threads;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */

class Processor implements Runnable {

	private CountDownLatch latch;

	/**
	 * @param latch
	 */
	public Processor(CountDownLatch latch) {
		this.latch = latch;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override

	public void run() {

		System.out.println("started..");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		latch.countDown();
	}

}

public class CountDownLatchExample {

	public static void main(String[] args) {

		CountDownLatch latch = new CountDownLatch(3);

		ExecutorService executor = Executors.newFixedThreadPool(3);

		for (int i = 0; i < 3; i++) {
			executor.submit(new Processor(latch));
		}

		try {
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Completed..");

	}

}
