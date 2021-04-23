package com.serialization;

import java.io.Serializable;

public class Dog extends Animal implements Serializable{
	int j=20;

	Dog(int j){
		super(j);
		this.j = j;
		System.out.println("Dog Default const called");
	}
}
