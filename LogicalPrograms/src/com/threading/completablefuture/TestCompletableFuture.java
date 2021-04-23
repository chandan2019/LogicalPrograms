package com.threading.completablefuture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

public class TestCompletableFuture {
	
	static List<Integer> listInt1 = new ArrayList<>();
	static List<Integer> listInt2 = new ArrayList<>();
	static List<Integer> listInt3 = new ArrayList<>();

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
		
	ExecutorService ex = Executors.newFixedThreadPool(5);
		
		
		MyCallable1 mc1 = new MyCallable1(listInt1);
		/*MyCallable2 mc2 = new MyCallable2(listInt2);
		MyCallable2 mc3 = new MyCallable2(listInt3);*/
		
	/*	CompletableFuture<List<Integer>> thenApplyAsync = CompletableFuture.supplyAsync(()-> {
			
			//int ar[] = new int[2];
			System.out.println(Thread.currentThread().getName());
			
			return listInt1.stream().map(s-> s+1).collect(Collectors.toList());
			
		}).thenApply(result -> {
			
			System.out.println("result" + result + "  " + Thread.currentThread().getName());
			//int ar[] = new int[2];
	
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return result.stream().map(s-> s+2).collect(Collectors.toList());
		}).thenApplyAsync(result -> {
			
			System.out.println("result2 " + result + "  " + Thread.currentThread().getName());
			return result.stream().map(s-> s+3).collect(Collectors.toList());
		});
		
		
		Future<List<Integer>> submit = ex.submit(mc1);
		System.out.println("submit " + submit.get() +" " + Thread.currentThread().getName());*/
		
		//---------------------------------------------------------------------------------
		
CompletableFuture<List<Integer>> thenApplyAsyncs1 = CompletableFuture.supplyAsync(()-> {
			
			//int ar[] = new int[2];
			System.out.println(Thread.currentThread().getName());
			
			List<Integer> collect = listInt1.stream().map(s-> s+1).collect(Collectors.toList());
			System.out.println("1st list " + collect);
			return collect;
			
		});

CompletableFuture<List<Integer>> thenApplyAsyncs2 = CompletableFuture.supplyAsync(()-> {
	
	//int ar[] = new int[2];
	
	try {
		Thread.sleep(500);
		System.out.println(Thread.currentThread().getName());
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	List<Integer> collect = listInt2.stream().map(s-> s+2).collect(Collectors.toList());
	System.out.println("2nd list " + collect);
	return collect;
	
});


CompletableFuture<List<Integer>> thenApplyAsync3 = CompletableFuture.supplyAsync(()-> {
	
	//int ar[] = new int[2];
	System.out.println(Thread.currentThread().getName());
	
	List<Integer> collect = listInt3.stream().map(s-> s+3).collect(Collectors.toList());
	System.out.println("3rd list " + collect);
	return collect;
	
});
	

    Thread.sleep(550);

		/*	
			System.out.println(thenApplyAsyncs1.get());
		
			
			System.out.println(thenApplyAsyncs2.get());
			
			System.out.println(thenApplyAsync3.get());*/
		
		
	}

}
