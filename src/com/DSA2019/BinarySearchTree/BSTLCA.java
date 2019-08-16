/**
 * 
 */
package com.DSA2019.BinarySearchTree;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */
public class BSTLCA {

	BinarySearchTreeNode root;

	/**
	 * 
	 */
	public BSTLCA() {
		root = null;
	}

	public static void main(String[] args) {

		BSTLCA tree = new BSTLCA();
		tree.root = new BinarySearchTreeNode(20);
		tree.root.left = new BinarySearchTreeNode(8);
		tree.root.right = new BinarySearchTreeNode(22);
		tree.root.left.left = new BinarySearchTreeNode(4);
		tree.root.left.right = new BinarySearchTreeNode(12);
		tree.root.left.right.left = new BinarySearchTreeNode(10);
		tree.root.left.right.right = new BinarySearchTreeNode(14);

		int n1 = 10, n2 = 14;
		BinarySearchTreeNode temp = lca(tree.root, n1, n2);
		System.out.println("LCA of " + n1 + " and " + n2 + " is " + temp.data); 

		n1 = 14; 
        n2 = 8;
		BinarySearchTreeNode temp1 = lca(tree.root, n1, n2);
		System.out.println("LCA of " + n1 + " and " + n2 + " is " + temp1.data); 
		
		n1 = 10; 
        n2 = 22; 
		BinarySearchTreeNode temp2 = lca(tree.root, n1, n2);
		System.out.println("LCA of " + n1 + " and " + n2 + " is " + temp2.data); 

	}

	/**
	 * @param root
	 * @param n1
	 * @param n2
	 * @return
	 */
	private static BinarySearchTreeNode lca(BinarySearchTreeNode root, int n1, int n2) {
		if (root == null)
			return root;

		if (root.data > n1 && root.data > n2) {
			return lca(root.left, n1, n2);
		}

		if (root.data < n1 && root.data < n2) {
			return lca(root.right, n1, n2);
		}

		return root;
	}

}
