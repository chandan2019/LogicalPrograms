package com.threading.evenoddsum;

public class EvenSum implements Runnable{

	int sum = 0;
	@Override
	public void run() {
		
		for(int i=2; i<=10; i=i+2) {
			sum = sum+i;
		}
		
		System.out.println("even sum = " + sum);
	}

}
