/**
 * 
 */
package com.DSA2019.Tree;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */
public class LCAInBinaryTree {

	BinaryTreeNode root;

	public static void main(String[] args) {
		LCAInBinaryTree btt = new LCAInBinaryTree();
		btt.root = new BinaryTreeNode(1);
		btt.root.left = new BinaryTreeNode(2);
		btt.root.right = new BinaryTreeNode(3);
		btt.root.left.left = new BinaryTreeNode(4);
		btt.root.left.right = new BinaryTreeNode(5);
		btt.root.right.left = new BinaryTreeNode(6);
		btt.root.right.right = new BinaryTreeNode(7);
		// root,4,6 --> lca=1
		BinaryTreeNode lca = btt.findLCA(btt.root, btt.root.left.left, btt.root.right.left);
		System.out.println("Least common ancestor is : " + lca.data);

	}

	/**
	 * @param root
	 * @param a
	 * @param b
	 * @return
	 */
	private BinaryTreeNode findLCA(BinaryTreeNode root, BinaryTreeNode a, BinaryTreeNode b) {

		if (root == null)
			return null;

		if (root == a || root == b) {
			return root;
		}

		BinaryTreeNode left_lca = findLCA(root.left, a, b);
		BinaryTreeNode right_lca = findLCA(root.right, a, b);

		if (left_lca != null && right_lca != null) {
			return root;
		}
		return (left_lca != null ? left_lca : right_lca);
	}
}
