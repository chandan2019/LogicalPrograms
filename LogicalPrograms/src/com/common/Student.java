package com.common;

public class Student implements Comparable<Student>{
	
	int roll;
	String name;
	
	Student(int roll, String name){
		this.roll = roll;
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		
		if(this.roll>o.roll)
		return 1;
		else if (this.roll==o.roll)
			return 0;
		else return -1;
	}
	
	
	public void abc(Student s) {
		System.out.println(this.name + " " +  this.roll);
		System.out.println(s.name + " " +  s.roll);
		
	}

}
