/**
 * 
 */
package com.DSA2019.BinarySearchTree;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */
public class BinarySearchTreeBasicOperation {

	BinarySearchTreeNode root;

	public BinarySearchTreeBasicOperation() {
		root = null;
	}

	public static void main(String[] args) {
		BinarySearchTreeBasicOperation tree = new BinarySearchTreeBasicOperation();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		System.out.println("In order traversal : ");
		tree.inOrder();
		System.out.println("In Preorder traversal : ");
		tree.preOrder();
		System.out.println("PostOrder traversal : ");
		tree.postOrder();
	}

	/**
	 * 
	 */
	private void postOrder() {
		postOrder(root);
	}

	/**
	 * @param root
	 */
	private void postOrder(BinarySearchTreeNode root) {
		if (root == null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data);
	}

	/**
	 * 
	 */
	private void preOrder() {
		preOrderRec(root);

	}

	/**
	 * @param root
	 */
	private void preOrderRec(BinarySearchTreeNode root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data);
		preOrderRec(root.left);
		preOrderRec(root.right);
	}

	/**
	 * 
	 */
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
