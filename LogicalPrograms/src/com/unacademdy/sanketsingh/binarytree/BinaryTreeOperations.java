package com.unacademdy.sanketsingh.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class BinaryTreeOperations {

	static class Node{
		
		Node left;
		Node right;
		int data;
		Node(int data){
			left = right = null;
			this.data = data;
		}
	}
	
	public static boolean findNodePathFromRoot(Node root, List<Integer> pathList, int data){
		
		
		if(root == null)
			return false;
		pathList.add(root.data);
		
		if(root.data == data)
			return true;
		
		boolean lpath = findNodePathFromRoot(root.left, pathList, data);
		boolean rpath = findNodePathFromRoot(root.right, pathList, data);
		
		if(lpath || rpath)
			return true;
		
		pathList.remove(pathList.size()-1);
		
		return false;
		
		
	}
	
	public static boolean findNodePathFromRootByBackTracking(Node root, Stack<Integer>pathList1, int data) {
		
		if(root == null)
			return false;
		
		boolean lpath = findNodePathFromRootByBackTracking(root.left,pathList1, data );
		boolean rpath = findNodePathFromRootByBackTracking(root.right,pathList1, data );
		
		if(lpath || rpath || root.data == data) {
			pathList1.add(root.data);
			return true;
		}
		
		
		
		return false;
	}
	
	/*public static boolean lowestCommonAncestor(Node root, List<Integer> l1, List<Integer> l2, int p, int q, int ) {
		
		
		
		if(root == null)
			return false;
		
		if(root.data == data)
			return true;
		
	}*/
	
	public static int findCommonAncestor(List<Integer>pathList1, List<Integer> pathList2) {
		
		int ar1size = pathList1.size();
		int ar2size = pathList2.size();
		
		int arlenght = Math.max(ar1size, ar2size);
		
		for(int i=0;i<arlenght;i++) {
			
			if(pathList1.get(i) != pathList2.get(i))
				return pathList1.get(i-1);
			
		}
		
		return -1;
		}
	
	public static void main(String[] args) {

		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		/*root.left.left.left = new Node(8);
		root.left.right.right = new Node(9);
		root.right.left.left = new Node(10);
		root.right.right.right = new Node(11);*/
		
		List<Integer> pathList1 = new ArrayList<>();
		List<Integer> pathList2 = new ArrayList<>();
		System.out.println("enter nodes to find its path from root");
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int q = sc.nextInt();
		
		/* path of node from root is used to find LCA(least common ancestor) */
		
		findNodePathFromRoot(root, pathList1, p);
		System.out.println("path of node p from root");
		pathList1.stream().forEach(System.out::println);
		
		findNodePathFromRoot(root, pathList2, q);
		System.out.println("path of node q from root");
		pathList2.stream().forEach(System.out::println);
		
		int lca = findCommonAncestor(pathList1, pathList2);
		System.out.println("least comon ancestor " + lca);
		
		/*----------------------END--------------------------------*/
		
		//lowestCommonAncestor(root);
		
		
		/*Below logic is back tracking logic to find path od node from root, i.e at time of returning on our returned results we are storing 
		 * data in out list*/
		
		Stack<Integer> pathList3 = new Stack<>();
		System.out.println("Back Tracking");
		findNodePathFromRootByBackTracking(root, pathList3, p);
		
		while(pathList3.size()>0) {
			
			System.out.println(pathList3.pop());
		}
		
		/*-------------------END--------------------------*/
	}

}
