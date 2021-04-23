package com.collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashSetSort {

	public static void main(String[] args) {

		
		Set<Integer> hset = new HashSet<>();
		hset.add(800);
		hset.add(400);
		hset.add(100);
		hset.add(600);
		
		hset.stream().forEach(System.out::println);
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(3, "B");
		map.put(5, "C");
		map.put(4, "D");
		map.put(2, "E");
		
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		
		for(Map.Entry<Integer, String> maps : entrySet) {
			
			
		}
		
		Set<Integer> keySet = map.keySet();
		
		
		List<Integer> list =new ArrayList<>();
		for(Integer i : map.keySet()) {
			list.add(i)	;
			
					
				}
		
		Collections.sort(list);
		
		list.stream().forEach(System.out::println);
		
		
		Map<Integer, String> changedmap = new HashMap<>();
		
		for(Integer i: list) {
			changedmap.put(i, map.get(i));
			
		}
		
		changedmap.entrySet().stream().forEach(en-> System.out.println(en.getKey() + "," + en.getValue()) );
	}

}
