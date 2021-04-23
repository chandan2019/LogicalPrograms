package com.binarytree.expression;

public class EvaluateExpressionTree {
	
	
	public static int eval(Node root) {
		
		if(root == null)
			return 0;
		
		if(root.left == null && root.right == null) {
			
			return Integer.parseInt(root.value);
		}
		
		int eval = eval(root.left);
		int eval2 = eval(root.right);
		
		if(root.value == "+")
		return eval + eval2;
		
		
		
		if(root.value == "-")
			return eval - eval2;
		
		
		
		if(root.value == "*")
			return eval * eval2;
		
			return eval / eval2;
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		Node root =  new Node("+");
		root.left = new Node("*");  
	    root.left.left = new Node("5");  
	    root.left.right = new Node("4");  
	    root.right = new Node("-");  
	    root.right.left = new Node("100");  
	    root.right.right = new Node("20");
	    
	    System.out.println(eval(root));

	}

}
