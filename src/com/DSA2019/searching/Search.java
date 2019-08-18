/**
 * 
 */
package com.DSA2019.searching;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */
public class Search {

	public static void main(String[] args) {
		Search search = new Search();
		search.doTheSearch();
	}

	/**
	 * 
	 */
	private void doTheSearch() {

		int arr[] = { 2, 3, 4, 10, 40 };
		int numToSearch = 50;
		boolean valuePresent = doTheLinearSearch(arr, numToSearch);
		System.out.println("For linear search value  is present in the array ? : " + valuePresent);
		int arr1[] = { 2, 3, 4, 10, 40 };
		// binary search on the sorted array
		boolean valuePresent1 = doTheBinarySearch(arr1, 0, numToSearch);
		System.out.println("For Binary search value  is present in the array ? : " + valuePresent1);

	}

	/**
	 * @param arr
	 * @param i
	 * @param numToSearch
	 * @return
	 */
	private boolean doTheBinarySearch(int[] arr, int start, int numToSearch) {

		int end = arr.length - 1;
		while (start <= end) {

			int mid = (start + end) / 2;
			if (numToSearch == arr[mid]) {
				return true;
			}
			if (numToSearch < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return false;
	}

	/**
	 * @param arr
	 * @param numToSearch
	 * @return
	 */
	private boolean doTheLinearSearch(int[] arr, int numToSearch) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == numToSearch) {
				return true;
			}
		}
		return false;
	}
}
