package com.array.rotation;

public class FindMinElementInRotatedArray {

	public static void main(String[] args) {

		int[] ar = new int[] {5};
		int start = 0;
		int end = ar.length - 1;
		int searchMinElement = searchMinElement(ar, start, end, ar.length);
		System.out.println("searchMinElement " + searchMinElement);
		
        int arr2[] =  {1,2,3,4};
        int n2 = arr2.length;
        System.out.println("The minimum element is "+ findMin(arr2, 0, n2-1));
	}

	public static int searchMinElement(int[] ar, int start, int end, int n) {

		while (start <= end) {

			int mid = (start + end) / 2;
			int next = (mid + 1) % n;
			int prev = (mid + n - 1) % n;
			
			if(end < start)
				return ar[start];
			
			if(start == end)
				return ar[start];
			
			if (ar[mid] < ar[prev] && ar[mid] < ar[next])
				return ar[mid];
			
			if(mid < end && ar[mid+1] < ar[mid])
				return ar[mid+1];

			if (ar[start] < ar[mid])
				start = mid + 1;
			else if (ar[mid] < ar[end])
				end = mid - 1;

		}

		return -1;
	}
	
	
	   static int findMin(int arr[], int low, int high)
	    {
	        // This condition is needed to handle the case when array
	        // is not rotated at all
	        if (high < low)  return arr[0];
	 
	        // If there is only one element left
	        if (high == low) return arr[low];
	 
	        // Find mid
	        int mid = low + (high - low)/2; /*(low + high)/2;*/
	 
	        // Check if element (mid+1) is minimum element. Consider
	        // the cases like {3, 4, 5, 1, 2}
	        if (mid < high && arr[mid+1] < arr[mid])
	            return arr[mid+1];
	 
	        // Check if mid itself is minimum element
	        if (mid > low && arr[mid] < arr[mid - 1])
	            return arr[mid];
	 
	        // Decide whether we need to go to left half or right half
	        if (arr[high] > arr[mid])
	            return findMin(arr, low, mid-1);
	        return findMin(arr, mid+1, high);
	    }

}
