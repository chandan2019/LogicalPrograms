package com.scaler;

import java.util.Arrays;

public class MultipleLeftArrayRotation {

	public static void main(String[] args) {

		int A[] = { 1, 2, 3, 4, 5 };// 32154, 45123
		int B[] = { 2, 3 };

		int[][] solve = solve(A, B);

	}

	public static int[][] solve(int[] A, int[] B) {

		int row = B.length;
		int col = A.length;
		int C[] = new int[A.length];
		int result[][] = new int[row][col];

		int j = 0;
		for (int i = 0; i < B.length; i++) {

			// C = A; assignment not working in case of copying one array to another.
			// System.arraycopy(A, 0, C,0,result[i].length);
			C = Arrays.copyOf(A, C.length);
			int lrotation = B[i];

			reverse(j, lrotation - 1, C);
			System.out.println("After first reverses----------------------------------------");

			for (int k = 0; k < A.length; k++) {

				System.out.print(" A []  " + C[k]);
			}

			reverse(lrotation, C.length - 1, C);

			System.out.println(" After second reverse----------------------------------------");
			for (int k = 0; k < A.length; k++) {

				System.out.print(" A []  " + C[k]);
			}

			System.out.println("j" + j);
			reverse(j, C.length - 1, C);

			System.out.println(" After third reverse----------------------------------------");

			for (int k = 0; k < C.length; k++) {

				System.out.print(" A []  " + C[k]);
			}
			// result[i] = A;?? why this is not working.

			// System.arraycopy(C, 0, result[i],0,result[i].length);
			result[i] = Arrays.copyOf(C, result[i].length);
		}

		for (int i = 0; i < B.length; i++) {

			System.out.println("rows [");
			for (int k = 0; k < A.length; k++) {

				System.out.print(result[i][k]);

			}

			System.out.print("]");
			System.out.println();

		}

		return result;

	}

	public static void checkReference(int a[]) {

		for (int i = 0; i < a.length; i++) {

			a[i] = a[i] + 1;
		}
	}

	private static void reverse(int start, int end, int[] ar) {
		int temp;

		while (start < end) {

			temp = ar[end];
			ar[end] = ar[start];
			ar[start] = temp;
			start++;
			end--;
		}

	}

}
