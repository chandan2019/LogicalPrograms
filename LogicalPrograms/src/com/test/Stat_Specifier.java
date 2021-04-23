package com.test;

public class Stat_Specifier {

	public static void main(String[] args) {

		
		Sample o1 = new Sample();
		Sample o2 = new Sample();
		
		o1.a = 0;
		o1.b = 0;
		o1.call(1,2);
		o2.a = 0;
		o2.call(2,3);
		
		System.out.println(o1.a + "   " + o2.b);
	}

}
