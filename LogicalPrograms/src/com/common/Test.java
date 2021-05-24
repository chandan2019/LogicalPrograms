package com.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		
		Student s1 = new Student(3, "AA");
		
		
		Student s2 = new Student(2, "BB");
		s2.abc(s1);
		Student s3 = new Student(4, "CC");
		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		//Collections.sort(list);
		
		Stream<String> map = list.stream().map(s ->{
			//System.out.println(s.name);
		//	System.out.println(s.roll);
			//
			return (s.name + " " + s.roll);
		});
		System.out.println(map.findFirst());
		
		
		//list.stream().forEach(System.out::println);
		//list.stream()

	}

}
