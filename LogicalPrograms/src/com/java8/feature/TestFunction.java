package com.java8.feature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class TestFunction {

	public static void main(String[] args) {

		/*Function<Integer, String> a = abc(10);
		String apply = a.apply(5);
		System.out.println(apply);*/
		List<String> namep = new ArrayList<>();
		//name.add("xyz");
		//name.forEach(System.out::println);
		
		List<String> name = Arrays.asList("chandan","churan","chameli","cepta");
		namep.add("xyz");
		namep.addAll(name);
		/*Stream<String> map = name.stream().map(na->na.startsWith("ch"))
		.map(n->{return n+"i";});
		
		map.forEach(System.out::println);*/
		
		namep.forEach(System.out::println);
		//System.out.println(setLatsetDocumentvalue.apply(10));
		
		
	}

	
	 public static final Function<Integer, String> setLatsetDocumentvalue = x -> {
		 return String.valueOf(x);
		  };

}
