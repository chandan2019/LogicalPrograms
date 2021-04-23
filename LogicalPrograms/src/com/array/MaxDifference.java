package com.array;

public class MaxDifference {

	public static void main(String[] args) {

		int ar[] = new int[] { 2, 4, 8, 7, 7, 9, 3 };
		/*
		 * Input : arr[] = {2, 1, 8} Input : arr[] = {2, 4, 8, 7, 7, 9, 3} Input : arr[]
		 * = {5, 1, 9, 2, 5, 1, 7}
		 */

		System.out.println(findMax(ar));

		System.out.println(maxDiff(ar, 7));

	}

	public static int findMax(int[] ar) {
		int max = ar[0];
		int maxIndex = -1;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
				maxIndex = i;
			}
		}
		int min = ar[0];
		for (int i = 0; i < maxIndex; i++) {

			if (ar[i] < min) {
				min = ar[i];
			}
		}
		return max - min;
	}

	public static int maxDiff(int arr[], int arr_size) {
		int max_diff = arr[1] - arr[0];
		int min_element = arr[0];
		int i;
		for (i = 1; i < arr_size; i++) {
			if (arr[i] - min_element > max_diff)
				max_diff = arr[i] - min_element;
			if (arr[i] < min_element)
				min_element = arr[i];
		}
		return max_diff;
	}

}
