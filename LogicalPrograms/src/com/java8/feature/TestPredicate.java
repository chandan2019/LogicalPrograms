package com.java8.feature;

import java.util.Arrays;
import java.util.List;

public class TestPredicate {
	
	public static void main(String[] args) {

		
		List<String> names = Arrays.asList("aarnya", "aasma", "alaska", "alaha");
		
		names.stream().filter(Filter.nameStartWithPrefix("aa")).forEach(System.out::println);
	}

}
