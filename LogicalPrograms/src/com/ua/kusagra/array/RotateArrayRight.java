package com.ua.kusagra.array;

public class RotateArrayRight {

	public static void main(String[] args) {

		
		
		int ar[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int k = 13;
		
		arrayRotateApproach1(ar, k);
		arrayRotateApproach2(ar, k);
		
	}
	
	public static void arrayRotateApproach1(int[] ar,int k) {
		// TC : O(n)
		// SC : O(1);
		int n = ar.length;
		k = k%n;
		
		for(int i = 0;i< n; i++){
			System.out.println(ar[(i +(n - k)) % n]);
		}
		
	}
	
	public static void arrayRotateApproach2(int[] ar,int k) {
		// TC : O(n)
		// SC : O(n);
		int arnew[] = new int[ar.length];
		int n = ar.length;
		k = k%n;
		
		for(int i = 0;i< n; i++){
			
			arnew[(i + k)%n] = ar[i];
		}
		
		for(int i = 0;i< n; i++){
			
			System.out.println(arnew[i]);
			
		
		}
	}

}
