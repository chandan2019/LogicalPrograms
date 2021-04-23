package com.generics;

public class Test {

	public static void main(String[] args) {

		
		MathOperations max = new MathOperations();
		Integer findMax = max.findMax(4, 5);
		System.out.println("findMax = " + findMax);
		Integer add = max.add(4,5);
		System.out.println("add = " + add);
		
		Double addD = max.add(4.5,5.6);
		System.out.println("addD = " + addD);
		
		String findMax2 = max.findMax("ahand", "Biki");
		System.out.println("findMax2  = " + findMax2);
		
	}

}
