package com.javaconcept.proof;

public class Cat extends Animal{
	
	public Cat show() {
		
		System.out.println("Cat is eating");
		return new Cat();
	}

}
