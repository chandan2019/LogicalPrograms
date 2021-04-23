package com.binarytree;

public class BinaryTreeHeight {
	
	
	static class Node  
	{  
	    int key;  
	    Node left, right;  
	      
	    // Constructor  
	    Node(int key) 
	    {  
	        this.key = key;  
	        left = null;  
	        right = null;  
	    }  
	} 
	
	static Node root = null;

	public static void main(String[] args) {

		root = new Node(10);  
	    root.left = new Node(11);  
	    root.left.left = new Node(7); 
	    root.left.right = new Node(12); 
	    root.right = new Node(9);  
	    root.right.left = new Node(15);  
	    root.right.right = new Node(8);  
	    
	    System.out.println(height(root));
		
	}

	static int height(Node root) {
		
		if(root == null)
			return 0;
		
		int lheight = height(root.left);
		int lright = height(root.right);
		
		return 1 + Math.max(lheight, lright);
	}
}
