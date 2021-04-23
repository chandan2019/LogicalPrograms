package com.array.slidingwindow.variablesize;

import java.util.HashMap;
import java.util.Map;

public class MinWindowSubString {

	public static void main(String[] args) {

		String s1 = "time to practice";
		String s2 = "toc";

		minWindowSubString(s1, s2);
	}

	public static int minWindowSubString(String source, String target) {

		int i = 0;
		int j = 0;
		Map<Character, Integer> map = new HashMap<>();
		int mapsize = map.size();

		for (int k = 0; k < target.length(); k++) {
			map.put(source.charAt(k), map.getOrDefault(source.charAt(k), 0) + 1);
		}

		while (j < source.length()) {
			map.put(source.charAt(j), map.getOrDefault(source.charAt(j), 0) - 1);

			if (map.get(source.charAt(j)) == 0) {
				mapsize--;
			}

			if (j - i + 1 < mapsize) {
				j++;

			} else if (j - i + 1 == mapsize) {
				

			} else if (j - i + 1 > mapsize) {

			}
		}
		return mapsize;
	}

}
