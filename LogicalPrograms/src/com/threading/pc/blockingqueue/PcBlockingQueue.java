package com.threading.pc.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class PcBlockingQueue {

	int capacity = 5;

	private  BlockingQueue<String> queue = new ArrayBlockingQueue<>(capacity);

	public void produce() throws InterruptedException {

		for (int i = 1; i <= capacity; i++) {
			queue.put("P");
			System.out.println("Producer produced ");
		}

	}

	public void consume() throws InterruptedException {

		while (true) {
			String string = queue.take();
			System.out.println("Consumer consuming " + string);
		}

	}

	public static void main(String[] args) throws InterruptedException {

		PcBlockingQueue pc = new PcBlockingQueue();

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

		p.join();
		c.join();

	}

}
