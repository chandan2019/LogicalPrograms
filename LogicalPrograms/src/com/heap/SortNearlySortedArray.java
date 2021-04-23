package com.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class SortNearlySortedArray {

	public static void main(String[] args) {

		
		int arr[] = {6, 5, 3, 2, 8, 10, 9};
		int k = 3;
		
		int[] sortKNearlySorted = sortKNearlySorted(arr, k);
		Arrays.stream(sortKNearlySorted).forEach(System.out::println);
		
		
	}
	
	public static int [] sortKNearlySorted(int arr[], int k) {
		
		PriorityQueue<Integer> q  = new PriorityQueue<Integer>();
		int result[] = new int[arr.length];
		int j = 0;
		for(int i=0;i<arr.length;i++) {
			
			q.add(arr[i]);
			if(q.size() > k) {
				result[j++] = q.poll();
			}
		}
		
		while(q.size()>0) {
			result[j++] = q.poll();
		}
		return result;
	}

}
