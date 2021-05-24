package com.ua.heap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargest {

	public static void main(String[] args) {
		
		int[] ar = {2,6,3,8,9,1,12,4};
		System.out.println("Enter Kth element");
		Scanner s = new Scanner(System.in);
		int kth = s.nextInt();
		
		System.out.println(findKthLargest(ar, kth));

	}
	
	public static int findKthLargest(int[] ar,int k) {
		
		PriorityQueue<Integer> h = new PriorityQueue<>();
		
		int i = 0;
		while(i <ar.length) {
			h.add(ar[i]);
			
			if(h.size()>k) {
				h.poll();
			}
			i++;
		}
		
		return h.poll();
		
	}

}
