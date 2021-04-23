package com.defainterface.programs;

public interface I2 extends I1{

	default void m() {
		
		System.out.print("I2");
	}
}
