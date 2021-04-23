package com.threading.evenoddsum;

public class OddSum implements Runnable{

	int sum = 0;
	@Override
	public void run() {
		
		for(int i=1; i<=10; i=i+2) {
			sum = sum+i;
		}
		
		System.out.println("odd sum = " + sum);
	}

}
