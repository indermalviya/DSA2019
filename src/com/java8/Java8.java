package com.java8;

public class Java8 {
	public static void main(String[] args) {
		new Java8().doWork();
	}

	private void doWork() {
		
		new Thread(() -> {
			System.out.println("Thread");
		                 }).start();
		
	}

}
