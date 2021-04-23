package com.threading.threadlocal;

public class Test {

	public static void main(String[] args) {

		ThreadLocalTest tlt = new ThreadLocalTest();
		
		Task task1 = new Task(tlt, 10);
		Task task2 = new Task(tlt, 20);
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		t1.start();
		t2.start();
	}

}
