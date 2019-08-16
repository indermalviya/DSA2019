/**
 * 
 */
package com.DSA2019.BinarySearchTree;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */
public class BinarySearchTreeNode {

	int data;
	BinarySearchTreeNode left;
	BinarySearchTreeNode right;

	public BinarySearchTreeNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public BinarySearchTreeNode getLeft() {
		return left;
	}

	public void setLeft(BinarySearchTreeNode left) {
		this.left = left;
	}

	public BinarySearchTreeNode getRight() {
		return right;
	}

	public void setRight(BinarySearchTreeNode right) {
		this.right = right;
	}

}
