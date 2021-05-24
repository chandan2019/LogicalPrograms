package com.ua.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KnearestFromOrigin {
	
	
	static class Pair implements Comparable<Pair>{
		int first;
		int second;
		Pair(int first, int second){
			this.first = first;
			this.second = second;
		}
		
		
		@Override
		public int compareTo(Pair o) {
			
			 int x1 = first * first;
		        int y1 = second * second;
		        int x2 = o.first * o.first;
		        int y2 = o.second * o.second;
		        return (x1 + y1) - (x2 + y2);
		}
		
		
	}

	public static void main(String[] args) {

		
		int coor[][] = {
				{3,3},
				{5,-1},
				{-2,4}
				}; 
		
		
		findKNearest(coor, 2);
	}
	
	public static void findKNearest(int coor[][], int k) {
		
		
		
		PriorityQueue<Pair> heap = new PriorityQueue<>(Collections.reverseOrder());
	
		
		for(int i = 0;i<3;i++) {
			
			Pair p1 = new Pair(coor[i][0], coor[i][1]);
			heap.add(p1);
			
			if(heap.size()>k) {
				heap.poll();
			}
		
		
		}
		
		while(heap.size()>0) {
			Pair poll = heap.poll();
			System.out.println(poll.first + " " +  poll.second);
		}
		
		
	}

}
