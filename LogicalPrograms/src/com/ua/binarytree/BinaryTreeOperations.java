package com.ua.binarytree;

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
	
	static Node ans; // this is used to hold LCA node in backtracking scenario
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
	
	public static boolean lowestCommonAncestorUsingBacktracking(Node root,int p, int q ) {
		
		
		
		if(root == null)
			return false;
		
		int lresult= lowestCommonAncestorUsingBacktracking(root.left, p,q)?1:0;
		int rresult = lowestCommonAncestorUsingBacktracking(root.right, p,q)?1:0;
		int mresult = (root.data == p || root.data == q)?1:0;
		
		if(lresult + rresult + mresult >= 2)
			ans = root;
		
		return (lresult + rresult + mresult > 0);
		
	}
	
	public static int findCommonAncestor(List<Integer>pathList1, List<Integer> pathList2) {
		
		int ar1size = pathList1.size();
		int ar2size = pathList2.size();
		
		int arlenght = Math.min(ar1size, ar2size); // have to take minimum length arraylist,
		//beyond that elements could not be compared. because the min arraylist finishes here
		int ca = -1;
		boolean flag = false;
		for(int i=0;i<arlenght;i++) {  //test case1 : ar1  = [1,2,3] ar2 = [1,2,5,6]  case 2: ar1  = [1,2] ar2 = [1,2,5,6]
			
			if(pathList1.get(i) != pathList2.get(i)) {
				ca = pathList1.get(i-1);
				flag = true;
			}
		}
		
		if(flag)
		return ca;
		else
			return pathList1.get(pathList1.size()-1); 
		}
	
	public static int distanceOfNodeFromRoot(Node root, int data) {
		
		int dist = -1;
		if(root == null)
			return -1;
		
		if(root.data == data ||
				(dist = distanceOfNodeFromRoot(root.left, data))>=0
				|| (dist = distanceOfNodeFromRoot(root.right, data))>=0 )
			return dist+1;
		
		return dist;
	}
	
	
	public static int distanceBetween2Nodes(Node root, int p, int q) {
		// Dist(p, q) = Dist(root, p) + Dist(root, q) -2 * Dist(Root, LCA)
		//1.  LCA to be calculated
		//2. distance from root to node
		
		if(root == null)
			return -1;
		boolean lca = lowestCommonAncestorUsingBacktracking(root, p, q);
		int dist = distanceOfNodeFromRoot(root, p) + distanceOfNodeFromRoot(root, q) - 2 * distanceOfNodeFromRoot(root, ans.data);
		
		return dist;
	}
	
	
	public static int distanceBetween2Nodes2ndApproach(Node root,int p,int q) {
		
		//Dist(p, q) = Dist(LCA, p) + Dist(LCA, q)
		if(root == null)
			return -1;
		boolean lca = lowestCommonAncestorUsingBacktracking(root, p, q);
		int dist = distanceOfNodeFromRoot(ans, p) + distanceOfNodeFromRoot(ans, q); // LCA is stored in ans node.
		
		return dist;
		
	}
	public static void main(String[] args) {

		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.left.left.left = new Node(8);
		root.left.right.right = new Node(9);
		root.right.left.left = new Node(10);
		root.right.right.right = new Node(11);
		
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
		System.out.println("least comon ancestor  = " + lca);
		
		/*----------------------END--------------------------------*/
		
		
		/*Below logic is back tracking logic to find path od node from root, i.e at time of returning on our returned results we are storing 
		 * data in out list*/
		
		Stack<Integer> pathList3 = new Stack<>();
		System.out.println("Back Tracking");
		findNodePathFromRootByBackTracking(root, pathList3, p);
		
		while(pathList3.size()>0) {
			
			System.out.println(pathList3.pop());
		}
		
		/*-------------------END--------------------------*/
		
		
		
		/*LCA by 2nd approach, backtracking*/
		//TC : O(n) 
		//SC : O(n) : for recursive call
		lowestCommonAncestorUsingBacktracking(root, p, q);
		System.out.println("lCA ans = " + ans.data);
		
		
		int distanceOfNodeFromRoot = distanceOfNodeFromRoot(root, p);
		
		System.out.println("distanceOfNodeFromRoot = " + distanceOfNodeFromRoot);
		
		/*1st Approach*/
		int distanceBetween2Nodes = distanceBetween2Nodes(root, p, q);
		
		System.out.println("distanceBetween2Nodes  = " + distanceBetween2Nodes);
		
		/*2nd approach*/
		int distanceBetween2Nodes2ndApproach = distanceBetween2Nodes2ndApproach(root, p, q);
		
		System.out.println("distanceBetween2Nodes2ndApproach  = " + distanceBetween2Nodes2ndApproach);
		
	}

}
