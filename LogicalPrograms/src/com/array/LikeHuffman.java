package com.array;

import java.util.Arrays;

public class LikeHuffman {

	public static void main(String[] args) {

		String s = "111221asdasnffnfnn";

		String encoding = countEachChar1(s);
		System.out.println(encoding);

		// countEachChar(s);

	}

	public static String countEachChar1(String s) {

		String str2 = "";

		int fre[] = new int[255];
		boolean visited[] = new boolean[256];
		Arrays.fill(fre, 0);
		Arrays.fill(visited, false);

		for (int i = 0; i < s.length(); i++) {

			fre[s.charAt(i)]++;
		}

		for (int i = 0; i < s.length(); i++) {

			if (visited[s.charAt(i)] == false) {

				str2 += s.charAt(i) + "" + fre[s.charAt(i)];
				visited[s.charAt(i)] = true;

			}
		}

		return str2;
	}

	static void countEachChar(String str) {
		// ASCII values ranges upto 256
		int counter[] = new int[256];

		// String length
		int len = str.length();

		/*
		 * This array holds the occurrence of each char, For example ASCII value of A is
		 * 65 so if A is found twice then counter[65] would have the value 2, here 65 is
		 * the ASCII value of A
		 */
		for (int i = 0; i < len; i++)
			counter[str.charAt(i)]++;

		// We are creating another array with the size of String
		char array[] = new char[str.length()];
		for (int i = 0; i < len; i++) {
			array[i] = str.charAt(i);
			int flag = 0;
			for (int j = 0; j <= i; j++) {

				/*
				 * If a char is found in String then set the flag so that we can print the
				 * occurrence
				 */
				if (str.charAt(i) == array[j])
					flag++;
			}

			if (flag == 1)
				System.out
						.println("Occurrence of char " + str.charAt(i) + " in the String is:" + counter[str.charAt(i)]);
		}
	}

}
