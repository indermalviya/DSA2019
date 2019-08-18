/**
 * 
 */
package com.DSA2019.Sorting;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */
public class BubbleSort {
	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		bs.doTheBubble();

	}

	/**
	 * 
	 */
	private void doTheBubble() {
		int[] A = new int[] { 12, 13, 24, 10, 3, 6, 90, 70 };
	//	int[] A = new int[] { 1,2,3,4,5,6,7,8,9};
		System.out.println("Before sorting using BubbleSort..");
		for (int a : A) {
			System.out.print(a + " ");
		}
		System.out.println();
		doBubble(A);
		System.out.println("After sorting using BubbleSort..");
		for (int a : A) {
			System.out.print(a + " ");
		}

	}

	/**
	 * @param a
	 */
	private void doBubble(int[] a) {
		int n = a.length;
		boolean swapped;
		for (int i = 0; i < n - 1; i++) {
			swapped = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					swapped = true;
				}
			}
			if (swapped = false) {
				break;
			}
		}

	}

}
