package com.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MaxElementProduct {

	public static void main(String[] args) {

		//int[] ar = new int[] { 7, 5, 4, 3, 20, 15 };
		int[] ar = new int[] { -3, 4, -4, 0 };
		int sum = 1;
		int grtr[] = new int[3];
		int l = 0;
		if(ar.length <3)
			System.out.println("0");
		for (int i = 1; i <= 3; i++) {

			int gr = searchKthLargest(ar, i);
			grtr[l] = gr;
			l++;
		}

		/*for (int i = 0; i < grtr.length; i++) {
			sum = sum * grtr[i];

		}
*/		
		
		//System.out.println(solve(ar));

	}

	public static int searchKthLargest(int[] ar, int k) {
		// Creating empty priority queue
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

		int i = 0;
		while (i < ar.length) {

			pQueue.add(ar[i]);

			if (pQueue.size() > k) {
				pQueue.poll();
			}

			i++;

		}
		return pQueue.peek();

	}
	
	public static int solve(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int leftProduct = nums[0] * nums[1] * nums[n - 1];
        int rightProduct = nums[n - 1] * nums[n - 2] * nums[n - 3];
        return Math.max(leftProduct, rightProduct);
    }

}
