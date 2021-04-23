package com.stringlogic.substring;

import java.util.Arrays;

public class ArrayWithDistinctChara {

	public static void main(String[] args) {

		String str = "chandan";
		
		System.out.println(findDistinctChar(str));
	}

	
	public static int findDistinctChar(String str) {
		
		int flagar [] = new int[256];
		Arrays.fill(flagar, 0);
		
		char ar[] = str.toCharArray();
		
		for(int i=0;i<ar.length;i++) {
			
			if(flagar[ar[i]] == 0)
			flagar[ar[i]] = 1;
		}
		
		int count = 0;
		for(int i = 0; i<flagar.length;i++) {
			if(flagar[i] == 1)
			count++;
		}
		
		return count;
	}
}
