package com.test.techgig;

import java.util.Scanner;

public class WhoIsSmarter {

	/*reverse number logic inside*/
	public static int whoIsSmart(String[] input) {
		
		int i = 0;
		int max = 0;
		while(i <input.length) {
			
			int num = Integer.parseInt(input[i]);
			int rev = 0;
			
			/*
			 * */
			while(num>0) {
				
				rev = rev*10 + num%10;
				num = num/10;
			}
			
			max = Math.max(max, rev);
			i++;
		}
		
		return max;
	}
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		
		String[] splitInput = input.split(" ");
		
		System.out.println(whoIsSmart(splitInput));
		
	}

}
