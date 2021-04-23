package com.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class CharactersInBracketDepth {
	
	 HashMap<Integer, Integer> hm;

	public static void main(String[] args) {

		//String s = "(XX(XX(X))X)";
		
		String s = "(()())";
		CharactersInBracketDepth obj = new CharactersInBracketDepth();
		
		int[] searchX = obj.solve1(s);
		Arrays.stream(searchX).forEach(System.out::println);
		
		
	}
	
	public  static int[] solve(String s) {
		
		Stack<Character> stack= new Stack<>();
		
		
		int findResultArraySize = findResultArraySize(s);
		
		int ar[] = new int[findResultArraySize];
		
		int i=0;
		int j = ar.length-1;
		while(i<s.length()) {
			
			
			while(s.charAt(i) != ')' ) {
				
				stack.push(s.charAt(i));
				i++;
			}
			
			if(s.charAt(i) == ')') {
				
				int count = 0;
				
				while((char)stack.peek() !='(') {
					
					stack.pop();
					count++;
				}
				
				stack.pop();
				ar[j] = count;
				j--;
			}
			i++;
			
		}
		
		return ar;
		
		
	}
	
	public static int findResultArraySize(String s) {
		
		int i = 0;
		int count = 0;
		while(i<s.length()) {
			
			
			if(s.charAt(i) == '(' ) {
				
				count++;
			}
			i++;
	}
		
		return count;

}
	
	
	
	public int[] solve1(String s) {
        hm = new HashMap();
        f(s, 0, -1);

        int idx = 0;
        int[] res = new int[hm.size() - 1];
        for (int i = 0; i < hm.size() - 1; i++) {
            res[i] = hm.get(i);
        }
        return res;
    }

    public void f(String s, int idx, int depth) {
        if (idx >= s.length())
            return;
        hm.putIfAbsent(depth, 0);
        if (s.charAt(idx) == '(') {
            f(s, idx + 1, depth + 1);
        } else if (s.charAt(idx) == 'X') {
            hm.put(depth, hm.get(depth) + 1);
            f(s, idx + 1, depth);
        } else {
            f(s, idx + 1, depth - 1);
        }
    }
}
