package com.ss.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class LeftViewOfBt {

	static class Node {

		Node left;
		Node right;
		int data;
	}

	static Node newNode(int data) {

		Node node = new Node();
		node.left = node.right = null;
		node.data = data;
		return node;
	}

	public static void printTree(Node root) {

		if (root == null)
			return;

		printTree(root.left);
		System.out.println(root.data);
		printTree(root.right);
	}

	public static void leftView(Node root) {

		if (root == null)
			return;
		Queue<Node> queue = new LinkedList<>();

		queue.add(root);
		while (!queue.isEmpty()) {

			int n = queue.size();
			for (int i = 1; i <= n; i++) {
				Node node = queue.poll();

				if (i == 1) {

					System.out.println(node.data);
				}

				if (node.left != null) {
					queue.add(node.left);
				}

				if (node.right != null) {
					queue.add(node.right);
				}

			}
		}

	}

	public static void main(String[] args) {

		Node root = newNode(1);
		root.left = newNode(2);
		root.right = newNode(3);
		root.left.right = newNode(4);
		root.left.right.right = newNode(5);
		root.left.right.right.right = newNode(6);

		leftView(root);
		// printTree(root);

	}

}
