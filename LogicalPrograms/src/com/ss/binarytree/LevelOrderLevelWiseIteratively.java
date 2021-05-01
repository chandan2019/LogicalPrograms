package com.ss.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderLevelWiseIteratively {

	
	static class Node
	{
	    int data;
	    Node left, right;
	    public Node(int item)
	    {
	        data = item;
	        left = right = null;
	    }
	}
	//this function going infinite
	/*public static Node levelOrderTraversal(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		while(!q.isEmpty()) {
			if(q.peek() == null) {
				q.poll();
				System.out.println();
			}
			if(q.size() == 0)
				break;
			while(q.peek() != null) {
			 Node temp = q.poll();
			System.out.print(" " + temp.data);
			
			if(temp.left != null) {
			q.add(temp.left);
			}
			if(temp.right != null) {
			q.add(temp.right);
			}
			
			}
			q.add(null);
		}
		
		return root;
		
	}*/ 
	
	
	public static void levelOrderTraversal(Node root) {
		if (root == null)
		      return;
		  
		    Queue<Node> q = new LinkedList<>();
		  
		    // Pushing root node into the queue.
		    q.add(root);
		  
		    // Pushing delimiter into the queue.
		    q.add(null);
		  
		    // Executing loop till queue becomes
		    // empty
		    while (!q.isEmpty()) {
		  
		      Node curr = q.poll();
		  
		      // condition to check the
		      // occurence of next level
		      if (curr == null) {
		        if (!q.isEmpty()) { // last level null will try to add multiple null, so checking here
		          q.add(null);
		          System.out.println();
		        }
		      } else {
		        // Pushing left child current node
		        if (curr.left != null)
		          q.add(curr.left);
		  
		        // Pushing right child current node
		        if (curr.right != null)
		          q.add(curr.right);
		  
		        System.out.print(curr.data + " ");
		      }
		    }		
	} 

	public static void main(String[] args) {

			Node  root= new Node(1);
	       root.left= new Node(5);
	       root.right= new Node(30);
	       root.left.left= new Node(11);
	       root.left.right= new Node(8);
	       /*root.right.left= new Node(15);
	       root.right.right= new Node(31);
	       root.left.right.left= new Node(6);
	       root.left.right.right= new Node(10)*/;
	       
	       levelOrderTraversal(root);
		
	}

}
