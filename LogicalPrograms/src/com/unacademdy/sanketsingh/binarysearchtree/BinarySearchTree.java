package com.unacademdy.sanketsingh.binarysearchtree;

import java.util.Scanner;

public class BinarySearchTree {

	public static class Node{
		Node left;
		Node right;
		int data;
		
		Node(int data){
			this.data = data;
			left = right = null;
		}
		
	}
	
	static Node root = null;
	public static Node buildBSTRec() {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		
		while(d != -1) {
			root = insert(root,d);
			 d = sc.nextInt();
		}
		return root;
		
	}
	
	public static Node insert(Node root, int data) {
		
		if(root == null) {
			return new Node(data);
		}
		
		if(data<root.data)
			root.left = insert(root.left,data);
		else
			root.right = insert(root.right,data);
			
		return root;
		}
	
	public static void printBST(Node root) {
		if(root == null)
			return;
		System.out.println(root.data);
		printBST(root.left);
		printBST(root.right);
	}
	
	public static void main(String[] args) {

		
		Node root = buildBSTRec();
		printBST(root);
		
	}

}
