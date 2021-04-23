package com.array.slidingwindow.variablesize;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeatingCharacter {

	public static void main(String[] args) {

			//in varible size window , determining the condition is most important as we will not given unlike variable size.
			// like here K unique characters condition , we will be taking a hashmap and its size will be our condition.
		
		//all unique characters condition is when map.size() == j-i+1(window size), so here comparing condition is current/ongoing windowsize.
			
			String s = "aabacbebebe";
			
			int longestStringWithAlluniqueChar = longestStringWithAlluniqueChar(s);
			System.out.println("longestStringWithAlluniqueChar " + longestStringWithAlluniqueChar);

		
	}
		
		public static int longestStringWithAlluniqueChar(String s) {
			
			int i = 0;
			int j = 0;
			int max = Integer.MIN_VALUE;
			
			Map<Character, Integer> map = new HashMap<>();
			
			while(j<s.length()) {
				map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0)+1);  //calculation
				
				if(map.size()>j-i+1) {
					j++;
				}else if(map.size() == j-i+1) {
					
					max = Math.max(max, j-i+1);//getting result from calculation
					j++;
					
				}else if(map.size() < j-i+1) {
					
					while(map.size() < j-i+1) {
						
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
