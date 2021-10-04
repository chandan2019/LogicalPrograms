package com.array;

import java.util.ArrayList;
import java.util.List;

public class TestPython {

	public static void main(String[] args) {

		
		String s = "hellouppqrstuab";
		String findLongest = findLongestSubstringInAlphabeticalOrder(s);
		System.out.println("longest alphabetical order string: " + findLongest);
		System.out.println();
		String longestSubstringWithAllUniqueCharacter = findLongestSubstringWithUniqueCharacter(s);
		System.out.println("longest substring with all unique character : " + longestSubstringWithAllUniqueCharacter);
	}
	
	public static String findLongestSubstringWithUniqueCharacter(String s) {
		//TC : O(n);
		//SC : O(n);
		// For SC : O(1), need to follow Sliding window, but have to find way of returning string in that case,
		//as SW(single window) approach only returning length, not the string.   
		
		System.out.println("Longest substring with unique character");
		List<String> list = new ArrayList<>(); 
		
		StringBuilder s1= new StringBuilder();
		s1.append(s.charAt(0));
		
		for(int i = 1; i<s.length(); i++) {
			
			if(s1.toString().contains(String.valueOf(s.charAt(i)))) {
				list.add(s1.substring(0));
				s1.delete(0, i);
				s1.append(s.charAt(i));
			}else {
				
				s1.append(s.charAt(i));
			}
			
		}
		list.add(s1.toString());
		
		String largest = null;
		int max = Integer.MIN_VALUE;
	
		for(String a : list) {
			if(a.length()> max) {
				max = a.length();
				largest = a;
			}
		}
		
		return largest;
		
	}
	
	public static String findLongestSubstringInAlphabeticalOrder(String s) {
		
		/*char[] c = new char[26];
		int a = 97;
		for(int i = 0;i<25;i++) {
			c[i] = (char)a++; 
		}
		
		for(int i = 0;i<25;i++) {
			System.out.println(c[i]);
		}*/
		
	List<String> list = new ArrayList<>();
	StringBuilder s1 = new StringBuilder(s.charAt(0));
	s1.append(s.charAt(0))/*.append(s.charAt(1)).delete(0, 1)*/;
	
		/*int c = (int)s.charAt(0);
		System.out.println(c);*/
		
	for(int i = 1; i< s.length();i++) {//hello
			if((int)s.charAt(i) >= (int)s.charAt(i-1)) {
				s1.append(s.charAt(i));
			}else {
				list.add(s1.substring(0));
				s1.delete(0, i);
				s1.append(s.charAt(i));
			}
			
		}
	list.add(s1.toString());
	

	int max = Integer.MIN_VALUE;
	String largest = null;
	
	for(String a : list) {
		if(a.length()> max) {
			max = a.length();
			largest = a;
		}
	}
		
	System.out.println("largest : " + largest);
	return largest;
	}

	
}
