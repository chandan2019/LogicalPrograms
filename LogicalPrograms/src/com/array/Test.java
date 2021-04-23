package com.array;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		String s = "chandan,Singh";
		
		String[] split = s.split(",");
		Arrays.stream(split).forEach(System.out::println);
		
}
}
