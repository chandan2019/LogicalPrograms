package com.array;


//Java implementation to find 
//the length of the longest  
//subarray having maximum sum  
import java.util.*; 

class GFG 
{ 
//function to find the 
//maximum sum that  
//exists in a subarray  
static int maxSubArraySum(int arr[],  
                       int size)  
{  
 int max_so_far = arr[0];  
 int curr_max = arr[0];  

 for (int i = 1; i < size; i++) 
 {  
     curr_max = Math.min(arr[i],  
                     curr_max + arr[i]);  
     max_so_far = Math.min(max_so_far,  
                           curr_max);  
 }  
 return max_so_far;  
}  

//function to find the  
//length of longest  
//subarray having sum k  
static int lenOfLongSubarrWithGivenSum(int arr[], 
                                    int n, int k)  
{  
 // unordered_map 'um' implemented  
 // as hash table  
 HashMap<Integer,  
         Integer> um = new HashMap<Integer,  
                                   Integer>();  
 int sum = 0, maxLen = 0;  

 // traverse the given array  
 for (int i = 0; i < n; i++)  
 {  

     // accumulate sum  
     sum += arr[i];  

     // when subarray starts 
     // from index '0'  
     if (sum == k)  
         maxLen = i + 1;  
 
     // make an entry for 'sum' if  
     // it is not present in 'um'  
     if (!um.containsKey(sum))  
         um.put(sum, i);  

     // check if 'sum-k' is present  
     // in 'um' or not  
     if (um.containsKey(sum - k)) 
     {  

         // update maxLength  
         if (maxLen < (i - um.get(sum - k)))  
             maxLen = i - um.get(sum - k);  
     }  
 }  

 // required maximum length  
 return maxLen;  
}  

//function to find the length  
//of the longest subarray 
//having maximum sum  
static int lenLongSubarrWithMaxSum(int arr[], int n)  
{  
 int maxSum = maxSubArraySum(arr, n);
		 return maxSum;  
 //return lenOfLongSubarrWithGivenSum(arr, n, maxSum);  
}  

//Driver Code 
public static void main(String args[]) 
{  
 //int arr[] = {7, -3, 4,-1, -2, 1, 5, -3};  
	int arr[] = {3, 4, 6,-8, 4, -7, 10, -2}; 
 int n = arr.length;  
 System.out.println("Length of longest subarray " +  
                          "having maximum sum = " + 
                  lenLongSubarrWithMaxSum(arr, n));  
}  
} 
