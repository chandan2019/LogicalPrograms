package com.ua.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class MaxMin {
	
	
static class Node{
		
		Node left;
		Node right;
		int data;
		Node(int data){
			left = right = null;
			this.data = data;
		}
	}

		public static int findMin(Node root) {
			if(root == null)
			    return Integer.MAX_VALUE;
			   int lmin =  findMin(root.left);
			    
			   int rmin  = findMin(root.right);
			   
			   int min = Math.min(lmin, root.data);
			   min = Math.min(min, rmin);
			   
			   return min;
			
		}
		
		public static int findMax(Node root)
		{
		    //Add your code here.
		    if(root == null)
		    return Integer.MIN_VALUE;
		   int lmax =  findMax(root.left);
		    
		   int rmax  = findMax(root.right);
		   
		   int max = Math.max(lmax, root.data);
		   max = Math.max(max, rmax);
		   
		   return max;
		    
		    
		    
		}
	public static void main(String[] args) {

		
		Node root = new Node(1);
		root.right = new Node(2);
		root.right.right = new Node(4);
		root.right.right.right = new Node(5);
		root.right.right.right.right = new Node(6);
		root.right.right.right.right.right = new Node(7);
		root.right.right.right.right.right.left = new Node(8);
		
		System.out.println("min " + findMin(root));
		System.out.println("max " + findMax(root));
		
		Queue<Node> q= new LinkedList<>(); 
		q.add(root);
		System.out.println("size " + q.size());
		
	}

}
