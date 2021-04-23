package com.array;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class FindKthLargestElement {

	public static void main(String[] args) {
		
		//int[] nums = new int[]{3,2,3,1,2,4,5,5,6};
		
		//int[] nums = new int[]{99,99};
		
		int nums[] = new int[] {3,3,3,3,4,3,3,3,3};
		
		int  t = 1;

		
		System.out.println(searchKthLargest(nums, t));
	
		
		
	}
	
	
	public static int searchKthLargest(int[] nums, int t ) {
		
		  Map<Integer,Integer> map = new TreeMap<>(Collections.reverseOrder());
	        
	        for(int i= 0;i<nums.length; i++){
	            
	            
	            if(!map.containsKey(nums[i])){
	                
	                map.put(nums[i], 1);
	            }else{
	                
	                map.put(nums[i], map.get(nums[i])+1);
	                
	            }
	        }
		
		
		
		//int[] ar = new int[] {2};
		
		//map.forEach((k,v)-> System.out.println("k " + k + ", " + "v " + v));
	
		
		
			
			
			
		int sum = 0;
		for(Map.Entry<Integer, Integer> entryMap : map.entrySet() ) {
			
			if(map.entrySet().size() == 1)
				return entryMap.getKey();
			
			
			sum = sum + entryMap.getValue();
			
			if(sum ==  t) {

				sum =  entryMap.getKey();
				return sum;
			}
			
		}
		
		return -1;
		
	}

}
