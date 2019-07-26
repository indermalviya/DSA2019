/**
 * 
 */
package com.DSA2019.LinkedList;

import com.DSA2019.LinkedList.LinkedList.LinkedListNode;

/**
 * @author Atul Sharma
 *
 */
public class DetectLoopInLinkedList {

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
		DetectLoopInLinkedList llist = new DetectLoopInLinkedList();
		llist.head = new LinkedListNode(1);
		llist.head.next = new LinkedListNode(2);
		llist.head.next.next = new LinkedListNode(3);
		llist.head.next.next.next = new LinkedListNode(4);
		llist.head.next.next.next.next = new LinkedListNode(5);
	//	llist.head.next.next.next.next.next = llist.head.next;
		System.out.println("nodes in the linkedlist : ");
		llist.printTheLinkedListNode();
		llist.checkLoopExistOrNot();
	}

	/**
	 * 
	 */
	private void checkLoopExistOrNot() {
		LinkedListNode slowPtr=head;
		LinkedListNode fastPtr=head;
		
		while (slowPtr!=null && fastPtr!=null && fastPtr.next!=null) {
			slowPtr=slowPtr.next;
			fastPtr=fastPtr.next.next;
			if(slowPtr==fastPtr) {
				System.out.print("loop detected: ");
			}
		}
		System.out.println("no loop detected: ");
	}

	/**
	 * 
	 */
	private void printTheLinkedListNode() {

		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();

	}

}
