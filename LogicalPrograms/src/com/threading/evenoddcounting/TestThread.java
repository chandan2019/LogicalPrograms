package com.threading.evenoddcounting;

public class TestThread {

	public static void main(String[] args) throws InterruptedException {
		
		Evenounting es = new Evenounting();
		Thread tEven = new Thread(es);
		
		OddCounting eo = new OddCounting();
		Thread tOdd = new Thread(eo);
		
		tEven.start();
		
		tEven.join();
		
		tOdd.start();
		tOdd.join();

	}

}
