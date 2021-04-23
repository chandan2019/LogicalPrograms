package com.array;

import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {

		
		int ar1[] = {3,5,9,10,14};
		int ar2[] = {1,4,8,11,13};
		
		int[] merge = merge(ar1, ar2);
		
		Arrays.stream(merge).forEach(System.out::println);
		
	}
	
	public static int[] merge(int[] ar1, int[] ar2) {
		
		
		int i=0;
		int j = 0;
		int k = 0;
		int n = ar1.length + ar2.length;
		int[] ar3 = new int[n];
		while(i< ar1.length && j<ar2.length) {
			
			if(ar1[i] < ar2[j]) {
				ar3[k++] = ar1[i++];
			}else {
				
				ar3[k++] = ar2[j++];
			}
				
			
		}
		
		while(i<ar1.length) {
			ar3[k++] = ar1[i++];
		}
		
		while(j<ar1.length) {
			ar3[k++] = ar2[j++];
		}
		
		return ar3;
	}

}
