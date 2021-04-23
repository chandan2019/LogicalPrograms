package com.array;

import java.util.PriorityQueue;

public class NextPermFromPool {

	public static void main(String[] args) {

		String digits = "090";
		String lower = "0";

		String findPermut = findPermut(digits, lower);
		System.out.println("findPermut = " + findPermut);

	}

	public static String findPermut(String digits, String lower) {

		int convertingInt = Integer.parseInt(digits);
		//int parseInt2 = Integer.parseInt(lower);

		int k = 0;
		int rem[] = new int[digits.length()];
		while (convertingInt > 0) {

			rem[k] = convertingInt % 10;

			convertingInt = convertingInt / 10;
			k++;

		}

		// 100*1st min+ 10*2ndMin+1*3rd min

		// 100*3rd max+ 10*2ndMax+1*1st max
		int[] max = new int[rem.length];
		int kth = 1;
		for (int i = 0; i < rem.length; i++) {

			max[i] = findMax(rem, kth);
			
			kth++;
		}
		
		int result = 100*max[2]+10*max[1]+1*max[0];
		
		/*for(int i = 0; i < rem.length; i++) {
			
			1+
		}*/
		

		return String.valueOf(result);

	}

	public static int findMax(int[] ar, int k) {
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

		int i = 0;
		while (i < ar.length) {

			pQueue.add(ar[i]);

			if (pQueue.size() > k) {
				pQueue.poll();
			}

			i++;

		}
		return pQueue.peek();

	}

}
