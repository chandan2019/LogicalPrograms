package com.defainterface.programs;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {

		
		B b = new B();
		b.m();
		b.callM();
		b.callSuperM();
		
		A a = new B();
		a.m();
		a.callM();
		
		A a1 = new A();
		a1.callM();
		a1.m();
		
		
		
	}

}
