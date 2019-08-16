/**
 * 
 */
package com.DSA2019.BinarySearchTree;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */
public class CheckISBST {
	BinarySearchTreeNode root;

	public CheckISBST() {
		root = null;
	}

	public static void main(String[] args) {
		CheckISBST tree = new CheckISBST();

		tree.root = new BinarySearchTreeNode(20);
		tree.root.left = new BinarySearchTreeNode(8);
		tree.root.right = new BinarySearchTreeNode(22);
		tree.root.left.left = new BinarySearchTreeNode(4);
		tree.root.left.right = new BinarySearchTreeNode(12);
		tree.root.left.right.left = new BinarySearchTreeNode(10);
		tree.root.left.right.right = new BinarySearchTreeNode(14);

		Boolean val = isBST(tree.root);
		System.out.println("whether Tree is bst or not : " + val);
	}

	/**
	 * @param root
	 * @return
	 */
	private static Boolean isBST(BinarySearchTreeNode root) {

		if (root == null) {
			return true;
		}

		if (root.left != null && findMax(root.left) > root.data) {
			return false;
		}
		if (root.right != null && findMax(root.right) < root.data) {
			return false;
		}

		if (!isBST(root.left) || !isBST(root.right)) {
			return false;
		}

		return true;
	}

	/**
	 * @param root
	 * @return
	 */
	private static int findMax(BinarySearchTreeNode root) {
		
		if(root==null) {
			return 0;
		}
		
		else {
			if(root.right==null) {
				return root.data;
			}
			else return findMax(root.right);
		}
	}

}
