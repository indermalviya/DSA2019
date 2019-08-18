/**
 * 
 */
package com.DSA2019.Sorting;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */
public class FindThePair {

	public static void main(String[] args) {
		FindThePair ftp = new FindThePair();
		ftp.doThePairSearch();

	}

	/**
	 * 
	 */
	private void doThePairSearch() {
		int arr[] = { 1, 8, 30, 40, 100 };
		int n = 60;
		findThePair(arr, n);

	}

	/**
	 * @param arr
	 * @param n
	 */
	private void findThePair(int[] arr, int n) {

		int len = arr.length;
		boolean val = false;
		for (int i = 0; i < len - 1; i++) {
			for(int j=i+1;j<=len-1;j++) {
				if ((Math.abs(arr[i] - arr[j]) == n)) {
					val=true;
					System.out.println("Pair found: "+arr[i]+","+arr[j]);
				}
			}
		}
		if (val == false) {
			System.out.println("Pair not found..");
		}

	}

}
