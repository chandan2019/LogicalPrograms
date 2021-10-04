package com.scaler;

import java.util.Scanner;

public class RightRotateArray {

	public static void main(String[] args) {

		
		 Scanner s = new Scanner(System.in);
	        String firstInputLine = s.nextLine();
	        int toBeRightShift = s.nextInt();
	        String firstInputString[] = firstInputLine.split(" ");
	        int arLength = Integer.parseInt(firstInputString[0]);
	        
	        int a[] = new int[arLength];
	        int arIndex = 0;
	        
	        for(int i = 1; i<firstInputString.length; i++ ){
	            a[arIndex] = Integer.parseInt(firstInputString[i]);
	            arIndex++;
	            
	        }
	        
	      /*  for(int i = 0; i<arLength; i++){
	            System.out.println("startIndexsss" + a[i]);
	        }*/
	        
	        int resultArray[] = new int[arLength];
	        
	        int startIndex = arLength - toBeRightShift;
	        arIndex = 0;
	        //System.out.print("startIndex" + startIndex);
	        for(; startIndex< arLength; startIndex++){
	            
	            resultArray[arIndex] = a[startIndex];
	            arIndex++;
	        }
	        
	         System.out.println("arIndex" + arIndex);
	       //  int j = 0; 
	         startIndex = arLength - toBeRightShift;
	        for(int j = 0; j<startIndex; j++){
	            resultArray[arIndex++] = a[j];
	        }
	        //resultArray[arIndex] = a[j];
	        
	        for(int i = 0; i<resultArray.length; i++){
	            
	            System.out.print(resultArray[i]);
	            
	        }	}

}
