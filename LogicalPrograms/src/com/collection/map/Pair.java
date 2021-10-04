package com.collection.map;

public class Pair implements Comparable<Pair>{

	Integer frequency;
	Integer number;
	
	Pair(int f, int n){
		
		this.frequency = f;
		this.number = n;
	}

	@Override
	public int compareTo(Pair o) {

		return this.frequency.compareTo(o.frequency);
	}
}
