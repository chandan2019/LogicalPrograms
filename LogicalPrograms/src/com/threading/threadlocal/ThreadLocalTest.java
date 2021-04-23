package com.threading.threadlocal;

public class ThreadLocalTest {

	public static ThreadLocal<Integer> thl = new ThreadLocal<>();
	
	//public static int count = 10;
	
	
	public void setThValue(int i) {
		thl.set(10 + i);
		//count  = count +i;
		
	}
	
	public int getThValue() {
		
		//return count;
		return thl.get();
	}
}
