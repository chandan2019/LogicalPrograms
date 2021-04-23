package com.threading.waitnotify.printevenodd.secondway;

public class PrintEven implements Runnable{
  Printer p;
	
	PrintEven(Printer p){
		this.p = p;
		
	}
	@Override
	public void run() {

		for(int i=2;i<=10;i=i+2) {
			try {
				p.printEven(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
