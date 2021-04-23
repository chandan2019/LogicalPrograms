package com.threading.waitnotify.printevenodd.secondway;

public class Printer {

	boolean flag = true;

	public void printEven(int even) throws InterruptedException {

		synchronized(this) {
		while (flag) {

			wait();
		}

		System.out.println("even " + even);
		flag = true;
		notify();
		}
	}

	public void printOdd(int odd) throws InterruptedException {

		synchronized(this) {
		while (!flag) {

			wait();
		}

		System.out.println("odd " + odd);
		flag = false;
		notify();
		}

	}
}
