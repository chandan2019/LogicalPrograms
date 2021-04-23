package com.threading.completablefuture;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

public class MyCallable2 implements Callable<List<Integer>>{
	
	List<Integer> list;
	public MyCallable2(List<Integer> list){
		this.list = list;
		
	}

	@Override
	public List<Integer> call() throws Exception {
		int ar[] = new int[2];
		Thread.sleep(500);
		return list.stream().map(s-> {
			return ar [0] += s;
		}).collect(Collectors.toList());
	}


}
