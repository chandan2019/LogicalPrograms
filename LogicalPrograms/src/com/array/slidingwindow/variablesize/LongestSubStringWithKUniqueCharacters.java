package com.array.slidingwindow.variablesize;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithKUniqueCharacters {

	public static void main(String[] args) {

		//in varible size window , determining the condition is most important as we will not given unlike variable size.
		// like here K unique characters condition , we will be taking a hashmap and its size will be our condition.
		
		String s = "aabacbebebe";
		int k = 3;
		
		int longestStringWithKuniqueChar = longestStringWithKuniqueChar(s, k);
		System.out.println("longestStringWithKuniqueChar " + longestStringWithKuniqueChar);
	}
	
	public static int longestStringWithKuniqueChar(String s, int k) {
		
		int i = 0;
		int j = 0;
		int max = Integer.MIN_VALUE;
		
		Map<Character, Integer> map = new HashMap<>();
		
		while(j<s.length()) {
			map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0)+1);  //calculation
			
			if(map.size()<k) {
				j++;
			}else if(map.size() == k) {
				
				max = Math.max(max, j-i+1);//getting result from calculation
				//System.out.println(i+ "  "+ j+ "    " + s.substring(i,j+1)); to return the string as output we have to go for 
				//O(n) space in window slide case as well
				j++;
				
			}else if(map.size() > k) {
				
				while(map.size()>k) {
					
					map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)-1); //removing previous calculation
					if(map.get(s.charAt(i)) == 0)
						map.remove(s.charAt(i));
					i++;
					
				}
				j++;
			}
			
		}
		
		return max;
		
	} 

}
