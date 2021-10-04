package com.conversion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Conversion {

	public static void main(String[] args) {

		List<List<String>> s = Arrays.asList(Arrays.asList("Chandan","Nandan","Bandan"));
		
		List<String> collect = s.stream().flatMap(a->{return a.stream().filter(b->b.startsWith("C"));} ).collect(Collectors.toList());
		
	}

}
