package com.threading.deadlock;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		A a =new A();
		B b = new B();
		MyFirstThread mf = new MyFirstThread(a, b);
		MySecondThread ms = new MySecondThread(a, b);
		
		Thread t1 = new Thread(mf);
		Thread t2 = new Thread(ms);
		t1.start();
		
		t2.start();
	}

}
