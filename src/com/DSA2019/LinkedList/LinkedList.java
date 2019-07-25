package com.DSA2019.LinkedList;

public class LinkedList {

	LinkedListNode head;

	static class LinkedListNode {

		int data;
		LinkedListNode next;

		public LinkedListNode(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public static void main(String[] args) {

		LinkedList llist = new LinkedList();
		llist.head = new LinkedListNode(1);

		llist.head.next = new LinkedListNode(2);
		llist.head.next.next = new LinkedListNode(3);
		llist.head.next.next.next = new LinkedListNode(4);
		
        //barebone linkeslist
		llist.printList();
		// pushing at the beginning of the linkedlist
		llist.push(0);
		llist.printList();
		// pushing at the end of the linkedlist
		llist.append(6);
		llist.printList();
		// pushing after certain node
		llist.insertAfter(llist.head.next, 7);
		llist.printList();

	}

	private void insertAfter(LinkedListNode prevNode, int data) {

		System.out.println("inserting after certain node : " + prevNode.data +" value :  " + data);

		LinkedListNode lnode = new LinkedListNode(data);
		LinkedListNode temp = prevNode.next;
		prevNode.next = lnode;
		lnode.next = temp;

	}

	private void append(int i) {
		System.out.println("inserting at the rear of the linkedlist : " + i);
		LinkedListNode lnod = new LinkedListNode(i);
		if (head == null) {
			head = lnod;
			return;
		}

		lnod.next = null;
		LinkedListNode temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = lnod;
		return;
	}

	private void push(int i) {
		System.out.println("inserting at the beginning of the linkedlist ");
		LinkedListNode newNode = new LinkedListNode(i);
		newNode.next = head;
		head = newNode;
	}

	// driver function to display the linkedlist
	private void printList() {

		LinkedListNode headNode = head;
		while (headNode != null) {
			System.out.print(headNode.data + " ");
			headNode = headNode.next;
		}
		System.out.println(" ");
	}

}
