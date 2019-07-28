/**
 * 
 */
package com.DSA2019.Tree;

/**
 * @author Atul Sharma
 *
 * https://github.com/sourac
 */
public class BinaryTreeNode {

	int data;
	BinaryTreeNode left;
	BinaryTreeNode right;

	public BinaryTreeNode(int data) {
		this.data = data;
		this.right = null;
		this.left = null;
	}

	public int getData() {
		return data;
	}

	public BinaryTreeNode getLeft() {
		return left;
	}

	public BinaryTreeNode getRight() {
		return right;
	}

	public void setData(int data) {
		this.data = data;
	}

	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}

	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}

}
