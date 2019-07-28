/**
 * 
 */
package com.DSA2019.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */
public class FindingMaxInBinaryTree {

	BinaryTreeNode root;

	public static void main(String[] args) {
		FindingMaxInBinaryTree btt = new FindingMaxInBinaryTree();
		btt.root = new BinaryTreeNode(1);
		btt.root.left = new BinaryTreeNode(2);
		btt.root.right = new BinaryTreeNode(3);
		btt.root.left.left = new BinaryTreeNode(4);
		btt.root.left.right = new BinaryTreeNode(5);
		btt.root.right.left = new BinaryTreeNode(6);
		btt.root.right.right = new BinaryTreeNode(7);
		int max = btt.findMaxInBinaryTreeUsingRecursion(btt.root);
		System.out.println("Max in binary tree : " + max);
		int max2 = btt.findMaxInBinaryTreeUsingLevelOrderTraversal(btt.root);
		System.out.println("Max in binary tree : " + max2);
	}

	/**
	 * @param root
	 * @return
	 */
	private int findMaxInBinaryTreeUsingLevelOrderTraversal(BinaryTreeNode root) {
		if (root == null)
			return Integer.MIN_VALUE;

		int max = Integer.MIN_VALUE;
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.add(root);

		while (!queue.isEmpty()) {
			BinaryTreeNode value = queue.poll();
			if (value.data > max) {
				max = value.data;
			}
			if (value.left != null) {
				queue.add(value.left);
			}
			if (value.right != null) {
				queue.add(value.right);
			}
		}

		return max;
	}

	/**
	 * @param root
	 * @return
	 */
	private int findMaxInBinaryTreeUsingRecursion(BinaryTreeNode root) {

		if (root == null) {
			return Integer.MIN_VALUE;
		}

		int maxValue = root.data;
		if (root != null) {
			int leftMax = findMaxInBinaryTreeUsingRecursion(root.left);
			int rightMax = findMaxInBinaryTreeUsingRecursion(root.right);

			if (leftMax > maxValue) {
				maxValue = leftMax;
			}
			if (rightMax > maxValue) {
				maxValue = rightMax;
			}

			if (root.data > maxValue)
				return maxValue = root.data;

		}
		return maxValue;
	}

}
