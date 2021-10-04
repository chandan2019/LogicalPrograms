package com.javaconcept.proof;

public class Dog extends Animal{
	
	public Animal show() {
		
		System.out.println("Dog is eating");
		return new Dog();
	}

}
