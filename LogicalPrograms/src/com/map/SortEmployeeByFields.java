package com.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortEmployeeByFields {
	
	static class Employee {
		
		Employee(int id, String name){
			
			this.id= id;
			this.name = name;
		}
		
		int id;
		String name;

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + "]";
		}
		
		
		
		
	}
	
	static class NameComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			
			
			return o1.name.compareTo(o2.name);
		}
		
		
		
	}

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1,"chandan");
		Employee e2 = new Employee(3,"akash");
		Employee e3 = new Employee(2,"ramesh");
		
		
		List<Employee> list = new ArrayList<>();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		Collections.sort(list,new NameComparator());
		
		list.forEach(e-> System.out.println(e));
		

	}

}
