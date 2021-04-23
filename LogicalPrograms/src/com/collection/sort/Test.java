package com.collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		
	/*	Map<Integer, String> ma= new TreeMap<>();

		TreeSet<Employee> s = new TreeSet<>();
		
		Employee e1 = new Employee();
		e1.setId(1);
		
		Employee e2 = new Employee();
		e2.setId(2);
		
		Employee e3 = new Employee();
		e3.setId(3);
		
		s.add(null);
		s.add(e2);
		s.add(e3);
		
		s.stream().forEach(System.out:: println);*/
		
		
		
		
		List<String> list = new ArrayList<>();
		
		List<String> synchronizedList = Collections.synchronizedList(list);
		list.add("1");
		list.add("2");
		list.add("3");
		
		Iterator<String> iterator = synchronizedList.iterator();
		
		while(iterator.hasNext()) {
			
			String ss = iterator.next();
			System.out.println("s "+  ss);
			
			//synchronizedList.add("4");
			iterator.remove();
			
			//System.out.println("s1 "+  ss);
			
			
		}
		
		synchronizedList.add("4");
		
		System.out.println(synchronizedList);
		
		
	}

}
