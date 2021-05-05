package com.test.techgig;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class VirusInTheCity {
	
	
	public static void saferType1(String[] s) {
		
		int l = 0;
		while(l < s.length) {
		if(s[l].length() == 0)
			return;
		
		l++;
		}
		
		
				int j = 0;
		while(j < s.length) {
			
			/*declaring a treemap which will sort data in descending order*/
			Map<Integer, Integer> mapWithcharCounts = new TreeMap<>(Collections.reverseOrder());
			
			Map<Integer, Integer> mapwithExchageKeyValues = new TreeMap<>(); 
			String str = s[j];
		for(int i=0; i<str.length();i++) {
			
			mapWithcharCounts.put((int) str.charAt(i), mapWithcharCounts.getOrDefault((int)str.charAt(i), 0) + 1);
		}
		
		
		for(Map.Entry<Integer, Integer> map : mapWithcharCounts.entrySet()) {
			
			if(map.getValue() > 1) {
				mapwithExchageKeyValues.put(map.getValue(), map.getKey());
			}
		}
		
		// iterating a map on stream api
		mapwithExchageKeyValues.entrySet().stream().forEach(k -> System.out.println((char)k.getValue().intValue() ));
		
		/* Iterating a map without stream*/
		//mapwithExchageKeyValues.forEach((k,v)-> System.out.println(k+ " " + v ));
		
		j++;
		}
		
	}
	
	public static void saferType(String s) {
		
		
		int a[] = new int[256];
		Arrays.fill(a, 0); /* filling an int array with 0 value*/
		
		/*this is an approach of keeping count of each char, here index of array are alphabets, and on each index 
		 * we are keeping count of each character*/
		for(int i=0; i<s.length();i++) {
			
			a[s.charAt(i)]++ ;
			
		}
		
		
		int count = 0; 
		for(int i=0; i<a.length;i++) {
			
			if(a[i] >1) {
				System.out.println((char)i);
				//ar[k++] = i;
				count++;
			}
		}
		
		int ar[] = new int[count];
		
		for(int i=0; i<ar.length;i++) {
			System.out.print((char)ar[i]);
		}
		
	}

	public static void main(String[] args) {

		Scanner sc  = new Scanner(System.in);
		String testcase = sc.nextLine();
		
		int testInt = Integer.parseInt(testcase);
		String ar []  = new String[testInt];
		for(int i = 0;i<testInt; i++) {
			ar[i] = sc.nextLine();
		}
		
		/* This approcah did not worked on condition, when multiple characters have same count, then print them according 
		 * to their ASCII values(which have less ASCII values)*/
		
		//saferType("acdcghcad");
		
		saferType1(ar);
		
		
		
	}

}
