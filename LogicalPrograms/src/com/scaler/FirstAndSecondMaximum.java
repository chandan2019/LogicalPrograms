package com.scaler;

import java.math.BigDecimal;

public class FirstAndSecondMaximum {

	public static void main(String[] args) {

		int a[] = {5, 17, 100, 11};
		
		BigDecimal d = new BigDecimal("27908.86");
		BigDecimal b = new BigDecimal("801756.66");
		BigDecimal divide = b.divide(d,4, BigDecimal.ROUND_DOWN);
		
		System.out.println("divide " + divide);
		
		//findFirstAndSecondMaximum(a);
		
	}
	
	public static void findFirstAndSecondMaximum(int[] a) {
	
	
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
			for(int i = 0; i< a.length; i++) {
		
				if(firstMax < a[i]) {
					secondMax = firstMax;
					firstMax = a[i];
				}
		
			}
			
			/*System.out.println("firstMax " + firstMax);
			System.out.println("secondMax " + secondMax);*/
}
	
}
