/**
 * 
 */
package com.DSA2019.LinkedList;

import java.util.HashSet;
import java.util.Set;

import com.DSA2019.LinkedList.LinkedListDuplicateRemovalFromSortedLinkedList.Node;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */
public class LinkedListDuplicateNodesRemovalFromUnsortedLinkedList {

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
		LinkedListDuplicateNodesRemovalFromUnsortedLinkedList ldnr = new LinkedListDuplicateNodesRemovalFromUnsortedLinkedList();
		ldnr.head = new Node(11);
		ldnr.head.next = new Node(13);
		ldnr.head.next.next = new Node(16);
		ldnr.head.next.next.next = new Node(12);
		ldnr.head.next.next.next.next = new Node(11);
		ldnr.head.next.next.next.next.next = new Node(19);
		System.out.println("Node in the linkedlist: ");
		ldnr.printlist();
		ldnr.removeDuplicates(ldnr.head);
		System.out.println();
		System.out.println("Node in the linkedlist after duplicate removal: ");
		ldnr.printlist();

	}

	/**
	 * 
	 */
	private void printlist() {
		Node currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}

	}

	/**
	 * @param head2
	 */
	// here we'll be removing the duplicate nodes from the linkedlist
	//using hashing, by using hashSet class.
	private void removeDuplicates(Node head) {
		Set<Integer> hset = new HashSet<Integer>();
		Node currentNode = head;
		Node prevNode = null;
		while (currentNode != null) {
			if (hset.contains(currentNode.data)) {
				prevNode.next = currentNode.next;
			} else {
				hset.add(currentNode.data);
				prevNode = currentNode;
			}
			currentNode = currentNode.next;
		}
	}

}
