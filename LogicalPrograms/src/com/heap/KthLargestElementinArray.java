package com.heap;

import java.util.PriorityQueue;

public class KthLargestElementinArray {

	public static void main(String[] args) {

		
		int[] ar = new int[] {7,5,4,3,20,15};
		int k = 3;
		
		System.out.println(searchKthLargest(ar,k));
		
	}
	
	
	
	public static int searchKthLargest(int[] ar,int k) {
		
		// Creating empty priority queue 
        PriorityQueue<Integer> pQueue =  
             new PriorityQueue<Integer>(); 
        
        int i = 0;
        while(i<ar.length)
        {
        	
        	pQueue.add(ar[i]);
        
        	
        	if(pQueue.size()>k) {
        		pQueue.poll();
        	}
        	
        	i++;
        	
        }
		return pQueue.peek();
		
	}
	
	
	

}
