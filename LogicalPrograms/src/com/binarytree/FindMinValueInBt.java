package com.binarytree;

public class FindMinValueInBt {
	
	
	
	
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
	static int min = 0;

	public static void main(String[] args) {

		
		root = new Node(10);  
	    root.left = new Node(11);  
	    root.left.left = new Node(7); 
	    root.left.right = new Node(12); 
	    root.right = new Node(9);  
	    root.right.left = new Node(15);  
	    root.right.right = new Node(8); 
	    
	    System.out.println( countMaxValueRoots(root));
	   
		
	}
	
	public static int searchMinValue(Node root) {
		 
		if(root == null)
			return min;
		
		searchMinValue(root.left);
		
		if(root.key < min)
			min = root.key;
		
		searchMinValue(root.right);
		
		return min;
	}
	
	public static int countMaxValueRoots(Node root) {
	    
		int count = 0;
	        if (root == null)
	        	return 0;
	        
	        int ret = root.key;
	        int left = countMaxValueRoots(root.left);
	        int right = countMaxValueRoots(root.right);
	        
	        if(ret>left && ret >right)
	        	count++;
	        
	        return count;
	       
	}

}
