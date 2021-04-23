package com.threading.waitnotify.printevenodd;

public class PrintEvenOdd {
	
	boolean flag = true;
	int MAX = 20;
	int count = 1;

	void printEven() throws InterruptedException {
		synchronized(this) {
		while(count<MAX) {
		while(flag) {
			
			wait();
		}
		System.out.println("even " + count);
		flag = true;
		count++;
		notify();
		}
	}

	}

	void printOdd() throws InterruptedException {
       synchronized(this) {
		while(count<MAX) {
		while(!flag) {
			wait();
			
		}
		System.out.println("odd " + count);
		flag = false;
		count++;
		notify();
		}
    }
	}

	public static void main(String[] args) throws InterruptedException {

		PrintEvenOdd peo = new PrintEvenOdd();
		Thread tEven = new Thread(new Runnable() {

			public void run() {
				try {
					peo.printEven();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		});

		Thread tOdd = new Thread(new Runnable() {

			public void run() {
				try {
					peo.printOdd();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		});
		
		tEven.start();
		tOdd.start();
		tEven.join();
		tOdd.join();

	}

}
