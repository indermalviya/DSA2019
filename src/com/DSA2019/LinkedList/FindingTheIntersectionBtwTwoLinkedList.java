/**
 * 
 */
package com.DSA2019.LinkedList;

import java.awt.List;

import com.DSA2019.LinkedList.LinkedList.LinkedListNode;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */
public class FindingTheIntersectionBtwTwoLinkedList {

	LinkedListNode head1, head2;

	static class LinkedListNode {

		int data;
		LinkedListNode next;

		public LinkedListNode(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public static void main(String[] args) {
		FindingTheIntersectionBtwTwoLinkedList list = new FindingTheIntersectionBtwTwoLinkedList();
		// creating first linked list
		list.head1 = new LinkedListNode(3);
		list.head1.next = new LinkedListNode(6);
		list.head1.next.next = new LinkedListNode(15);
		list.head1.next.next.next = new LinkedListNode(15);
		list.head1.next.next.next.next = new LinkedListNode(30);

		// creating second linked list
		list.head2 = new LinkedListNode(10);
		list.head2.next = new LinkedListNode(15);
		list.head2.next.next = new LinkedListNode(30);

		int intersectingNode = list.getNode(list.head1, list.head2);
		if(intersectingNode!=-1) {
			System.out.println("Intersecting Node in the two given linkedList is : " + intersectingNode);
		}
		else {
			System.out.println("these linkedlist are not intersecting....");
		}

	}

	/**
	 * @param head12
	 * @param head22
	 * @return
	 */
	private int getNode(LinkedListNode head1, LinkedListNode head2) {

		LinkedListNode list1 = head1;
		LinkedListNode list2 = head2;
		int node = 0;
		int sizeOfList1 = getSize(list1);
		int sizeOfList2 = getSize(list2);
		int d = 0;
		if (sizeOfList1 > sizeOfList2) {
			d = sizeOfList1 - sizeOfList2;
			return node = getIntersectingNode(d, list1, list2);
		} else {
			d = sizeOfList2 - sizeOfList1;
			return node = getIntersectingNode(d, list2, list1);
		}
	}

	/**
	 * @param d
	 * @param list1
	 * @param list2
	 * @return
	 */
	private int getIntersectingNode(int d, LinkedListNode list1, LinkedListNode list2) {
		int i;
		LinkedListNode cur1 = list1;
		LinkedListNode cur2 = list2;
		for (i = 0; i < d; i++) {
			if (cur1 == null) {
				return -1;
			}
			cur1 = cur1.next;
		}

		while (cur1 != null && cur2 != null) {
			if (cur1.data == cur2.data) {
				return cur1.data;
			}
			cur1 = cur1.next;
			cur2 = cur2.next;
		}

		return -1;
	}

	/**
	 * @param list1
	 * @return
	 */
	private int getSize(LinkedListNode list1) {
		int count = 0;
		while (list1 != null) {
			count++;
			list1 = list1.next;
		}
		return count;
	}

}
