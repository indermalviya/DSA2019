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
public class BinarytreeTraversals {

	BinaryTreeNode root;

	public static void main(String[] args) {

		BinarytreeTraversals btt = new BinarytreeTraversals();
		btt.root = new BinaryTreeNode(1);
		btt.root.left = new BinaryTreeNode(2);
		btt.root.right = new BinaryTreeNode(3);
		btt.root.left.left = new BinaryTreeNode(4);
		btt.root.left.right = new BinaryTreeNode(5);
		btt.root.right.left = new BinaryTreeNode(6);
		btt.root.right.right = new BinaryTreeNode(7);

		System.out.println("PreOrder tree traversal ");
		btt.preOrderTraversal(btt.root);
		System.out.println();
		System.out.println("PostOrder tree traversal ");
		btt.postOrderTraversal(btt.root);
		System.out.println();
		System.out.println("InOrder tree traversal ");
		btt.inOrderTraversal(btt.root);
		System.out.println();
		System.out.println("LevelOrder tree traversal ");
		btt.levelOrderTraversal(btt.root);

	}

	/**
	 * @param root
	 */
	private void levelOrderTraversal(BinaryTreeNode root) {
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		if (root != null) {
			queue.add(root);
		} else {
			return;
		}

		while (!queue.isEmpty()) {
			BinaryTreeNode temp = queue.poll();
			System.out.print(temp.data + " ");
			if (temp.left != null) {
				queue.add(temp.left);
			}
			if (temp.right != null) {
				queue.add(temp.right);
			}
		}
	}

	/**
	 * @param root
	 */
	private void inOrderTraversal(BinaryTreeNode root) {
		if (root != null) {
			inOrderTraversal(root.left);
			System.out.print(root.data + " ");
			inOrderTraversal(root.right);
		}

	}

	/**
	 * @param root
	 */
	private void postOrderTraversal(BinaryTreeNode root) {
		if (root != null) {
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			System.out.print(root.data + " ");
		}
	}

	/**
	 * @param root
	 */
	private void preOrderTraversal(BinaryTreeNode root) {
		if (root != null) {
			System.out.print(root.data + " ");
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
	}

}
