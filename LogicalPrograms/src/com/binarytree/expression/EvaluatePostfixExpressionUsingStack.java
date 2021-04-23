package com.binarytree.expression;

import java.util.Stack;

public class EvaluatePostfixExpressionUsingStack {

	public static void main(String[] args) {

		
		char a[] = {'2','1','+','3','*','3','/'};
		
		System.out.println(evaluateExp(a));
		
	}
	
	public static int evaluateExp(char ar[]) {
		
		Stack<Integer> stk = new Stack<>();
		
		int a = 0, b = 0, sum = 0;
		
		for(int i=0;i<ar.length;i++) {
			
			if(!isOperator(ar[i])) {
				stk.push(Integer.parseInt(String.valueOf(ar[i])));
				
			}else {
				
				a = stk.pop();
				b = stk.pop();
				if(ar[i] == '+')
				sum = b + a;
				
				if(ar[i] == '-')
					sum = b - a;
				
				
				if(ar[i] == '*')
					sum = b * a;
				
				
				if(ar[i] == '/')
					sum = b / a;
				stk.push(sum);
				
			}
			
		}
		
		
		return stk.pop();
	}

	private static boolean isOperator(char c) {

		if(c == '+' || c == '-' || c == '*' || c == '/' )
			return true;
		
		return false;
	}

}
