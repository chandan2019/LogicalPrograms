package com.cloning;

public class TestCloning {

	public static void main(String[] args) throws CloneNotSupportedException {

		A obj1 = new A();
		System.out.println("a = " + obj1.a + " name = " + obj1.name );
		
		A clonedObj1 = (A) obj1.clone();
		
		System.out.println("After cloning");
		
		System.out.println("a = " + clonedObj1.a + " name = " + clonedObj1.name );
	}

}
