package com.threading.evenoddcounting;

public class OddCounting implements Runnable{

	@Override
	public void run() {
		
		for(int i=1; i<=10; i=i+2) {
       System.out.println(i);
		}
		
		System.out.println("______________");
	}

}
