package com.array;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		/*
		 * System.out.println("enter amount"); Scanner sc = new Scanner(System.in); int
		 * N = sc.nextInt(); System.out.println("number of operations"); sc = new
		 * Scanner(System.in); int M = sc.nextInt(); int type = 0; String operationType
		 * = ""; Scanner scs = new Scanner(System.in); for(int i = 0; i<M; i++){
		 * 
		 * String operation = scs.nextLine(); type =
		 * Integer.parseInt(operation.split(" ")[0]); operationType =
		 * operation.split(" ")[1]; System.out.println(type);
		 * System.out.println(operationType); }
		 */

	/*	String solve = solve("scaler");

		System.out.println("solve : " + solve);*/

		//int a[] = { 1, 2, 3, 4, 5 };
		int a[] = { 11, 17, 100, 5 };
		int[] solve2 = solve(a);
		
		Arrays.stream(solve2).forEach(System.out::print);
	}

	public static String solve(String A) {

		char compare = 'a';
		StringBuilder newstring = new StringBuilder();
		for (int i = 0; i < A.length(); i++) {
			int num = A.charAt(i) - compare + 1;
			newstring = newstring.append(A.charAt(i)).append(num);

		}
		return newstring.toString();
	}

	public static int[] solve(int[] A) {

		int size = A.length - 2;
		int result[] = new int[size];
		Arrays.sort(A);
		if (size >= 1) {
			for (int i = 0; i < size; i++) {
				result[i] = A[i];
			}
		}

		return result;
	}
}
