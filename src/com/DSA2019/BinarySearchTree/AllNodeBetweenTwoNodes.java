/**
 * 
 */
package com.DSA2019.BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */
public class AllNodeBetweenTwoNodes {

	BinarySearchTreeNode root;

	public static void main(String[] args) {

		AllNodeBetweenTwoNodes tree = new AllNodeBetweenTwoNodes();

		tree.root = new BinarySearchTreeNode(20);
		tree.root.left = new BinarySearchTreeNode(8);
		tree.root.right = new BinarySearchTreeNode(22);
		tree.root.left.left = new BinarySearchTreeNode(4);
		tree.root.left.right = new BinarySearchTreeNode(12);
		tree.root.left.right.left = new BinarySearchTreeNode(10);
		tree.root.left.right.right = new BinarySearchTreeNode(14);

		tree.RangePrint(tree.root, 10, 22);

	}

	/**
	 * @param root2
	 * @param i
	 * @param j
	 */
	private void RangePrint(BinarySearchTreeNode root, int k1, int k2) {

//		BinarySearchTreeNode temp;
//		Queue<BinarySearchTreeNode> queue = new LinkedList<BinarySearchTreeNode>();
//		if (root == null) {
//			return;
//		}
//		queue.add(root);
//		while (!queue.isEmpty()) {
//			temp = queue.poll();
//			if (temp.data >= k1 && temp.data <= k2) {
//                   System.out.println(temp.data);
//			}
//			
//			if(temp.left!=null && temp.data>=k1) {
//				queue.add(temp.left);
//			}
//			
//			if(temp.right!=null && temp.data<=k2) {
//				queue.add(temp.right);
//			}
//			
//		}

		
		//not sure about this solution..
		if (root == null) {
			return;
		}

		if (root.data >= k1) {
			RangePrint(root.left, k1, k2);
		}
		if (root.data >= k1 && root.data <= k2) {
			System.out.println(root.data);
		}

		if (root.data <= k2) {
			RangePrint(root.right, k1, k2);
		}

	}

}
