package com.java8.feature;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMapAndFlatMap {

	public static void main(String[] args) {

		
		List<List<String>> list = Arrays.asList(
				  Arrays.asList("a"),
				  Arrays.asList("b"));
				System.out.println(list);
				
				Stream<String> flatMap = list.stream()
						  .flatMap(Collection::stream);
				
				Stream<List<String>> stream = list.stream();
					
				list.stream().flatMap(a-> a.stream()).forEach(System.out::println);
				
				
				
	}

}
