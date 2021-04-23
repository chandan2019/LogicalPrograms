package com.stringlogic.substring;

public class AllSubstring {

    static void subString(char str[], int n) {
        // Pick starting point
        for (int len = 1; len <= n; len++) {
            // Pick ending point
            for (int i = 0; i <= n - len; i++) {
                //  Print characters from current
                // starting point to current ending
                // point.  
                int j = i + len - 1;
                for (int k = i; k <= j; k++) {
                    System.out.print(str[k]);
                }
 
                System.out.println();
            }
        }
    }
    
    
    static void subStrings(String str, int length) {
    	
    	
    	for(int i=0;  i<length; i++) {
    		
    		for(int j=i+1; j<=length;j++) {
    			
    			String substr = str.substring(i, j);
    			
    			if(substr.chars().distinct().count() == 2) {
    				
    				System.out.println(substr);
    			}
    			
    		}
    	}
    }
 
// Driver program to test above function
    public static void main(String[] args) {
        //char str[] = {'a', 'b', 'c'};
        String str = "aba";
        char strc[] = str.toCharArray();
        //subString(strc, strc.length);
        
        System.out.println("----------------------");
        subStrings(str, str.length());
 
    }

}
