package com.exception;

public class FInallyFlow {

	public static void main(String[] args) {

		
		try {
			
			System.out.println("a");
			m2();
		}catch(Exception e) {
			
			System.out.println("d");
		}
	}
	
	public static void m2() {
		
		try {
			
			System.out.println("b");
			int i = 10/0;
		}
		finally {
			
			System.out.println("c");
		}
	}

}
