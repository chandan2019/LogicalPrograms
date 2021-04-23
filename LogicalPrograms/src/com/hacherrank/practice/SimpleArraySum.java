package com.hacherrank.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class SimpleArraySum {

	public static void main(String[] args) {

		
		/*int ar[] = {1,2,3,4,5};
		
		if(ar.length ==0) {
			System.out.println("hello");
		}	
		
		IntStream stream = Arrays.stream(ar);
		
		System.out.println(stream.sum());*/
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		//List<Integer> collect = list.stream().map(a-> {return a = a+1;}).collect(Collectors.toList());
		
		System.out.println(list);
		
		change(list);
		
		System.out.println(list);
	}

	
	public static void change(List<Integer> list) {
		
		list.add(5);
		
	}
}
