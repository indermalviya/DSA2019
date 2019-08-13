/**
 * 
 */
package com.DSA2019.Threads;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */

class Runner {

	Account acc1 = new Account();
	Account acc2 = new Account();

	private Lock lock1 = new ReentrantLock();
	private Lock lock2 = new ReentrantLock();

	public void acquireLock(Lock lock1, Lock lock2) {
		while (true) {

			boolean firstLock = false;
			boolean secondLock = false;

			try {
				firstLock = lock1.tryLock();
				secondLock = lock2.tryLock();
			} finally {

				if (firstLock && secondLock) {
					return;
				}
				if (firstLock) {
					lock1.unlock();
				}
				if (secondLock) {
					lock2.unlock();
				}

			}

		}

	}

	public void firstOperation() {
		Random random = new Random();

		for (int i = 0; i < 10000; i++) {

			acquireLock(lock1, lock2);
			try {
				Account.transfer(acc1, acc2, random.nextInt(100));
			} finally {
				lock1.unlock();
				lock2.unlock();
			}
		}

	}

	public void secondOperation() {
		Random random = new Random();

		for (int i = 0; i < 10000; i++) {
			acquireLock(lock1, lock2);
			try {
				Account.transfer(acc2, acc1, random.nextInt(100));
			} finally {
				lock1.unlock();
				lock2.unlock();
			}
		}
	}

	public void totalBalance() {
		System.out.println("Balance in acc1: " + acc1.getBalance());
		System.out.println("Balance in acc2: " + acc2.getBalance());
		System.out.println("Total Balance : " + (acc1.getBalance() + acc2.getBalance()));
	}

}

public class AccountClassDeadLock {

	public static void main(String[] args) {

		Runner r1 = new Runner();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {

				r1.firstOperation();

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {

				r1.secondOperation();
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

		r1.totalBalance();

	}

}
