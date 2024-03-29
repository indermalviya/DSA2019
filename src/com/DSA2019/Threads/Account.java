/**
 * 
 */
package com.DSA2019.Threads;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */
public class Account {

	private int balance = 10000;

	public void withDraw(int amount) {
		balance -= amount;
	}

	public void deposit(int amount) {
		balance += amount;
	}

	public int getBalance() {
		return balance;
	}

	public static void transfer(Account acc1, Account acc2, int amount) {
		acc1.withDraw(amount);
		acc2.deposit(amount);
	}

}
