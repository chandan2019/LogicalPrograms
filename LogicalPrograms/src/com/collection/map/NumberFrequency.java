package com.collection.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class NumberFrequency {
	
	public static void main(String[] args) {

		int ar[] = {2,3,4,4,3,5,4};
		int[] topKFrequent = topKFrequent(ar, 2);
		Arrays.stream(topKFrequent).forEach(System.out::println);
		
		Map<Integer, Integer> map = new HashMap<>();
		map.put(2, 1);
		map.put(3, 2);
		map.put(4, 3);
		map.put(5, 1);
		PriorityQueue<Pair> q = new PriorityQueue<>();
		
		for(Map.Entry<Integer, Integer> m : map.entrySet()) {
			
			Pair p = new Pair(m.getValue(), m.getKey());
			
			q.add(p);
			if(q.size()>2) {
				q.poll();
			}
		}
		
		while(q.size()>0) {
			Pair poll = q.poll();
			System.out.println(poll.frequency+ "   " + poll.number);
		}
		
	}
	
	static public int[] topKFrequent(int[] nums, int k) {
        // O(1) time
        if (k == nums.length) {
            return nums;
        }
        
        // 1. build hash map : character and how often it appears
        // O(N) time
        Map<Integer, Integer> count = new HashMap<>();
        for (int n: nums) {
          count.put(n, count.getOrDefault(n, 0) + 1);
        }

        // init heap 'the less frequent element first'
        Queue<Integer> heap = new PriorityQueue<>(
            (n1, n2) -> count.get(n1) - count.get(n2));
        
	
               /* (n1, n2) -> count.get(n1) - count.get(n2)*/

        // 2. keep k top frequent elements in the heap
        // O(N log k) < O(N log N) time
        for (int n: count.keySet()) {
          heap.add(n);
          if (heap.size() > k) heap.poll();    
        }

        // 3. build an output array
        // O(k log k) time
        int[] top = new int[k];
        for(int i = k - 1; i >= 0; --i) {
            top[i] = heap.poll();
        }
        return top;
    }

}
