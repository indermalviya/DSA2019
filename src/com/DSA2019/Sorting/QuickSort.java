/**
 * 
 */
package com.DSA2019.Sorting;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 * 
 *         Runtime complexity: O(nlogn) in average and O(n2) worst
 */
public class QuickSort {
	public static void main(String[] args) {

		QuickSort qs = new QuickSort();
		qs.doTheQuickSort();

	}

	/**
	 * 
	 */
	private void doTheQuickSort() {
		// int[] A = new int[] { 7, 6, 10, 5, 9, 2, 1, 15, 7 };
		int[] A = new int[] { 12, 13, 24, 10, 3, 6, 90, 70 };
		System.out.println("Before sorting using quicksort..");
		for (int a : A) {
			System.out.print(a + " ");
		}
		System.out.println();
		quickSort(A, 0, A.length - 1);
		System.out.println("After sorting using quicksort..");
		for (int a : A) {
			System.out.print(a + " ");
		}
	}

	/**
	 * @param a
	 * @param i
	 * @param length
	 */
	private void quickSort(int[] a, int lb, int ub) {

		if (lb < ub) {
			int loc = partition(a, lb, ub);
			quickSort(a, lb, loc - 1);
			quickSort(a, loc + 1, ub);
		}

	}

	/**
	 * @param a
	 * @param lb
	 * @param ub
	 * @return
	 */
	private int partition(int[] a, int lb, int ub) {

		int pivot = a[lb];
		int start = lb;
		int end = ub;

		while (start < end) {
			while (a[start] <= pivot) {
				start++;
				if (start > end) {
					break;
				}
			}

			while (a[end] > pivot) {
				end--;
			}

			if (start < end) {
				swap(a, start, end);
			}

		}
		swap(a, lb, end);

		return end;
	}

	/**
	 * @param a
	 * @param start
	 * @param end
	 */
	private void swap(int[] a, int start, int end) {

		int temp = a[start];
		a[start] = a[end];
		a[end] = temp;

	}
}
