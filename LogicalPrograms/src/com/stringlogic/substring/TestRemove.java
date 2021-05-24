package com.stringlogic.substring;

import java.util.List;
import java.util.stream.Collectors;

public class TestRemove {

	public static void main(String[] args) {

		
		String str = "chandan";
		String c = "a";
		
		boolean playerTurn = false;
		String uniqueCharacters = uniqueCharacters(str);
		System.out.println(uniqueCharacters);
		int i = 0;
		while(i < uniqueCharacters.length()) {
			
			double random = Math.random();
			//random%
			
			
			i++;
		}
		
		
		
	/*	while(str.length()>0) {
		
			if(!playerTurn) {
				char charAt = str.charAt(0);*/
				
				str = removeFromString(str, String.valueOf((char)str.charAt(0)));
		      System.out.println(str);
		/*	}
		}*/
	}
	
	public static String removeFromString(String str, String c) {
		
		if(str.length() == 1)
			return "";
		//char ch = '';
		 String replaceAll = str.replaceAll(c, "");
		 return removeFromString(replaceAll, String.valueOf((char)replaceAll.charAt(0)));
		//return str.replace(c,ch);
		
	}
	
	public static String uniqueCharacters(String test) {     
		//System.out.println(test.chars().distinct().mapToObj(c -> String.valueOf((char)c)).collect(Collectors.joining()));
		return test.chars().distinct().mapToObj(c -> String.valueOf((char)c)).collect(Collectors.joining());
		}

	
	/*1.  to find the distinct character
	 * 2. */
}
