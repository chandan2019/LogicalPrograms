package com.collection.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DeleteStringFromArrayList {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Chandan", "Amit", "Ankit");
		String stringtoremove = "asx";

		list = removeString(list, stringtoremove);
		list.stream().forEach(System.out::println);
	}

	public static List<String> removeString(List<String> list, String stringtoremove) {
		return list.stream().filter(s -> !s.equalsIgnoreCase(stringtoremove)).collect(Collectors.toList());
	}

}
