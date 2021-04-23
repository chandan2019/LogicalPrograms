package com.stringlogic.commonquestion;

import java.util.Arrays;
import java.util.stream.Stream;

public class ReverseArrayString {

	public static void main(String[] args) {

		
			String str = "Hello CKD you are my friend";
			
				String splitStr[] = str.split(" ");
				System.out.println("splitStr " + splitStr[0]);
				
				String str1  = "";
				for(int i=splitStr.length-1;i >= 0;i--){

				str1 += splitStr[i] + " ";


				}
				
				//System.out.println("str1 " + str1);
				
				
				 String[] reverserString = reverserString(str);
				 Stream<String> stream = Arrays.stream(reverserString); 
				 
				 stream.forEach(s -> System.out.print(s + " "));
				 
	}
	public static String[] reverserString(String str) {
		
		String splitStr[] = str.split(" ");
		int i = 0;
		int j = splitStr.length-1;
		String temp = "";
		while(i<j) {
			
			 temp = splitStr[i];
			 splitStr[i] = splitStr[j];
			 splitStr[j] = temp;
			
			 i++;
			 j--;
		}
		return splitStr;
	}
	
	
}
