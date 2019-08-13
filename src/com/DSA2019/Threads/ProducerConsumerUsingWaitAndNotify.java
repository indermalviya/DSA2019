/**
 * 
 */
package com.DSA2019.Threads;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */

class TestFire {

	public void producer() throws InterruptedException {
		
		synchronized (this) {
			System.out.println("producer started...");
			Thread.sleep(100);
			wait();
			System.out.println("producer resumed..");
		}

	}

	public void consumer() throws InterruptedException {
		
		synchronized (this) {
			System.out.println("consumer started...");
			notify();
			
		}

	}

}

public class ProducerConsumerUsingWaitAndNotify {

	public static void main(String[] args) {

		TestFire tf = new TestFire();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					tf.producer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					tf.consumer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		});

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
