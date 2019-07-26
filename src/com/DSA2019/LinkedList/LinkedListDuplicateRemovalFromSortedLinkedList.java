/**
 * 
 */
package com.DSA2019.LinkedList;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */
public class LinkedListDuplicateRemovalFromSortedLinkedList {

	Node head;

	static class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public static void main(String[] args) {

		LinkedListDuplicateRemovalFromSortedLinkedList ldr = new LinkedListDuplicateRemovalFromSortedLinkedList();
		ldr.head = new Node(1);
		ldr.head.next = new Node(2);
		ldr.head.next.next = new Node(2);
		ldr.head.next.next.next = new Node(3);
		ldr.head.next.next.next.next = new Node(3);
		ldr.head.next.next.next.next.next = new Node(4);
		ldr.head.next.next.next.next.next.next = new Node(5);

		Node returnhead = removeDuplicateFromSortedLinkedList(ldr.head);
		System.out.println("After removing duplicate from the linkedlist : ");
		printLinkedList(returnhead);

	}

	/**
	 * @param returnhead
	 */
	private static void printLinkedList(Node returnhead) {
		while (returnhead != null) {
			System.out.print(returnhead.data + " ");
			returnhead = returnhead.next;
		}

	}

	/**
	 * @param head
	 * this only works, when the nodes are sorted in the linkedlist
	 */
	private static Node removeDuplicateFromSortedLinkedList(Node head) {
		if (head == null) {
			return null;
		}

		Node headNode = head;
		while (headNode.next != null) {
			if (headNode.data == headNode.next.data) {
				Node nextNext = headNode.next.next;
				headNode.next = nextNext;
			} else {
				headNode = headNode.next;
			}
		}
		return head;
	}
}
