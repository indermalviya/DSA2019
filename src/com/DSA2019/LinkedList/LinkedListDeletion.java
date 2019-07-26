package com.DSA2019.LinkedList;

import com.DSA2019.LinkedList.LinkedList.LinkedListNode;

public class LinkedListDeletion {

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

		LinkedListDeletion lld = new LinkedListDeletion();
		lld.head = new LinkedListNode(1);
		lld.head.next = new LinkedListNode(2);
		lld.head.next.next = new LinkedListNode(3);
		lld.head.next.next.next = new LinkedListNode(4);

		System.out.println("Element in the linkedlist : ");
		lld.printLinkedListNodes();

		System.out.println("now will delete a node from the linkedlist : ");
		lld.deleteNode(3);

		System.out.println("Linkedlist After deleting node : ");
		lld.printLinkedListNodes();
		System.out.println();

		System.out.println("Delete the whole linkedlist: ");
		lld.deleteWholeLinkedList();
		lld.printLinkedListNodes();

	}

	/**
	 * 
	 */
	private void deleteWholeLinkedList() {
		head = null;
	}

	// delete a specific node in linkedlist
	private void deleteNode(int i) {

		// store the head in a temp node
		LinkedListNode headNode = head;
		LinkedListNode prevNode = null;
		// if the head node is the node to be deleted just assign next element of head
		// as the head.
		if (headNode != null && headNode.data == i) {
			head = headNode.next;
			return;
		}

		// keep track of the previous node
		while (headNode != null && headNode.data != i) {
			prevNode = headNode;
			headNode = headNode.next;
		}

		// if the key is not present in the key
		if (headNode == null)
			return;

		// unlink the node from the linkedlist
		prevNode.next = headNode.next;

	}

	private void printLinkedListNodes() {

		LinkedListNode temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

}
