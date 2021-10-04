package com.leetcode.prefix;

public class IsPrefixOfWord {

	public static void main(String[] args) {

		String sentence = "leetcode corona";
		String searchWord = "leetco";

		System.out.println(isPrefixOfWord(sentence, searchWord));
	}

	
	public static int isPrefixOfWord(String sentence, String searchWord) {
		String[] s=sentence.split(" ");
		int count=-1;
		for(int i=0;i<s.length;i++) {
		if( s[i].startsWith(searchWord)) {
		count=i+1;
		break;
		}
		}
		return count;
		}


	public static int isPrefixOfWord1(String sentence, String searchWord) {
		String str[] = sentence.split(" ");
		int minindex = Integer.MAX_VALUE;
		int mainstringlenght = str.length;
		int i = 0;
		boolean flags = true;
		while (i < mainstringlenght) {

			// flag = true;
			 boolean flag = true;
			int index = 0;
			String s1 = str[i];
			if (s1.length() < searchWord.length()) {
				flag = false;
				i++;
				continue;
			}

			for (int k = 0; k < searchWord.length(); k++) {

				if (s1.charAt(k) != searchWord.charAt(k)) {
					flag = false;
					break;
				}

			}
			if (flag) {
				index = i+1;
				minindex = Math.min(minindex, index);
			}else
			{
				flags = false;
			}
			i++;
		}
		
		   if(flags)
		        return minindex;
		        else
		            return -1;

	}
}
