package com.DSA2019.Queue;

class ListNode {

	public int data;
	public ListNode nextNode;

	public ListNode(int data) {
		this.data = data;
		this.nextNode = null;
	}

}

class ListQueue {

	private int lenthOfQueue;
	private ListNode front, rear;

	// intialize the queue with the size of zero and assign null to the front and
	// rear end.
	ListQueue() {
		this.lenthOfQueue = 0;
		front = rear = null;
	}

	//inserting a item in Queue
	public void enQueue(int data) {
		ListNode node = new ListNode(data);
		if (isEmpty()) {
			// i.e the queue is empty the insertion can be done
			front = node;
			rear=node;
			lenthOfQueue++;

		}
		else {
			rear.nextNode = node;
			rear = node;
			lenthOfQueue++;
		}
	}
	//removing the item from the front of the Queue
	public int deQueue() {
	
		if(isEmpty()) {
			try {
				throw new Exception("Queue already empty");
			} catch (java.lang.Exception e) {
				e.printStackTrace();
			}
		}
		
		int value=front.data;
		front=front.nextNode;
		System.out.println("value dequeued is : "  + value);
		lenthOfQueue--;
		
		return value;
	}
	
	private boolean isEmpty() {
		return (lenthOfQueue == 0);
	}

}

public class QueueImplementationUsingLinkdedList {
	public static void main(String[] args) {
		ListQueue q=new ListQueue();
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		q.deQueue();
		q.deQueue();
		q.deQueue();
		q.deQueue();
		q.deQueue();
		ListQueue lq=new ListQueue();

	}

}
