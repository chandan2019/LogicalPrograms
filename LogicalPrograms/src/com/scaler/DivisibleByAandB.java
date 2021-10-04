package com.scaler;

public class DivisibleByAandB {

	public static void main(String[] args) {

		int a = 2, b = 5, n = 2;
		System.out.println(searchNthTerm(a, b, n));

	}

	// Binary search to find the
	// nth term divisible by a or b
	static int searchNthTerm(int a, int b, int n) {
		// set low to 1 and high to max(a, b)*n,
		// here we have taken high as 10^18
		int low = 1, high = Integer.MAX_VALUE, mid;
		int lcm = (a * b) / gcdOfAandB(a, b);

		while (low < high) {
			mid = low + (high - low) / 2;

			// if the current term is less
			// than n then we need to increase
			// low to mid + 1
			if (termCount(a, b, lcm, mid) < n)
				low = mid + 1;

			// if current term is greater
			// than equal to n then high = mid
			else
				high = mid;
		}

		return low;
	}

	static int termCount(int a, int b, int lcm, int num) {
		// calculate number of terms
		// divisible by a and by b then,
		// remove the terms which is are
		// divisible by both a and b
		return num / lcm;
	}

	static int gcdOfAandB(int a, int b) {
		if (a == 0)
			return b;

		return gcdOfAandB(b % a, a);
	}

}
