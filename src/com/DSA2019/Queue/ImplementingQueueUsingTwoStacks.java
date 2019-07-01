package com.DSA2019.Queue;

import java.util.Stack;

public class ImplementingQueueUsingTwoStacks {
	static Stack<Integer> stack1 = new Stack<Integer>();
	static Stack<Integer> stack2 = new Stack<Integer>();

	public static void main(String[] args) {
		OperationUsingStacks();

	}

	private static void OperationUsingStacks() {

		stack1.push(1);
		stack1.push(2);
		stack1.push(3);
		stack1.push(4);
		stack1.push(5);
		enQueueIntoQueueUsingStack(6);
		deQueueIntoQueueUsingStack();

	}

	private static void deQueueIntoQueueUsingStack() {
		if(stack1.isEmpty()) {
			throw new IllegalArgumentException();
		}
		System.out.println("value dequeued : " + stack1.pop());

	}

	private static void enQueueIntoQueueUsingStack(int i) {
		while (!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		stack1.push(i);
		while (!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
		System.out.println("values in the stack : " + stack1);
	}

}
