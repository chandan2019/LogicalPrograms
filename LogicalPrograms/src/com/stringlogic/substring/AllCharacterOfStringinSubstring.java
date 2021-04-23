package com.stringlogic.substring;

import java.util.HashMap;
import java.util.Map;

public class AllCharacterOfStringinSubstring {
	
	 static void allCharacterInSubstring(String str, int length) {
		 
		 Map<Character, Integer> map = new HashMap<>();
		 HashMap<String, Integer> distinctMap = putDistinctCharactersinHashMap(str);
		 System.out.println(distinctMap);
		 
		 String[] findAllSubStrings = findAllSubStrings(str, length, distinctMap);
		 
		 boolean flag = true;
		 int index = -1;
		 boolean flagar[] = new boolean[5]; 
		 for(int i = 0;i<findAllSubStrings.length; i++) {
			 
			 char[] ar = findAllSubStrings[i].toCharArray();
			 for(int j = 0;j<ar.length;j++) {
				 if(distinctMap.containsKey(String.valueOf(ar[i]))) {
					 flagar[ar[i]] = true;
				 }
				 
			 }
			 
			 if(flag == true) {
				 index = i;
			 }
		 }
		 
		 System.out.println("String is "+ findAllSubStrings[index]);
	 }
	 
	private static String[] findAllSubStrings(String str, int length, HashMap<String, Integer> distinctMap) {
		 String[] allStr = new String[3];
		 int count = 0;
		 
		 for(int i=0;  i<length; i++) {
	    		
	    		for(int j=i+1; j<= length;j++) {
	    			if(str.substring(i, j).length() == distinctMap.size()){
	    			
	    				allStr[count++] = str.substring(i, j);
	    			}
	    			//count++ ;
	    		}
	    	}
		 
		 for(int i = 0;i<allStr.length; i++) {
		 System.out.println(allStr[i]);
		 }
		 
		 return allStr;
	 }

	private static HashMap<String, Integer> putDistinctCharactersinHashMap(String str) {
		char strAr[] = str.toCharArray();
		 HashMap<String, Integer> distinct = new HashMap<>(); 
		 for(int i=0;i< strAr.length;i++) {
			 
			 if(!distinct.containsKey(String.valueOf(strAr[i]))) {
				 distinct.put(String.valueOf(strAr[i]), 1);
			 }else {
				 
				 distinct.put(String.valueOf(strAr[i]),distinct.get(String.valueOf(strAr[i])) + 1);
			 }
			 
		 }
		 
		 return distinct;
	}

	public static void main(String[] args) {

	String str = "chandan";
	
	allCharacterInSubstring(str, str.length());
	
	
	}

}
