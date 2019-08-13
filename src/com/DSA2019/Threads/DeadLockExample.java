package com.DSA2019.Threads;
/**
 * 
 */

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */

class TestNoob {

	public void firstMethod() {

		// this will create deadlock because of the one sequence of locks these method
		// hold..
		synchronized (Integer.class) {
			synchronized (String.class) {
				System.out.println("lol..");
			}
		}

	}

	public void secondMethod() {

		synchronized (String.class) {
			synchronized (Integer.class) {
				System.out.println("rofl...");
			}
		}

	}

}

public class DeadLockExample {

	public static void main(String[] args) {

		TestNoob tn = new TestNoob();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {

				tn.firstMethod();

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				tn.secondMethod();
			}
		});

		t1.start();
		t2.start();

//		try {
//			t1.join();
//			t2.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

	}

}
