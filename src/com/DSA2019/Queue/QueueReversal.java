package com.DSA2019.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * Reversing the first K elements of a Queue
 * 
 * Input : Q = [10, 20, 30, 40, 50, 60, 
            70, 80, 90, 100]
        k = 5
   Output : Q = [50, 40, 30, 20, 10, 60, 
             70, 80, 90, 100]
 * */
public class QueueReversal {

	static Queue<Integer> queue;

	public static void main(String[] args) {

		queue = new LinkedList<Integer>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		queue.add(60);
		queue.add(70);
		queue.add(80);
		queue.add(90);
		queue.add(100);
		int k = 5;
		System.out.println("Before reversing the queue" + queue);
		Queue finalReversedQueue = reverseQueueFirstKElements(queue, k);
		
		System.out.println("After reversing the queue");
		System.out.println(finalReversedQueue);
	}

	private static Queue<Integer> reverseQueueFirstKElements(Queue<Integer> queue, int k) {

		Stack<Integer> stack = new Stack<Integer>();
		if (queue == null || k > queue.size()) {
			throw new IllegalArgumentException("wrong input mate!!");
		}

		for (int i = 0; i < k; i++) {
			stack.push(queue.remove());
		}
		System.out.println("stack size " + stack.size());

		while (!stack.isEmpty()) {
			int valueRemoved=stack.pop();
			queue.add(valueRemoved);
		}

		for (int i = 0; i < queue.size() - k; i++) {
			queue.add(queue.remove());
		}
		return queue;
	}

}
