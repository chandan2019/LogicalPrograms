package com.threading.deadlock;

public class MySecondThread implements Runnable{

	A a;
	B b;
	MySecondThread(A a, B b){
		
		this.a = a;
		this.b = b;
	}
	@Override
	public void run() {
		synchronized(b) {
		b.displayB();
	
		synchronized(a) {
		a.displayB();
		}
		}
	}

	
	
}
