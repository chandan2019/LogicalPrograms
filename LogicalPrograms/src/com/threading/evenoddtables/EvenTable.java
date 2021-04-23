package com.threading.evenoddtables;

public class EvenTable implements Runnable{
	
	int countingEven;
	EvenTable(int countingEven){
		
		this.countingEven = countingEven;
	}
	
	@Override
	public void run() {
		
		for(int i=1; i<=10; i++) {
			System.out.println(countingEven*i);
		}
		System.out.println("____________________________________");
	}


}
