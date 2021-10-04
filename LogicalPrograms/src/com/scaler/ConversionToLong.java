package com.scaler;

import java.util.ArrayList;
import java.util.List;

public class ConversionToLong {

	public static void main(String[] args) {
		
		
		int a[] = new int[] {9,9,9,9,9 };
		//2, 5, 6, 8, 6, 1, 2, 4, 5
		int[] usingStaticArray = usingStaticArray(a);
		
		for(int i = 0; i< usingStaticArray.length; i++) {
			
			System.out.println(usingStaticArray[i]);
		}
		
		
		List<Integer> ad = new ArrayList<Integer>();
		ad.add(2);
		ad.add(5);
		ad.add(6);
		ad.add(8);
		ad.add(6);
		ad.add(1);
		ad.add(2);
		ad.add(4);
		ad.add(5);
		//usingDynamicArray(ad);

	}
	
	private static List<Integer> usingDynamicArray(List<Integer> A){
		
		StringBuilder s = new StringBuilder();
        ArrayList<Integer> B = new ArrayList<>(10);
        Integer n = new Integer(1);
        for(int i=0; i <A.size(); i++){
            
            if(A.get(0) == 0){
               // continue;
             A.add(1);
             return A;
            }else{
                
                s.append(A.get(i));
            }
        }
        
        //int B[] = new int[A.length+1];
        //System.out.println("S" + s.length()); String have length method
        long num = Long.parseLong(s.toString());
        num = num + 1;
        
       /* A.clear();
        if(num == 1){
            A.add(1);
            return A;
        }*/
       
        
        
        int i=0;
        while(num>0){
            
            B.add((int)num%10);
            num = num/10;
            i++;
        }
        return B;
		
		
		
	}
	
	private static int[] usingStaticArray(int[] A) {
		StringBuilder s = new StringBuilder();
        for(int i=0; i <A.length; i++){
            
            if(A[0] == 0){
                //continue;
            	A[0] = 1;
            	return A;
            }else{
                
                s.append(A[i]);
            }
        }
        
        int B[] = new int[A.length+1];
        //System.out.println("S" + s.length()); String have length method
        long num = s.length()==0?  0 : Long.parseLong(s.toString());
        num = num + 1;
        
        /*if(num == 1){
            B[0] = 1;
            return B;
        }*/
       
        
        
        int i=B.length-1;
        while(num>0){
            
            B[i] =(int)num%10;
            num = num/10;
            i--;
        }
        
        return B;
        
        //TC : O(n)
        //SC : O(1)
		
		
	}
}
