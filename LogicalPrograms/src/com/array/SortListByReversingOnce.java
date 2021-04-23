package com.array;

import java.util.Arrays;

public class SortListByReversingOnce {

	public static void main(String[] args) {

		//
		//int[] ar = new int[] {1, 3, 3, 7, 6, 5, 9};
		int[] ar = new int[] {2,2,0};
		
		boolean sort = sort(ar);
		System.out.println(sort);
	}

	
	public static boolean sort(int[] ar) {
		
		int startindex = -1;
		int endindex = -1;
		boolean flag = false;
		
		int k = 0;
		for(int i=0;i<ar.length-1;i++) {
			
			if(ar[i] > ar[i+1] && flag == false) {
				
				while( i >0 && ar[i] == ar[i-1]) {
					startindex = i;
					i--;
				}
				
				flag = true;
				
			}
			
			if(flag == true && ar[i] > ar[i+1] ) {
				
				endindex = i;
			}
			
			
		}
		endindex +=1;
		int sortlistlength = endindex-startindex+1;
		int reversinglist[] = new int[sortlistlength];
		
		for(int i = startindex; i<=endindex;i++) {
		
		reversinglist[k] = ar[i];
		k++;
		}
		
		Arrays.sort(reversinglist);
		
		
		
		
		k=0;
		for(int i = startindex;i<=endindex;i++) {
			
			ar[i] =  reversinglist[k];
			k++;
			
		}
		
		
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i] > ar[i+1])
				return false;
			
		}
		return true;
		
	}
}
