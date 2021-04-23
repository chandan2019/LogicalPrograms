package com.threading.completablefuture;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

public class MyCallable1 implements Callable<List<Integer>>{
	
	List<Integer> list;
	public MyCallable1(List<Integer> list){
		this.list = list;
		
	}

	@Override
	public List<Integer> call() throws Exception {
		int ar[] = new int[2];
		
		return list.stream().map(s-> {
			return ar [0] += s;
		}).collect(Collectors.toList());
	}

}
