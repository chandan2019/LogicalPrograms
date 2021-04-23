package com.array.slidingwindow.fixedsize;

public class MaxSumSubArraySizeK {

	public static void main(String[] args) {

		int a[] = {2,5,1,8,2,9};
		int findSubArrayMaxSum = findSubArrayMaxSum(a, 3);
		System.out.println("findSubArrayMaxSum " + findSubArrayMaxSum);
		
		int findSubArrayMinSum = findSubArrayMinSum(a, 3);
		System.out.println("findSubArrayMinSum " + findSubArrayMinSum);
		
		
		
		
	}
	
	public static int findSubArrayMaxSum(int []a, int k) {
		
		int start = 0,end = 0;
		int sum = 0;
		int mx = Integer.MIN_VALUE;
		while(end < a.length) {
			
			sum = sum + a[end];
			
			if(end - start +1 <k) {
				end++;
			}else if(end - start +1 == k) {
				
				mx = Math.max(mx, sum);
				sum = sum - a[start];
				start++;
				end++;
			}
		}
		
		
		return mx;
	}
	
public static int findSubArrayMinSum(int []a, int k) {
		
		int start = 0,end = 0;
		int sum = 0;
		int mx = Integer.MAX_VALUE;
		while(end < a.length) {
			
			sum = sum + a[end];
			
			if(end - start +1 <k) {
				end++;
			}else if(end - start +1 == k) {
				
				mx = Math.min(mx, sum);
				sum = sum - a[start];
				start++;
				end++;
			}
		}
		
		
		return mx;
	}


}
