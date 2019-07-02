package com.DSA2019.Stack;

//stack implementation using linkedlist
public class StackProblem {

	StackNode root;

	static class StackNode {

		int data;
		StackNode next;

		public StackNode(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {
		StackProblem sp = new StackProblem();

		sp.push(1);
		sp.push(2);
		sp.push(3);
		sp.push(4);
		sp.push(5);
		System.out.println(sp.pop() + " ");
		System.out.println("top element in the stack :" + sp.peek());
	}

	private int peek() {
		if (root == null) {
			try {
				throw new Exception("stack is empty you SOB");
			} catch (java.lang.Exception e) {
				e.printStackTrace();
			}
		}
		return root.data;
	}

	private int pop() {
		int popped = Integer.MIN_VALUE;
		if (root == null) {
			try {
				throw new Exception("stack is already empty..");
			} catch (java.lang.Exception e) {
				e.printStackTrace();
			}
		}

		popped = root.data;
		root = root.next;

		return popped;
	}

	// insertion been done from the beginning of the node/list
	private void push(int i) {
		StackNode stackNode = new StackNode(i);
		if (root == null) {
			root = stackNode;
		} else {
			StackNode temp = root;
			root = stackNode;
			stackNode.next = temp;
		}
		System.out.println(i + "-> pushed to the stack");

	}

}
