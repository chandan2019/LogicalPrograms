package com.threading.threadlocal;

public class Task implements Runnable{

	ThreadLocalTest tlt;
	int i;
	
	Task(ThreadLocalTest tlt, int i){
		this.tlt = tlt;
		this.i = i;
		
	}
	@Override
	public void run() {
		
		tlt.setThValue(i);
	System.out.println(tlt.getThValue());
	}

}
