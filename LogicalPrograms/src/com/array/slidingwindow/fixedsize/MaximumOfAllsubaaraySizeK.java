package com.array.slidingwindow.fixedsize;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MaximumOfAllsubaaraySizeK {
	
	public static void main(String[] args) {
		
		int a[] = {2,5,1,-8,2,9};
		int[] findSubArrayMaxSum = findSubArrayMax(a, 3);
		
		Arrays.stream(findSubArrayMaxSum).forEach(System.out::println);
	}
	
	public static int[] findSubArrayMax(int[] a, int k) {
		
		int i = 0,j = 0;
		int l = 0;
		int n = a.length;
		int[]  result = new int[n-k+1]; 
		Queue<Integer> q = new LinkedList<Integer>();
				
		
		
		while(j<a.length) {
			
			q.add(a[j]);
			
			while(!q.isEmpty() && q.peek()<a[j]) { // doing calculation, putting elements in queue
				//and removing previous elements which are smaller than incoming element in from array to queue
				
				q.poll();
			}
			
			if( j-i+1<k) {
				j++;
				
			}else if(j-i+1 == k) {
				
				result[l++] = q.peek();// finding result from calculation
				
				if(a[i] == q.peek()) //removing the previous calculation
					 q.poll();
				
				j++;
				i++;
			}
			
		}
		
		return result;
	}

}
