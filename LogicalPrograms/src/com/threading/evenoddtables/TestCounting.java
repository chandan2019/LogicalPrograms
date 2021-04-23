package com.threading.evenoddtables;

public class TestCounting {

	public static void main(String[] args) throws InterruptedException {
		
		
		for(int i=1;i<=10;i++) {
			
			if(i%2 != 0) {
				EvenTable es = new EvenTable(i);
				Thread tEven = new Thread(es);
				tEven.start();
				tEven.join();
			}else {
				OddTable es = new OddTable(i);
				Thread tOdd = new Thread(es);
				tOdd.start();
				tOdd.join();
				
			}
			
		}

	}

}
