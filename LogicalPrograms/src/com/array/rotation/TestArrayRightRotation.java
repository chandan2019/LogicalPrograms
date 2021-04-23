package com.array.rotation;

import java.util.Arrays;

public class TestArrayRightRotation {

	public static void main(String[] args) {

		int ar[] = new int[] { 1, 2, 3, 4, 5, 6, 7 };

		int d = 3; //right rotation by d

		reverse(ar, 0, ar.length - 1);
		reverse(ar, 0, d - 1);
		reverse(ar, d, ar.length - 1);

		Arrays.stream(ar).forEach(System.out::println);
	}

	public static int[] reverse(int[] ar, int start, int end) {

		int temp = 0;
		while (start < end) {

			temp = ar[start];
			ar[start] = ar[end];
			ar[end] = temp;

			start++;
			end--;

		}

		return ar;

	}

}
