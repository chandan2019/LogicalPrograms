package com.binarytree.expression;

public class EvaluatePostfixExpressionWithoutStack {
	
	
	public static void main(String[] args) {

		
		//char a[] = {'2','1','+','3','*','3','/'};
		String a = "21+2*3/";
		
		System.out.println(evaluateExp(a));
		
	}
	
	public static int evaluateExp(String ar) {
		//str.toCharArray();
		StringBuilder str = new StringBuilder(ar);
		/*
		char a = ar[0]; 
		char b = ar[1];*/
		//int result = 0;
		int result = 0;
		StringBuilder resultS = new StringBuilder();
		
		for(int i = 0; i<str.length(); i++) {
			
			/*if(!isOperator(ar.charAt(i))) {
				
				a = b;
				b = ar[i];
			}else */
			resultS = new StringBuilder();
			if(isOperator(str.charAt(i))){
				
				if(str.charAt(i) == '+') {
					result = Integer.parseInt(String.valueOf(str.charAt(i-1))) + Integer.parseInt(String.valueOf(str.charAt(i-2)));
					str = resultS.append(result).append(str.substring(i+1));
				}
					
					if(str.charAt(i) == '-') {
						result = Integer.parseInt(String.valueOf(str.charAt(i-1))) - Integer.parseInt(String.valueOf(str.charAt(i-2)));
						str = resultS.append(result).append(str.substring(i+1));
					
					}
						
					
					
					if(str.charAt(i) == '*') {
						
						result = Integer.parseInt(String.valueOf(str.charAt(i-1))) * Integer.parseInt(String.valueOf(str.charAt(i-2)));
						str = resultS.append(result).append(str.substring(i+1));
					}
						
					
					
					if(str.charAt(i) == '/') {
						result = Integer.parseInt(String.valueOf(str.charAt(i-1))) / Integer.parseInt(String.valueOf(str.charAt(i-2)));
						str = resultS.append(result).append(str.substring(i+1));
						
					}
						
				
			}
			
			
		}
		
		
		
		
		return result;
		
	}
	
	private static boolean isOperator(char c) {

		if(c == '+' || c == '-' || c == '*' || c == '/' )
			return true;
		
		return false;
	}

}
