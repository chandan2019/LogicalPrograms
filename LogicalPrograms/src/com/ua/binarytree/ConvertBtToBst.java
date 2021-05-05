package com.ua.binarytree;

import java.util.Arrays;

public class ConvertBtToBst {

	
	static class Node {
        Node left;
        Node right;
        int data;
    }
	
	 static Node newNode(int key)
	    {
	        Node node = new Node();
	        node.left = node.right = null;
	        node.data = key;
	        return node;
	    }
	
	 static int treeToArrayIndex = 0;// global static variable has bee used to maintain array pointer in case of
	 //creating array from Bt and From array to BT.
	 static int arrayToTreeIndex = 0;
	 
	 public static void binaryTreeNodesReplcaeWithSortedArrayValues(Node root,int[] ar) {
		 
		 if(root == null)
			 return ;
		 
		 binaryTreeNodesReplcaeWithSortedArrayValues(root.left, ar);
		 
		 root.data = ar[arrayToTreeIndex++];
		 
		 binaryTreeNodesReplcaeWithSortedArrayValues(root.right, ar);
		 
		 
	 }
	 public static void binaryTreeToBST(Node root) {
		 if(root == null)
			 return;
		 
		 int n = countNodes(root);
		 
		 int ar[] = new int[n]; /* this array can be replaced with arraylist or vector(extra traversal 
		 will not be required for knowing no. of nodes)*/
		 
		 storeInorderOfBt(root, ar);
		 
		 //Inorder of BT is sorted here
		 Arrays.sort(ar);
		 
		 binaryTreeNodesReplcaeWithSortedArrayValues(root, ar);
		 
	 }
	 
	 
	 public static void storeInorderOfBt(Node root, int ar[]) {
		 
		 if(root == null)
			 return;
		 
		 storeInorderOfBt(root.left, ar);
		 ar[treeToArrayIndex++] = root.data;
		 
		 
		 storeInorderOfBt(root.right, ar);
		 
	 }
	 
	 public static int countNodes(Node root) {
		 if(root == null)
			 return 0;
		 
		 return countNodes(root.left) + countNodes(root.right) + 1;
		 
	 }
	 
	 static void printInorder(Node node)
	 {
	     if (node == null)
	         return;
	   
	     /* first recur on left child */
	     printInorder(node.left);
	   
	     /* then print the data of node */
	     System.out.println(node.data);
	   
	     /* now recur on right child */
	     printInorder(node.right);
	 }
	public static void main(String[] args) {
		
		Node root = newNode(10);
		    root.left = newNode(30);
		    root.right = newNode(15);
		    root.left.left = newNode(20);
		    root.right.right = newNode(5);
		    
		 // convert Binary Tree to BST
		    //TC : O(n logn) due to sorting
		    //SC: O(n);
		    binaryTreeToBST(root);
		    
		    printInorder(root);
		
	}

}
