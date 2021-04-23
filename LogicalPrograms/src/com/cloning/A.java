package com.cloning;

public class A implements Cloneable{
	
	int a = 10;
	String name = "chandan";
	
	 public Object clone() throws CloneNotSupportedException 
		{ 
		return super.clone(); 
		} 

}
