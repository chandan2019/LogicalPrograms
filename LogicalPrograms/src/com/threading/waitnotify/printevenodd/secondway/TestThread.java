package com.threading.waitnotify.printevenodd.secondway;

public class TestThread {

	public static void main(String[] args) throws InterruptedException {

		
		Printer p = new Printer();
		
		PrintEven pe = new PrintEven(p);
		PrintOdd po = new PrintOdd(p);
		
		
		
		Thread tEven = new Thread(pe);
		Thread tOdd = new Thread(po);
		
		tEven.start();
		tOdd.start();
		tEven.join();
		tOdd.join();
	}

}
