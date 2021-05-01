package com.ss.binarytree;

public class LevelOrderRecursively {

	static class Node {
		int data;
		Node left, right;

		public Node(int item) {
			data = item;
			left = right = null;
		}
	}

	/* function to print level order traversal of tree */
	static void printLevelOrder(Node root) {
		int h = height(root);
		int i;
		for (i = 0; i <= h; i++) {
			printGivenLevel(root, i, i);
		
		}
	}
	
	
	/* function to print level order traversal of tree */
	static void printLevelOrderLevelWise(Node root) {
		int h = height(root);
		int i;
		for (i = 0; i <= h; i++) {
			printGivenLevel(root, i, i);
		System.out.println();
		
		}
	}

	
	/* function to print level order traversal of tree */
	static void printLevelOrderInSpiralForm(Node root) {
		int h = height(root);
		int i;
		for (i = 0; i <= h; i++) {
			// passing 3rd argument to make decision for printing nodes from L to R, or R to L
			printLevelOrderLevelWiseInSpiral(root, i, i);
		System.out.println();
		}
	}
	/*
	 * Compute the "height" of a tree -- the number of nodes along the longest path
	 * from the root node down to the farthest leaf node.
	 */
	static int height(Node root) {
		if (root == null)
			return 0;
		else {
			/* compute height of each subtree */
			int lheight = height(root.left);
			int rheight = height(root.right);

			/* use the larger one */
			if (lheight > rheight)
				return (lheight + 1);
			else
				return (rheight + 1);
		}
	}

	/* Print nodes at the given level */
	static void printGivenLevel(Node root, int level, int temp) {
		if (root == null)
			return;
		if (level == 1)
			System.out.print(root.data + " ");
		else if (level > 0) {
			printGivenLevel(root.left, level - 1, temp);
			printGivenLevel(root.right, level - 1, temp);
			
		}
	}

	
	/* Print nodes at the given level */
	static void printLevelOrderLevelWiseInSpiral(Node root, int level, int temp) {
		if (root == null)
			return;
		if (level == 0)
			System.out.print(root.data + " ");
		else if (level > 0) {
			if(temp % 2 == 0) {// as level value is changing so needed a temp which will unchange on different levels
			printGivenLevel(root.left, level - 1, temp);
			printGivenLevel(root.right, level - 1, temp);
			}else if(temp%2 != 0){
				printGivenLevel(root.right, level - 1, temp);
				printGivenLevel(root.left, level - 1, temp);
				
			}
		}
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

		System.out.println("Level order traversal of binary tree is ");
		printLevelOrder(root);
		System.out.println();
		
		System.out.println("Level order Level wise of binary tree is ");
		printLevelOrderLevelWise(root);
		
		System.out.println("Level order level wise in spiral form ");
		printLevelOrderInSpiralForm(root);
	}

}
