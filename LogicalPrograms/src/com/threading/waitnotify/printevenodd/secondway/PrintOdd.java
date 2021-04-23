package com.threading.waitnotify.printevenodd.secondway;

public class PrintOdd implements Runnable{

	 Printer p;
		
	 PrintOdd(Printer p){
			this.p = p;
			
		}
		@Override
		public void run() {

			for(int i=1;i<=10;i=i+2) {
				try {
					p.printOdd(i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

}
