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

		// barebone linkeslist
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

		System.out.println("finding the middle element of the linkedlist: ");
		llist.findTheMiddleNode();
		
		System.out.println("reversing the linkedlist  ");
		llist.reversingTheLinkedList(llist.head);

	}

	/**
	 * @param head2
	 */
	private void reversingTheLinkedList(LinkedListNode head) {
		
		LinkedListNode currentNode=head;
		LinkedListNode prevNode=null;
		LinkedListNode nextNode=null;
		
		while(currentNode!=null) {
			nextNode=currentNode.next;
			currentNode.next=prevNode;
			prevNode=currentNode;
			currentNode=nextNode;
		}
	}

	/**
	 * 
	 */
	private void findTheMiddleNode() {

		LinkedListNode slowPtr = head;
		LinkedListNode fastPtr = head;
		if (head != null) {
			while (fastPtr != null && fastPtr.next != null) {
				fastPtr = fastPtr.next.next;
				slowPtr = slowPtr.next;
			}
			System.out.println("Middle of the linkedlist : " + slowPtr.data);
		}
	}

	private void insertAfter(LinkedListNode prevNode, int data) {

		System.out.println("inserting after certain node : " + prevNode.data + " value :  " + data);

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
