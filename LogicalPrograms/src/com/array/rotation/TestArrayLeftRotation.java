package com.array.rotation;

import java.util.Arrays;

public class TestArrayLeftRotation {

	public static void main(String[] args) {

		int ar[] = new int[] { 1, 2, 3, 4, 5, 6, 7 };

		int d = 2; //left rotation by d
		
		int[] rotate = rotate(ar, d);
		
		Arrays.stream(rotate).forEach(System.out::println);
		
		
	}

	
	public static int[] rotate(int[] ar, int d) {
		
		
		int i = 0;
		int rotate_index = d;
		int[] rotate_ar = new int[ar.length];
		
		while(rotate_index<ar.length) {
			rotate_ar[i] = ar[rotate_index];
			rotate_index++;
			i++;
		}
		
		int j = 0;
		while(j<d) {
			rotate_ar[i] = ar[j];
			i++;
			j++;
		}
		
		return rotate_ar;
		
		
	}
}
