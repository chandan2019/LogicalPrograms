package com.array.slidingwindow.fixedsize;

import java.util.HashMap;
import java.util.Map;

public class CountOccurencesOfAnagrams {

	public static void main(String[] args) {

		String s = "aabaaebaa";
		String pattern = "aaba";
		
		int findOccurence = findOccurence(s, pattern);
		System.out.println("findOccurence " + findOccurence);
		
	}
	
	public static int findOccurence(String s, String pattern) {
		
		
		int i = 0, j=0;
		
		Map<Character, Integer> map = new HashMap<>();
		int count = 0;
		int resultCount = 0;
		int k = pattern.length();
		
			while(j<pattern.length()) {
						
						
						map.put(pattern.charAt(j), map.getOrDefault(pattern.charAt(j), 0) + 1);
						count = map.size();
						j++;
			}
			j = 0;
		
		while(j<s.length()) {
			
			map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) - 1);
			
			if(map.get(s.charAt(j)) == 0) {
				count--;
			}

			if(j-i+1<k) {
				j++;
			}else if(j-i+1 == k) {
				
				if(count == 0)//calculating the result
					resultCount++;
				map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
				if(map.get(s.charAt(i)) == 1) {
					count++;
				}
				j++;
				i++;
				
			}
			
		}
		
		return resultCount;
		
	} 

}
