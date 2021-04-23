package com.array.rotation;

public class SearchElementInSortedRotatedArray {

	public static void main(String[] args) {

		
		int ar[]  = new int[] {5,1,3};
		 int target = 5;
		
		int start = 0;
		int end = ar.length-1;
		
		int mid = (start + end)/2;
		
		int searchTarget = searchTarget(ar, target);
		
		System.out.println("searchTarget " + searchTarget);
		
		
	}
	
	
	/*public static int searchTarget(int[] ar,int start,int end,int mid, int target) {
		
		
		if(ar[mid] == target)
			return mid;
		
		if(target>ar[start] && target < ar[mid])
		{
			end = mid-1;
			mid = (start + end)/2;
			searchTarget(ar,start,end, mid, target);
			
		}else {
			
			start = mid+1;
			mid = (start + end)/2;
			searchTarget(ar,start,end, mid, target);
			
		}
		
		
		return mid;
	}
*/
	
	
	public static int searchTarget(int[] ar, int target) {
		
		
		int start = 0;
		int end = ar.length-1;
		
		while(start<=end) {
			
			int mid = (start + end)/2;
			
			if(ar[mid] == target)
				return mid;
			
			if(target>= ar[start] && target < ar[mid])
			{
				end = mid-1;
			}else {
				start = mid+1;
				
			}
			
		}
		
		return -1;
	}
	
	
	
	
}
