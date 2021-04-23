package com.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerialization {

	public static void main(String a[]) throws IOException, ClassNotFoundException {
	Dog dog = new Dog(30);
	
	FileOutputStream fos = new FileOutputStream("D:\\interview\\dog.txt");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(dog);
	
	// closing streams 
    oos.close(); 
    fos.close();
    
    System.out.println("Object has been serialized");
    
    
    // De-Serializing DOg's(subclass) object  
    
    // Reading the object from a file 
    FileInputStream fis = new FileInputStream("D:\\interview\\dog.txt"); 
    ObjectInputStream ois = new ObjectInputStream(fis); 
          
    // Method for de-serialization of B's class object 
    Dog b2 = (Dog)ois.readObject(); 
          
    // closing streams 
    ois.close(); 
    fis.close(); 
          
    System.out.println("Object has been deserialized"); 
      
    System.out.println("i = " + b2.i); 
    System.out.println("j = " + b2.j);
	}
}
