package com.cyclicbinarystring;

public class Result {

	public static int maximumPower(String s) {

		if (s.length() < 0) {
			return -1;

		}

		if (s.length() == 1) {

			return s.charAt(0) == '1' ? 0 : -1;
		}

		int max0 = 0;
		int start0 = 0;
		int end0 = 0;
		int tempMax0 = 0;
		boolean foundFirst1 = false;

		for (int index = 0; index < s.length(); index++) {

			char c = s.charAt(index);

			if (c == '1') {

				foundFirst1 = true;
				if (tempMax0 > max0) {
					max0 = tempMax0;
				}

				tempMax0 = 0;

			} else {

				if (!foundFirst1) {
					++start0;
				}
				++tempMax0;
			}

			if (index == s.length() - 1) {
				end0 = tempMax0;
			}

		}
		if (tempMax0 > max0) {
			max0 = tempMax0;
		}
		if ((start0 + end0) > max0) {
			max0 = start0 + end0;
		}

		if (foundFirst1 == false) {

			return -1;
		}
		return max0;

	}
}
