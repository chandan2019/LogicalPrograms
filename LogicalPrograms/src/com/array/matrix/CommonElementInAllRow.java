package com.array.matrix;

public class CommonElementInAllRow {

	
	
	public  int findCommon(int a[][], int r, int c) {
		int visit[] = new int[100];
		
		for(int i=0;i<c;i++) {
			
			visit[a[0][i]] = 1;
			
			
		}
		
		
		
		for(int i = 1;i<r;i++) {
			
			for(int j = 0;j<c;j++) {
				
				if(visit[a[i][j]] == i) {
					visit[a[i][j]]++;
					
				}
				
			}
		}
		
		
		for(int i = 0;i<r;i++) {
					
					for(int j = 0;j<c;j++) {
						
						if(visit[a[i][j]] == r) {
							return a[i][j];
							
						}
						
					}
				}
		
		return -1;
	}
	
	
	
	
	public static void main(String[] args) {

	CommonElementInAllRow obj = new CommonElementInAllRow();
	int a[][] = new int[][] {{2,1,3}, {4,5,1}, {1,9,5}};
	int findCommon = obj.findCommon(a,3,3);
	System.out.println("findCommon " + findCommon);
		
	}
	
	

}
