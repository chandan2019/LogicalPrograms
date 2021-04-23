package com.array.slidingwindow.fixedsize;

import java.util.ArrayList;
import java.util.List;

public class FirstNegativeInMinWindowSizeK {

	public static void main(String[] args) {

		int[] a = { 12, -1, -7, 8, -15, 30, 16, 28 };

		List<Integer> firstNegative = firstNegative(a, 3);

		firstNegative.stream().forEach(System.out::println);

	}

	public static List<Integer> firstNegative(int[] a, int k) {

		int i = 0, j = 0;
		List<Integer> tempList = new ArrayList<>();
		List<Integer> resultList = new ArrayList<>();

		while (j < a.length) {

			if (a[j] < 0)
				tempList.add(a[j]);

			if (j - i + 1 < k) {

				j++;
			} else if (j - i + 1 == k) {

				if (tempList.size() > 0) {

					resultList.add(tempList.get(0));
					if (a[i] == tempList.get(0)) {
						tempList.remove(0);
					}

				}

				j++;
				i++;

			}

		}

		return resultList;

	}

}
