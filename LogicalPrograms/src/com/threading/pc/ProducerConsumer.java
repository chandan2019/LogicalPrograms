package com.threading.pc;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumer {

	int capacity = 5;
	
	List<String> list = new ArrayList<>();
	public void produce() throws InterruptedException {
		
		/*while(true) {*/
		synchronized(this) {
		while(list.size() == capacity) {
			
			wait();
		}
		
		while(list.size()<capacity) {
		list.add("P");
		System.out.println("Producer produced ");
		}
		notify();
		//Thread.sleep(1000);
		}
//		}
	}

	public void consume() throws InterruptedException {
		
		/*while(true) {*/
		synchronized(this) {
		while(list.size() == 0) {
			
			wait();
			
		}
		while(list.size() > 0) {
		String string = list.get(list.size()-1);
		System.out.println("Consumer consuming " + string);
		list.remove(list.size()-1);
		}
		notify();
		//Thread.sleep(1000);
		
		}	
		/*}*/
	}

		public static void main(String[] args) throws InterruptedException {

			ProducerConsumer pc = new ProducerConsumer();

			Thread p = new Thread(new Runnable() {

				public void run() {
					try {
						pc.produce();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}

			});

			Thread c = new Thread(new Runnable() {

				public void run() {
					try {
						pc.consume();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}

			});

      p.start();
      c.start();
			
			
     /* p.join();
      c.join();*/
			
	}

}
