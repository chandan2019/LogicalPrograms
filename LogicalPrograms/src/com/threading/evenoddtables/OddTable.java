package com.threading.evenoddtables;

public class OddTable implements Runnable{

	int countingOdd;
	OddTable(int countingOdd){
		this.countingOdd = countingOdd;
	}
	
	@Override
	public void run() {
		
		for(int i=1; i<=10; i++) {
			System.out.println(countingOdd*i);
		}
		System.out.println("____________________________________");
	}
		
}
