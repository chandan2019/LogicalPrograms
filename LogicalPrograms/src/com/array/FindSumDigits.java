package com.array;

public class FindSumDigits {

	static int digitCount = 0;
	static int maxNumber = 50000;

	public static void main(String[] args) {

		int n = 4;
		int sumDigits = doSumDigits(n);
		int smallestIntegerWithSameSum = 0;

		switch (digitCount) {

		case 1:
			smallestIntegerWithSameSum = getSmallestIntegerWithSameSum(n + 1, sumDigits);
			System.out.println("smallestIntegerWithSameSum " + smallestIntegerWithSameSum);
			break;

		case 2:
			smallestIntegerWithSameSum = getSmallestIntegerWithSameSum(n + 1, sumDigits);
			System.out.println("smallestIntegerWithSameSum " + smallestIntegerWithSameSum);
			break;

		case 3:
			smallestIntegerWithSameSum = getSmallestIntegerWithSameSum(n + 1, sumDigits);
			System.out.println("smallestIntegerWithSameSum " + smallestIntegerWithSameSum);
			break;

		case 4:
			smallestIntegerWithSameSum = getSmallestIntegerWithSameSum(n + 1, sumDigits);
			System.out.println("smallestIntegerWithSameSum " + smallestIntegerWithSameSum);
			break;

		case 5:
			smallestIntegerWithSameSum = getSmallestIntegerWithSameSum(n + 1, sumDigits);
			System.out.println("smallestIntegerWithSameSum " + smallestIntegerWithSameSum);
			break;

		default:
			break;

		}
	}

	public static int doSumDigits(int n) {

		int sum = 0;
		while (n != 0) {

			sum = sum + n % 10;
			n = n / 10;
			digitCount++;
		}

		return sum;
	}

	public static int getSmallestIntegerWithSameSum(int n, int sumDigits) {

		while (n <= maxNumber) {

			int doSumDigits = doSumDigits(n);

			if (doSumDigits == sumDigits)
				return n;
			n++;

		}

		return maxNumber;

	}

}
