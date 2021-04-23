package com.array.slidingwindow.variablesize;

public class LargestSubarrayOfSumK {

	public static void main(String[] args) {

		int[] ar = new int[] { 4, 1, 1, 2, 3, 5 };

		int subArraySumK = subArraySumK(ar, 5);
		System.out.println("subArraySumK " + subArraySumK);

	}

	public static int subArraySumK(int[] ar, int sum) {

		int i = 0;
		int j = 0;
		int ksum = 0;
		int maxlenght = Integer.MIN_VALUE;
		while (j < ar.length) {

			ksum += ar[j];
			if (ksum < sum) {
				j++;

			} else if (ksum == sum) {
				maxlenght = Math.max(maxlenght, j - i + 1);
				j++;

			} else if (ksum > sum) {
				while (ksum > sum) {

					ksum = ksum - ar[i];
					i++;
				}
				j++;

			}

		}
		return maxlenght;

	}

}
