package com.stringlogic.commonquestion;

public class StringOrderPresent {
	
	public static void main(String[] args) {
		
		
		//checkIfIsHacker("haakcckkerrannkk");
		System.out.println(checkIfIsHacker("jadfancsadhadandsan"));
		
	}
	
	
	private static String checkIfIsHacker(String s) {

        String str = "chandan";
        if (s.length() < str.length()) {
            return "NO";
        }
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (j < str.length() && s.charAt(i) == str.charAt(j)) {
                    j++;
            }
        }
        return (j == str.length() ? "YES" : "NO");

    }

}
