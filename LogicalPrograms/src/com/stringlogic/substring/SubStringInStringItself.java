package com.stringlogic.substring;

import java.util.HashMap;
import java.util.Map;

public class SubStringInStringItself {

	public static void main(String[] args) {

		String str = "aababcdbcabbcd";
		
		String findSubString = findSubString(str);
		System.out.println("str " + findSubString);
	}
	
	public static String findSubString(String str) {
		
		Map<Character, Integer> distinctElements = distinctElements(str);
		char[] strAr = str.toCharArray();
		
	    String res = ""; 
	    // Now follow the algorithm discussed in below 
	    for (int i = 0; i < strAr.length; i++) { 
	        int count = 0; 
	        int visited[] = new int[256]; 
	        String sub_str = ""; 
	        for (int j = i; j < strAr.length; j++) { 
	            if (visited[strAr[j]] == 0) { 
	                count++; 
	                visited[strAr[j]] = 1; 
	            } 
	            sub_str += strAr[j]; 
	            if (count == distinctElements.size()) 
	                break; 
	        } 
	        if (count == distinctElements.size()) 
	            res = sub_str; 
	    } 
	    return res; 
	}

	private static Map<Character, Integer> distinctElements(String str) {
		Map<Character, Integer> map = new HashMap<>();
		char[] strArr = str.toCharArray();
		for(int i= 0;i<strArr.length;i++) {
			
			if(!map.containsKey(strArr[i])) {
				map.put(strArr[i], 1);
			}else {
				
				map.put(strArr[i], map.get(strArr[i])+1);
			}
		}
		
		return map;
	}

}
