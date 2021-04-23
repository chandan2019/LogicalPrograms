package com.array;

class SumOnlyNumber {
    public static int solve(String s) {
        StringBuilder sumBuilder = new StringBuilder();
        int totalSum = 0;
        boolean flag = true;

        if (s.length() == 1) {
            if (isCharDigit(s.charAt(0))) {
                return convertToInt(s.charAt(0));
            } else
                return 0;

        } else {
            for (int i = 0; i <s.length(); i++) {
                if (isCharDigit(s.charAt(i))) {
                	
                    sumBuilder.append(String.valueOf(s.charAt(i)));
                    flag = true;

                } else{
                	//flag = false;
                	if(flag) {
                    totalSum += convertToInt(sumBuilder.toString());
                    sumBuilder = new StringBuilder();
                    flag = false;
                	}
                }
            }
        }

        return totalSum;
    }

    public static boolean isCharDigit(char c) {
        if (c >= 48 && c <= 56)
            return true;
            return false;
    }

    public static int convertToInt(char c) {
        return Integer.parseInt(String.valueOf(c));
    }

    public static int convertToInt(String c) {
        return Integer.parseInt(c);
    }
    
    public static void main(String[] args) {
    	
    	/*int solve = SumOnlyNumber.solve1("1aa32bbb5");
    	System.out.println("solve " + solve);*/
    	
    	int a = 3-'0';
    	System.out.println(a);
    	
    }
    
    public static int solve1(String s) {
        int cur = 0;
        int ans = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c))
                cur = 10 * cur + (int) (c - '0');
            else {
                ans += cur;
                cur = 0;
            }
        }
        ans += cur;
        return ans;
    }
}
