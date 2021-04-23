package com.stringlogic.commonquestion;

public class StringReverse {

	public static void main(String[] args) {

		
		String str = "chandan";
		
		System.out.println(reverses(str));
	}
	
	public static String reverses(String str) {
		
		if(str.length() == 0) {
			return str;
		}
		
		String reverses = reverses(str.substring(1)) + str.charAt(0);
		System.out.println(str.charAt(0));
		System.out.println(str);
		return reverses;
	}

}

/* + n
n + a
an + d
dan + n
ndan + a
andan + h
handan , 

chandan, handan + c,andan + h, ndan + a, dan + n,an + d,n + a,null+ n*/

/*foor(a, b){
	return a+b;
}

foor(a,b);*/




