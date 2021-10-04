package com.linklist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.linklist.ReverseIteratively.Node;

public class RemoveDuplicateInLinkedList {
	
	static Node head; 
	  
    static class Node { 
  
        int data; 
        Node next; 
  
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
    static class Pair{
        
        int count;
        int index;
        
        
        Pair(int count, int index){
            this.count = count;
            this.index = index;
            
        }
        public int getCount(){
            
            return count;
        }
        
        public void setCount(int count){
            
            this.count = count;
        }
        
        public int getIndex(){
            
            return index;
        }
        
         public void setIndex(int index){
            
            this.index = index;
        }
        
    }
  
    public static Node condense(Node head) {
		
    	// Write your code here
    	Node temp  = head;
       Map<Integer, Pair> map = new HashMap<>();
       int nodeIndex = 0;
        while(temp!=null){
               
       if(!map.containsKey(temp.data))
               map.put(temp.data, new Pair(1, nodeIndex++));
       else
        map.put(temp.data, new Pair(map.get(temp.data).getCount()+1, nodeIndex++));
        
        temp = temp.next;
       }
       
       List<Integer> listCountAndIndex = new ArrayList<>();
       for(Pair p : map.values()){
           
           if(p.getCount()>1){
               
               listCountAndIndex.add(p.getIndex());
           }
       }
       int removeIndex = 0;
       Node holder = null;
       temp = head;
       
       while(temp!=null){
       
       if(listCountAndIndex.contains(removeIndex+1)){
           
           holder = temp.next.next ;
          // temp.next = null;
           temp.next = holder;
           temp = temp.next;
           removeIndex++;
       }else {
       removeIndex++;
       temp = temp.next;
       }

       }
       
       return head;
       
       }

    // prints content of double linked list 
     static void printList(Node node) 
    { 
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
    } 
   
	public static void main(String[] args) {

		RemoveDuplicateInLinkedList list = new RemoveDuplicateInLinkedList(); 
        list.head = new Node(5); 
        list.head.next = new Node(15); 
        list.head.next.next = new Node(4); 
        list.head.next.next.next = new Node(6);
        list.head.next.next.next.next = new Node(5); 
        list.head.next.next.next.next.next = new Node(15); 
        list.head.next.next.next.next.next.next = new Node(20); 
        Node condense = condense(RemoveDuplicateInLinkedList.head);
        printList(condense);
		
	}

}
