package com.threading.deadlock;

public class MyFirstThread implements Runnable{

	A a;
	B b;

	MyFirstThread(A a, B b){
		this.a = a;
		this.b = b;
		
	}
	@Override
	public void run() {
		synchronized(a) {
		a.displayA();
		synchronized(b) {
		b.displayA();
		}
		}
	}

}
