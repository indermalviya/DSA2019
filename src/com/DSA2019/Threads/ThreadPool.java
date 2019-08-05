/**
 * 
 */
package com.DSA2019.Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */
class Processor1 implements Runnable {

	private int id;

	/**
	 * 
	 */
	Processor1(int id) {
		this.id = id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {

		System.out.println("Starting : " + id);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("ended : " + id);

	}

}

public class ThreadPool {
	public static void main(String[] args) {

		ExecutorService executors = Executors.newFixedThreadPool(2);

		for (int i = 0; i < 5; i++) {
			executors.submit(new Processor1(i));
		}

		executors.shutdown();

		System.out.println("All task submitted successfully..");
		try {
			executors.awaitTermination(1, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
