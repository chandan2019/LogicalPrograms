package com.unacademdy.sanketsingh.binarysearchtree;

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

	static Node root = null;
	static int increment = 0;
    static int lcount = 0;
    static int rcount = 0;
    static int[] result = new int[5];

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
		System.out.println(root.data);
		printBST(root.left);
		printBST(root.right);
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
	public static void main(String[] args) {

		Node root = buildBSTRec();
		printBST(root);
		/*delete(root, 8);
		System.out.println("after delete");
		printBST(root);*/
		
		boolean validBST = isValidBST(root);
		
		System.out.println("validBST " + validBST);

	}

}
