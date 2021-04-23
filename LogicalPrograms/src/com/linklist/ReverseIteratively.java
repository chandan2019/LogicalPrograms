package com.linklist;

public class ReverseIteratively {

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
  
    /* Function to reverse the linked list */
  
    Node reverse(Node node) {
		
    	Node prev = null;
    	Node current = node;
    	Node temp = null;
    	
    	while(current != null) {
    		
    		temp = current.next;
    		current.next = prev;
    		 prev = current;
    		current = temp;
    		
    	}
    	
    	return prev;
    	
    	
    }
    
    
   public  Node reverseRecursive(Node node) {
		
	  // Node temp = node;
	   if(node.next == null)	
		   return node;
	   
	  
	   Node newhead = reverseRecursive(node.next); 
	   node.next.next = node;
	   node.next = null;
	   
	   return newhead;
    	
    }
  
    // prints content of double linked list 
    void printList(Node node) 
    { 
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
    } 
  
    public static void main(String[] args) 
    { 
    	ReverseIteratively list = new ReverseIteratively(); 
        list.head = new Node(85); 
        list.head.next = new Node(15); 
        list.head.next.next = new Node(4); 
        list.head.next.next.next = new Node(20); 
  
        System.out.println("Given Linked list"); 
        list.printList(head); 
       /* head = list.reverse(head); 
        System.out.println(""); 
        System.out.println("Reversed linked list "); 
        list.printList(head);*/ 
        
        head = list.reverseRecursive(head); 
        System.out.println();
        System.out.println("Reversed linked list "); 
        list.printList(head);
    } 

}
