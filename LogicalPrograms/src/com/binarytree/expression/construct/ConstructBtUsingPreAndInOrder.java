package com.binarytree.expression.construct;

public class ConstructBtUsingPreAndInOrder {

	public static void main(String[] args) {
		
		int pr[] = {1,2,4,8,9,10,11,5,3,6,7};
		int in[] = {8,4,9,10,11,2,5,1,6,3,7};
		
		constructBinaryTree(pr, in);

	}

	private static Node constructBinaryTree(int[] pr, int[] in) {
		
		Node root = new Node(pr[0]);
		
		int searchElementinInorder = searchElementinInorder(root.value, in);
		
		
		return null;
	}
	
	
	private static int searchElementinInorder(int value, int[] in) {
		
		for(int i=0;i<in.length; i++) {
			
			if(in[i] == value)
				return i;
				
			
		}
		
		
		
		return -1;
	}
	
	
	

}
