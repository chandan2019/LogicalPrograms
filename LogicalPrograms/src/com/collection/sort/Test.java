package com.collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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
		
		
		Map<String, String>  map= new HashMap<String, String>();
		
		String one = "Barclays";
		String two = "Barclays";
		String three = new String("Barclays");
		StringBuilder four = new StringBuilder("Barclays");
		map.put(one, one);
		map.put(two, two);
		map.put(three, three);
		map.put(four.toString(), four.toString());
		
		System.out.println("s " + map.size());
		
	}

}
