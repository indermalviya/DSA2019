/**
 * 
 */
package com.DSA2019.LinkedList;

import com.DSA2019.LinkedList.LinkedList.LinkedListNode;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */
public class ReversingLinkedList {

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

		ReversingLinkedList llist = new ReversingLinkedList();
		llist.head = new LinkedListNode(1);
		llist.head.next = new LinkedListNode(2);
		llist.head.next.next = new LinkedListNode(3);
		llist.head.next.next.next = new LinkedListNode(4);
		System.out.println("Befor Reversing the linkedlist");
		llist.display(llist.head);
		LinkedListNode node = reversingLinkedList(llist.head);
		System.out.println("Reversing the linkedlist");
		llist.display(node);

	}

	/**
	 * @param node
	 */
	private void display(LinkedListNode node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println(" ");

	}

	/**
	 * @param head
	 * @return
	 */
	private static LinkedListNode reversingLinkedList(LinkedListNode head) {

		LinkedListNode currNode = head;
		LinkedListNode nextNode = null;
		LinkedListNode prevNode = null;
		while (currNode != null) {
			nextNode = currNode.next;
			currNode.next = prevNode;
			prevNode = currNode;
			currNode = nextNode;
		}
		return prevNode;

	}

}
