package com.ua.binarytree;

public class CountNodes {

	static class Node {

		Node left;
		Node right;
		int data;

		Node(int data) {
			left = right = null;
			this.data = data;
		}
	}

	static int cnt;

	public static int getSize(Node root) {
		// add Code here.

		if (root == null)
			return 0;

		return getSize(root.left) + getSize(root.right) + 1;

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
		int size = getSize(root);

		System.out.println("size " + size);
	}

}
