package com.leetcode.prefix;

import java.util.ArrayList;
import java.util.List;

public class BinaryPrefixDivisible {
	static List<Boolean> result = new ArrayList<>();
	public static void main(String[] args) {

		int nums[] = {1,1,0,0,0,1,0,0,1};
		//List<Boolean> prefixesDivBy5 = prefixesDivBy51(nums);
		List<Boolean> prefixesDivBy5 = prefixesDivBy5(nums);
		prefixesDivBy5.forEach(System.out::println);
		
		
	}

	public static List<Boolean> prefixesDivBy5(int[] a) {
	    List<Boolean> l = new ArrayList<>();
	    long num = a[0];
	    l.add(num%5 == 0?true:false);
	    for(int i=1;i<a.length;i++){
	        num = 2*num +a[i];
	        l.add(num%5 == 0?true:false);
	        num = num%10;
	    }
	    return l;
	}
	
	 public static List<Boolean> prefixesDivBy51(int[] nums) {
	        
	        
	        StringBuilder s = new StringBuilder(nums[0]);
	        
	        for(int i = 0; i<nums.length;i++){
	            
	            s.append(nums[i]);
	            convertToDecimal(s);
	        }
	        return result;
	    }
	    
	    public static void convertToDecimal(StringBuilder s){
	        
	        String s1 = s.toString();
	        int sum = 0;
	        int cnt = 0;
	        for(int i = s1.length()-1; i>=0; i--){
	            
	            sum  += Integer.parseInt(String.valueOf(s1.charAt(i)))* pow(2, cnt++);
	        }
	        
	        if(sum % 5 == 0){
	            result.add(true);
	        }else{
	            result.add(false);
	        }
	    }
	    
	    public static int pow(int base, int power){
	        int product = 1;
	        if(power == 0)
	            return 1;
	        
	        while(power>0){
	            
	            product *= base;
	            power--;
	        }
	        return product;
	        
	    }
}
