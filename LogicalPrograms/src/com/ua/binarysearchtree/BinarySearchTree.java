package com.ua.binarysearchtree;

import java.util.Scanner;

public class BinarySearchTree {

	public static class Node {
		Node left;
		Node right;
		int data;

		Node(int data) {
			this.data = data;
			left = right = null;
		}

	}
	
	public static class Tuple{
		
		boolean isBst;
		int maxOfSTree;
		int minOfSTree;
		
		Tuple(boolean isBst, int max, int min){
			
			this.isBst = isBst;
			this.maxOfSTree = max;
			this.minOfSTree = min;
		}
	}
	
	/* static Node newNode(int key)
	    {
	        Node node = new Node();
	        node.left = node.right = null;
	        node.data = key;
	        return node;
	    }*/

	static Node root = null;
	static int increment = 0;
    static int lcount = 0;
    static int rcount = 0;
    static int[] result = new int[5];
    static int prev = Integer.MIN_VALUE;

	public static Node buildBSTRec() {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();

		while (d != -1) {
			root = insert(root, d);
			d = sc.nextInt();
		}
		return root;

	}

	public static Node insert(Node root, int data) {

		if (root == null) {
			return new Node(data);
		}

		if (data < root.data)
			root.left = insert(root.left, data);
		else {
			root.right = insert(root.right, data);
		}

		return root;
	}

	public static Node delete(Node root, int data) {
		if (root == null)
			return root;

		if (data < root.data) {
			root.left = delete(root.left, data);
			return root;
		} else if (data > root.data) {
			root.right = delete(root.right, data);
			return root;
		} else {
			Node temp = null;
			if (data == root.data) {

				if (root.left == null && root.right == null)
					return null;
				else if (root.left != null && root.right == null) {
					temp = root.left;
					root.left = null;
					return temp;
				} else if (root.left == null && root.right != null) {
					temp = root.right;
					root.right = null;
					return temp;
				} else {// deleting node having left and right child. Logic: search left most node of
						// RST of root node(to be deleting node)
						// replace root node data with RST left most node data.And then delete the left
						// most node.
					Node nextbig = root.right;

					while (nextbig.left != null) {

						nextbig = nextbig.left;
					}
					root.data = nextbig.data;
					root.right = delete(root.right, nextbig.data);
					return root;
				}

			}
		}
		return root.right;
	}

	public static void printBST(Node root) {
		if (root == null)
			return;
		
		printBST(root.left);
		System.out.println(root.data);
		printBST(root.right);
	}

	
	public static Tuple isBSTValid(Node root) {
		if(root == null)
			return new Tuple(Boolean.TRUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
		
		Tuple leftResult = isBSTValid(root.left);
		Tuple rightResult = isBSTValid(root.right);
		
		boolean is_bst = leftResult.isBst == Boolean.TRUE && rightResult.isBst == Boolean.TRUE 
				&& leftResult.maxOfSTree < root.data && rightResult.minOfSTree > root.data;
				
			int	max_result = Math.max(root.data, leftResult.maxOfSTree);
				max_result = Math.max(max_result, rightResult.maxOfSTree);	
				
				int	min_result = Math.min(root.data, leftResult.minOfSTree);
				min_result = Math.min(min_result, rightResult.minOfSTree);
				
				return new Tuple(is_bst,max_result, min_result  );
		
	}
	
	 public static boolean isValidBST(Node root) {
	        if(root == null)
	            return false;
	        
	        // int count  = countNode(root);
	        //System.out.println("count" + count);
	       // int[] a = new int[count];
	        inOrder(root);
	       
	        for(int i = 0;i<result.length;i++){
	        System.out.print(result[i]);
	        }
	        
	        boolean flag = true;
	        for(int i = 0;i<result.length-1;i++){
	            
	            if(result[i]>result[i++]){
	                flag =  false;
	                 break;
	            }
	            
	        }
	        return flag;
	        
	    }
	    public static int countNode(Node root){
	        
	        if(root == null)
	            return 0;
	        lcount = countNode(root.left);
	        rcount = countNode(root.right);
	        
	        return 1 + lcount + rcount;
	    }
	    public static void inOrder(Node root){
	        
	        if(root == null)
	            return;
	        inOrder(root.left);
	        result[increment++] = root.data;
	        inOrder(root.right);
	        
	    }
	    
	    public static boolean checkBtIsBst(Node root) {
	    	
	    	if(root == null)
	    	return true;
	    	
	    	boolean lcheck = checkBtIsBst(root.left);
	    	
	    	if(root.data <= prev)
	    		return false;
	    	
	    	prev = root.data;
	    	
	    	
	    	boolean rcheck = checkBtIsBst(root.right);
	    	
	    	if(lcheck && rcheck)
	    		return true;
	    	
	    	return false;
	    }
	    
	public static void main(String[] args) {

		//This will create a BST by code
		//Node root = buildBSTRec();
		
		Node root = new Node(11);
	    root.left = new Node(6);
	    root.right = new Node(13);
	    root.left.left = new Node(5);
	    root.left.right = new Node(8);
	    root.right.left = new Node(12);
	    root.right.right = new Node(14);
	    root.left.right.right = new Node(10);
	    root.left.right.left = new Node(7);
	    
		printBST(root);
		/*delete(root, 8);
		System.out.println("after delete");
		printBST(root);*/
		
		//boolean validBST = isValidBST(root);
		
		
		
		boolean validBST = checkBtIsBst(root);
		System.out.println(" validBST " + validBST);
		
		
		/*This approach will be used in different problems*/
		// every subtree is sending 3 values to its root node
		//1. is subtree is BST
		//2. max value of subtree
		//3. min value of subtree
		 Tuple bstValid = isBSTValid(root);
		System.out.println(" IsBSTValid " + bstValid.isBst);

	}
	
	//BST input
/*	10
	7
	5
	8
	12
	11
	14
	-1
*/

}
