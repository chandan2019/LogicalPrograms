package com.threading.evenoddsum;

public class TestThread {

	public static void main(String[] args) throws InterruptedException {
		
		EvenSum es = new EvenSum();
		Thread tEven = new Thread(es);
		
		OddSum eo = new OddSum();
		Thread tOdd = new Thread(eo);
		
		tEven.start();
		
		tEven.join();
		
		tOdd.start();
		tOdd.join();

	}

}
