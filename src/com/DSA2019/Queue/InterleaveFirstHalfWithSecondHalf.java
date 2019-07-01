package com.DSA2019.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InterleaveFirstHalfWithSecondHalf {

	/*
	 * Input : 11 12 13 14 15 16 17 18 19 20 
	 * Output : 11 16 12 17 13 18 14 19 15 20
	 */
	public static void main(String[] args) {

		Queue<Integer> q = new LinkedList<Integer>();
		q.add(11);
		q.add(12);
		q.add(13);
		q.add(14);
		q.add(15);
		q.add(16);
		q.add(17);
		q.add(18);
		q.add(19);
		q.add(20);
		interLeaveQueue(q);

	}

	private static void interLeaveQueue(Queue<Integer> q) {

		// check whether the size of the queue is even or not.
		if (q.size() % 2 != 0) {
			throw new IllegalArgumentException("queue size should be even..");
		}

		// create an empty stack
		Stack<Integer> stack = new Stack<Integer>();
		// store the half size of the queue
		int size = q.size() / 2;

		// insert first half into the stack
		// now the queue looks like 16,17,18,19,20 & stack contains 15,14,13,12,11
		// where the top of the stack is 15
		for (int i = 0; i < size; i++) {
			stack.push(q.poll());
		}

		//pop the stack and enqueue the queue again
		//now the queue looks like 16,17,18,19,20,15,14,13,12,11
		while(!stack.isEmpty()){
			q.add(stack.pop());
		}

		//dequeue and insert first half again into the queue
		//now the queue looks like 15,14,13,12,11,16,17,18,19,20 
		for(int i=0;i<size;i++) {
			q.add(q.poll());
		}
		
		//again push the first half into the stack
		//queue looks like 16,17,18,19,20 & stack at (Top of stack -> )11,12,13,14,15
		for(int i=0;i<size;i++) {
			stack.push(q.poll());
		}
		
		//now here 11,16,12,17,13,18,14,19,15,20
		while(!stack.isEmpty()) {
			q.add(stack.pop());
			q.add(q.poll());
		}
		
		//interleaved queue is....
		System.out.println(q);

	}

}
