/**
 * 
 */
package com.DSA2019.LinkedList;

/**
 * @author Atul Sharma
 *
 */
public class DeleteNthLastNodeInLinkedList {

	LinkedListNode head;
	int lengthOfLinkedlist=0;

	static class LinkedListNode {

		int data;
		LinkedListNode next;

		public LinkedListNode(int data) {
			this.data = data;
			this.next = null;
		}

	}
	
	public static void main(String[] args) {
		
		DeleteNthLastNodeInLinkedList del=new DeleteNthLastNodeInLinkedList();
		del.head=new LinkedListNode(1);
		del.head.next=new LinkedListNode(2);
		del.head.next.next=new LinkedListNode(3);
		del.head.next.next.next=new LinkedListNode(4);
		del.head.next.next.next.next=new LinkedListNode(5);
		del.head.next.next.next.next.next=new LinkedListNode(6);
		
		System.out.println("linkedlist nodes ");
		
		del.printLinkedListNode();
		System.out.println();
		System.out.println("now, printing the Nth node from the last of the linkedlist ");
		del.nthNodeFromLastOfLinkedList(3);
	}

	/**
	 * @param i 
	 * 
	 */
	private void nthNodeFromLastOfLinkedList(int i) {
		System.out.println("have to remove : " + i +"th node from the last of the linkedlist");
		LinkedListNode tem=head;
		int nodeToPrint=lengthOfLinkedlist-i+1;
		int count=0;
		while(tem!=null) {
			count++;
			if(count==nodeToPrint) {
				System.out.println(tem.data+" ");
			}
			tem=tem.next;
		}
		
		
	}

	/**
	 * 
	 */
	private void printLinkedListNode() {
		
		LinkedListNode temp=head;
		
		while(temp!=null) {
			System.out.print(temp.data+ " " );
			lengthOfLinkedlist++;
			temp=temp.next;
		}
		
	}

}
