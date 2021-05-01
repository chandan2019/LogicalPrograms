package com.ss.binarytree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

public class FindTopViewBT {

	
    static class Node {
        Node left;
        Node right;
        int data;
    }
    
    static class Pair implements Comparable<Pair>{
    	
    	int element;
    	int level;
    	
    	Pair(int element, int level){
    		this.element = element;
    		this.level = level;
    		
    	}
		
    	@Override
		public int compareTo(Pair o) {
    		Pair p = (Pair)o;
			 if(this.level == p.level)
			 return 0;
			 else if(this.level > p.level)
				 return 1;
			 else			
				 return -1;
		}
		
		@Override
		public String toString() {
			return "Pair [element=" + element + ", level=" + level + "]";
		}

    }
    
    static TreeMap<Integer, Pair> m = new TreeMap<>();
    static TreeMap<Integer, List<Pair>> map = new TreeMap<>();
    static Node newNode(int key)
    {
        Node node = new Node();
        node.left = node.right = null;
        node.data = key;
        return node;
    }
    
    static void topView(Node root)
    {
        fillMap(root, 0, 0);
 
        for (Map.Entry<Integer, Pair> entry :
             m.entrySet()) {
            System.out.print(entry.getValue().element + " ");
        }
    }
    
    static void verticalOrder(Node root)
    {
        fillMapVerticalOrder(root, 0, 0);
 
        for (Map.Entry<Integer, List<Pair>> entry :
             map.entrySet()) {
        	
        	Stream<Integer> map2 = entry.getValue().stream().map(a->{
        		return a.element;
        	});
        	
        	map2.forEach(System.out::println);
        }
    }
    
    static void fillMap(Node root, int d, int level)
    {
        if (root == null)
            return;
 
        if (m.get(d) == null) {
            m.put(d, new Pair(root.data, level));
        }
 
        
        if (m.get(d).level > level) {
            m.put(d, new Pair(root.data, level));
        }
        fillMap(root.left, d - 1, level+1);
        fillMap(root.right, d + 1, level+1);
    }
    
    
    static void fillMapVerticalOrder(Node root, int d, int l)
    {
    	 
        if (root == null)
            return;
        
        List<Pair> list = map.get(d);
        if(list == null)
        {
        	list = new ArrayList<>();
        	list.add(new Pair(root.data, l));
        	
        }else {
        	
        	
        	list.add(new Pair(root.data, l));
        }
        Collections.sort(list);
        map.put(d, list);
        
        fillMapVerticalOrder(root.left, d - 1, l+1);
        fillMapVerticalOrder(root.right, d + 1, l+1);
    }
    
	public static void main(String[] args) {

/*		 Node root = newNode(1);
	        root.left = newNode(2);
	        root.right = newNode(3);
	        root.right.left = newNode(5);
	        root.right.right = newNode(6);
	        root.right.left.left = newNode(7);
	        root.right.left.right = newNode(8);
	        root.right.left.left.left = newNode(10);
	        root.right.left.left.right = newNode(33);
	        System.out.println("Following are nodes in"
	                           + " top view of Binary Tree");*/
		
		  Node root = newNode(1);
	        root.left = newNode(2);
	        root.right = newNode(3);
	        root.left.right = newNode(4);
	        root.left.right.right = newNode(5);
	        root.left.right.right.right = newNode(6);
	        //topView(root);
	        verticalOrder(root);
	    }
		
		
	}
