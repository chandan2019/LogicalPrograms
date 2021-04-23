package com.threading.evenoddcounting;

public class Evenounting implements Runnable{

	@Override
	public void run() {
		
		for(int i=2; i<=10; i=i+2) {
		
		System.out.println(i);
		}
		
		System.out.println("_______________");
	}

}
