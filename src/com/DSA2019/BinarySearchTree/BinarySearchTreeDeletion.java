/**
 * 
 */
package com.DSA2019.BinarySearchTree;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */
public class BinarySearchTreeDeletion {

	static BinarySearchTreeNode root;

	public BinarySearchTreeDeletion() {
		root = null;
	}

	public static void main(String[] args) {
		BinarySearchTreeDeletion tree = new BinarySearchTreeDeletion();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		System.out.println("Deleting node 20, which is a leaf node..");
		tree.deleteNode(20);
		tree.inOrder();
		System.out.println("Deleting node 30, which has one child..");
		tree.deleteNode(30);
		tree.inOrder();
		System.out.println("Deleting node 50, which has two child...");
		tree.deleteNode(50);
		tree.inOrder();
	}

	private void inOrder() {
		inOrderRec(root);

	}

	/**
	 * @param root
	 */
	private void inOrderRec(BinarySearchTreeNode root) {
		if (root == null) {
			return;
		}
		inOrderRec(root.left);
		System.out.println(root.data + " ");
		inOrderRec(root.right);
	}

	/**
	 * @param root2
	 * @param i
	 */
	private void deleteNode(int i) {
		root = deleteNodeVal(root, i);

	}

	/**
	 * @param root
	 * @param i
	 * @return
	 */
	private BinarySearchTreeNode deleteNodeVal(BinarySearchTreeNode root, int i) {
		if (root == null) {
			return root;
		}
		if (i < root.data) {
			root.setLeft(deleteNodeVal(root.left, i));
		} else if (i > root.data) {
			root.setRight(deleteNodeVal(root.right, i));
		} else {
			// element found to be deleted
			if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			}
			// find the minimum in the right subtree and store it in root.
			root.data = findMinInRightSubtree(root.right);
			root.setRight(deleteNodeVal(root.right, root.data));
		}

		return root;
	}

	/**
	 * @param right
	 * @return
	 */
	private int findMinInRightSubtree(BinarySearchTreeNode root) {
		int minV = root.data;
		while (root.left != null) {
			minV = root.left.data;
			root = root.left;
		}
		return minV;
	}

	/**
	 * @param i
	 */
	private void insert(int i) {
		root = insertRec(root, i);

	}

	/**
	 * @param root
	 * @param i
	 * @return
	 */
	private BinarySearchTreeNode insertRec(BinarySearchTreeNode root, int i) {

		if (root == null) {
			root = new BinarySearchTreeNode(i);
			return root;
		}

		else {
			if (root.data > i) {
				root.setLeft(insertRec(root.left, i));
			} else {
				root.setRight(insertRec(root.right, i));
			}
		}

		return root;

	}

}
