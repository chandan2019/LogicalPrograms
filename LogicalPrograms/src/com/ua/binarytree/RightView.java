package com.ua.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightView {
	
	static class TreeNode {

		TreeNode left;
		TreeNode right;
		int val;
	}

	static TreeNode newNode(int data) {

		TreeNode node = new TreeNode();
		node.left = node.right = null;
		node.val = data;
		return node;
	}
	
public static List<Integer> rightSideView(TreeNode root) {
        
        Queue<TreeNode> q  = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
       if(root == null)
           return list;

        q.add(root);
        while(!q.isEmpty()){
            
            int size = q.size();
            
            for(int i = 0; i<size; i++){
                
                TreeNode temp = q.poll();
                 
                if(i == size-1 )
                   list.add(temp.val);
                
                if(temp.left != null)
                    q.add(temp.left);
                
                if(temp.right != null)
                    q.add(temp.right);
            }
            
        }
        
        return list;
        
    }


	public static void main(String[] args) {

		TreeNode root = newNode(1);
		root.left = newNode(2);
		root.right = newNode(3);
		root.left.right = newNode(5);
		root.right.right = newNode(4);
		//root.left.right.right = newNode(5);
		//root.left.right.right.right = newNode(6);
		List<Integer> rightSideView = rightSideView(root);
		
		rightSideView.forEach(System.out::print);
		
	}

}
