package com.test.student;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
        int size;

        System.out.println("Enter the amount of students:");
        size = sc.nextInt();
        Student[] myStudent = new Student[size];
        String firstName;
        String lastName;
        Student s;

        for (int i=0; i < size; i++)
        {

        s = new Student(); 
        System.out.println("Enter first name of student: " + i);
        firstName = sc.next();

        System.out.println("Enter last name if student: " +i);
        lastName = sc.next();
        
        s.setFname(firstName);
        s.setLname(lastName);
        myStudent[i] = s;
        
        }
	
        
        for (int i = 0; i < myStudent.length; i++)
        {
            System.out.println(myStudent[i].getFname());
            System.out.println(myStudent[i].getLname());
        }
	
        
        StringBuilder s1 = new StringBuilder();
        
	}
	
}
