package com.array;

import java.util.Arrays;

public class CountFrequency {
	
	
	public static int[] countFrequency(int[] a) {
		
		int count[] = new int[10];
		
		boolean visit[] = new boolean[10];
		
		Arrays.fill(count, 0);
		Arrays.fill(visit, false);
		
		for(int i=0;i<a.length;i++) {
			
			//if(visit[a[i]] == 1)
			count[a[i]]++;
			
		}
		
		for(int i=0;i<a.length;i++) {
			
			if(visit[a[i]] == true)
				continue;
				
			visit[a[i]] = true;
			System.out.println(a[i] + " " + count[a[i]]);
		}
		
		
		return a;
	}

	public static void main(String[] args) {

		
		int a[] = {2,1,4,5,1};
		
		countFrequency(a);
	}

}
