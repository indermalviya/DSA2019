/**
 * 
 */
package com.DSA2019.Threads;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */
public class CallableAndFutureExample {

	public static void main(String[] args) {

		ExecutorService executors = Executors.newCachedThreadPool();

//		executors.submit(new Runnable() {
//
//			@Override
//			public void run() {
//				Random random = new Random();
//
//				int duration = random.nextInt(4000);
//				
//				try {
//					Thread.sleep(duration);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//
//				System.out.println("slept well...");
//
//			}
//		});

		Future<Integer> future = executors.submit(new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				Random random = new Random();
				int duration = random.nextInt(4000);
				try {
					Thread.sleep(duration);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				return duration;
			}
		});

		executors.shutdown();
		try {
			executors.awaitTermination(1, TimeUnit.HOURS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		try {
			System.out.println("slept duration was : " + future.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
