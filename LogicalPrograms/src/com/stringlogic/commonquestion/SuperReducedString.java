package com.stringlogic.commonquestion;

public class SuperReducedString {
	
	static StringBuilder sb = new StringBuilder(); 

	public static void main(String[] args) {

		String str = "adaad";

		//System.out.println("str : " + superReducedStringUsingRecursion(str));
		
		
		//System.out.println("str : " + superReducedStringUsingDeleteMethod(str));
		reducedString(str);
		System.out.println(sb.toString());

	}
	
	public static String superReducedStringUsingDeleteMethod(String str) {
		
		   // Scanner in = new Scanner(System.in);
		    StringBuilder s = new StringBuilder(str);
		      for(int i=1;i<s.length();i++)
		      { 
		        if(s.charAt(i)==s.charAt(i-1))
		        { 
		            s.delete(i-1,i+1);
		             i=0;
		        }
		      }
		    if(s.length()==0)
		    	return "Empty String";
		    else 
		    	return s.toString();  
		
		
	}

	public static String superReducedStringUsingRecursion(String s) {

		String str = "";

		if (s.length() == 1)
			return s;

		if (s.length() == 2) {

			if (s.charAt(0) == s.charAt(1))
				return "";
			else
				return s;

		}

		if (s.charAt(0) == s.charAt(1)) {

			str = /*str +*/ superReducedStringUsingRecursion(s.substring(2));
		} else {
			str = /*str + */s.charAt(0) + superReducedStringUsingRecursion(s.substring(1));

		}

		
		if (str.length() == 2) {

			if (str.charAt(0) == str.charAt(1))
				return "";
			else
				return str;

		}
		return str;

	}
	
	//this is not a valid approach, its failing for abccbd 
	public static void reducedString(String s) {
		
		if(s.length() == 1) {
			sb.append(s);
		return;	
		}
		
		if(s.charAt(0) != s.charAt(1)) {
			sb.append(s.charAt(0));
			reducedString(s.substring(1));
		}
		else {
			
			reducedString(s.substring(2));
		}
		
		s = sb.toString();
		sb = new StringBuilder();
		
		reducedString(s);
		
	}

}
