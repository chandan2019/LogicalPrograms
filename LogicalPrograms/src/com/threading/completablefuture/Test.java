package com.threading.completablefuture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	
	static List<Integer> listInt1 = new ArrayList<>();
	static List<Integer> listInt2 = new ArrayList<>();
	static List<Integer> listInt3 = new ArrayList<>();
	static List<Integer> listInt4 = new ArrayList<>();
	static List<Integer> listInt5 = new ArrayList<>();
	
	
	

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		listInt1.add(1);
		listInt1.add(2);
		listInt1.add(3);
		listInt1.add(4);
		listInt1.add(5);
		
		listInt2.add(2);
		listInt2.add(4);
		listInt2.add(6);
		listInt2.add(8);
		listInt2.add(10);
		
		listInt3.add(3);
		listInt3.add(6);
		listInt3.add(9);
		listInt3.add(12);
		listInt3.add(15);
		
		
		listInt4.add(4);
		listInt4.add(8);
		listInt4.add(12);
		listInt4.add(16);
		listInt4.add(20);
		
		listInt5.add(5);
		listInt5.add(10);
		listInt5.add(15);
		listInt5.add(20);
		listInt5.add(25);
		ExecutorService ex = Executors.newFixedThreadPool(5);
		
		
		MyCallable1 mc1 = new MyCallable1(listInt1);
		MyCallable2 mc2 = new MyCallable2(listInt2);
		MyCallable2 mc3 = new MyCallable2(listInt3);
	
		
		Future<List<Integer>> f1 = ex.submit(mc1);
		
		System.out.println("f1 " + f1.get());
		
		
        Future<List<Integer>> f2 = ex.submit(mc2);
		
		System.out.println("f2 " + f2.get());
		
		 Future<List<Integer>> f3 = ex.submit(mc3);
			
			System.out.println("f3 " + f3.get());
		
		
	}



}
