/**
 * 
 */
package com.DSA2019.Tree;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */
public class HeightOfBinaryTree {

	BinaryTreeNode root;

	public static void main(String[] args) {

		HeightOfBinaryTree btt = new HeightOfBinaryTree();

		btt.root = new BinaryTreeNode(1);
		btt.root.left = new BinaryTreeNode(2);
		btt.root.right = new BinaryTreeNode(3);
		btt.root.left.left = new BinaryTreeNode(4);
		btt.root.left.right = new BinaryTreeNode(5);
		btt.root.right.left = new BinaryTreeNode(6);
		btt.root.right.right = new BinaryTreeNode(7);
		int maxDepth = maxDepthOfBinaryTree(btt.root);
		System.out.println("max depth of Binary tree : " + maxDepth);
	}

	/**
	 * @param root2
	 * @return
	 */
	private static int maxDepthOfBinaryTree(BinaryTreeNode root) {

		if (root == null) {
			return 0;
		}

		int leftDepth = maxDepthOfBinaryTree(root.left);
		int rightDepth = maxDepthOfBinaryTree(root.right);

		if (leftDepth > rightDepth) {
			return leftDepth + 1;
		} else {
			return rightDepth + 1;
		}

	}

}
