package com.binarytree;

public class CountNodesInBt {

	
	
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
	static int fullcount = 0;
	static int halfcount = 0;
	static int leafcount = 0;
	
	public static void main(String[] args) {

		root = new Node(10);  
	    root.left = new Node(11);  
	    root.left.left = new Node(7); 
	    root.left.right = new Node(12); 
	    root.right = new Node(9);  
	    root.right.left = new Node(15);  
	    root.right.right = new Node(8);  
	    int countNode = countNode(root);
	    System.out.println(countNode);
	    countFullHalfAndLeafNode(root);
	    
	    System.out.println("fullcount " + fullcount);
	    System.out.println("halfcount " + halfcount);
	    System.out.println("leafcount " + leafcount);
	    
	    System.out.println(extremeLeftLevel(root));
	    System.out.println(extremeRightLevel(root));
	  
		
	}
	
	public static int countNode(Node root) {
		
		if(root == null)
			return 0;

			return 1 + countNode(root.left) + countNode(root.right);
		
	}
	
	public static void countFullHalfAndLeafNode(Node root) {
		
		if(root == null)
			return;
		if(root.left == null && root.right == null)
			leafcount++;
		
		if(root.left == null && root.right != null)
			halfcount++;
		
		if(root.left != null && root.right == null)
			halfcount++;
		
		if(root.left != null && root.right != null)
			fullcount++;
		
		countFullHalfAndLeafNode(root.left);
		countFullHalfAndLeafNode(root.right);
	}
	
	public static int extremeLeftLevel(Node root) {
		
		if(root == null)
			return 0;
		
		return 1 + extremeLeftLevel(root.left);
	}
	
	
	public static int extremeRightLevel(Node root) {
			
			if(root == null)
				return 0;
			
			return 1 + extremeRightLevel(root.right);
	}
	

}
