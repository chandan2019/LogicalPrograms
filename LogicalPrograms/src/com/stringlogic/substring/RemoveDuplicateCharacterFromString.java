package com.stringlogic.substring;

import java.util.Arrays;

public class RemoveDuplicateCharacterFromString {

	public static void main(String[] args) {

		String str = "geeks for geeks";

		//System.out.println(removeDup(str));
		
		/*System.out.println(removeDuplicatesWithoutCreatingNewString(str));
		
		
		String str1 = "geeks for geeks";
		
		System.out.println(removeGivencharacterWhichArePresent(str1, "mesk"));*/
		
		String str2 = "geeks for geeks";
		
		System.out.println("----------------------------------------");
		System.out.println(removeDuplicateCharacterUsingIndexOf(str2));
	}

	
	public static String removeDuplicateCharacterUsingIndexOf(String str1) {
		
		String str = new String(); 
        int len = str1.length(); 
          
        // loop to traverse the string and 
        // check for repeating chars using 
        // IndexOf() method in Java 
        for (int i = 0; i < len; i++)  
        { 
            // character at i'th index of s 
            char c = str1.charAt(i); 
              
            // if c is present in str, it returns 
            // the index of c, else it returns -1 
            if (str.indexOf(c) < 0) 
            { 
                // adding c to str if -1 is returned 
                str += c; 
            } 
        } 
          
        return str; 
	}
	public static String removeDup(String str) {

		boolean[] charexist = new boolean[256];
		Arrays.fill(charexist, false);
		char[] strarr = str.toCharArray();

		String strnew = "";
		for (int i = 0; i < strarr.length; i++) {

			if (strarr[i] == ' ') {
				continue;
			}
			if (charexist[strarr[i]] == false) {
				charexist[strarr[i]] = true;
				strnew = strnew + strarr[i];
			}
		}
		return strnew;

	}
	
	public static String removeDuplicatesWithoutCreatingNewString(String str) {
		
		boolean[] charexist = new boolean[256];
		Arrays.fill(charexist, false);
		char[] strarr = str.toCharArray();
		
		int res_ind = 0, cur_ind = 0;
		for(int i=0;i<strarr.length;i++) {
			
			if(charexist[strarr[i]] == false) {
				strarr[res_ind] = strarr[cur_ind];
				charexist[strarr[i]] = true;
				res_ind++;
				
			}
			cur_ind++;
		}
		
		str = new String(strarr);
		
		return str.substring(0, res_ind);
	}
	
	public static String removeGivencharacterWhichArePresent(String str, String remove) {
		
		
		int[] charar = new int[256];
		char[] removechar = remove.toCharArray();
		
		for(int i=0;i<removechar.length;i++) {
			
			charar[removechar[i]] = 1;
			
		}
		
		char[] strar = str.toCharArray();
		String strnew = "";
		for(int i=0; i<strar.length;i++) {
			
			if(strar[i] == ' ') {
				continue;
			}
			
			if(charar[strar[i]] == 0) {
				
				strnew = strnew+strar[i];
			}
			
		}
		
		return strnew;
		
	} 
}
