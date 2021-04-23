package com.java8.feature;

import java.util.function.Predicate;

public class Filter {

	
	public static Predicate<String> nameStartWithPrefix(String prefix){
		
		return s->s.startsWith(prefix);
	}
}
