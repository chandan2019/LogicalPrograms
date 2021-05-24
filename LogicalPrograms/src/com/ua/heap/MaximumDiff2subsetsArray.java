package com.ua.heap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class MaximumDiff2subsetsArray {

	public static void main(String[] args) {

		int ar[] = {1,3,2,5,4};
		System.out.println("enter size of subsets ");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		System.out.println(findMaximumDiff(ar, 4));
	}
	
	public static int findMaximumDiff(int[] ar,int m) {
		
		PriorityQueue<Integer> h = new PriorityQueue<>();
		
		int i = 0;
		while(i< ar.length) {
			
			h.add(ar[i]);
			if(h.size() > m) {
				h.poll();
			}
			i++;
		}
		 int sumSubset1  = 0;
		while(h.size()>0) {
			
			sumSubset1 += h.poll();
		}
		
		i = 0;
		while(i< ar.length) {
			
			h.add(ar[i]);
			i++;
		}
		
		i = 0;
		int sumSubset2 = 0;
		while(i<m) {
			
			sumSubset2 += h.poll(); 
			i++;
		}
		return sumSubset1 - sumSubset2;
	}

}
