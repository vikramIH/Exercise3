package com.main;

public class MatrixAddition {

	public int[][] addMatrices ( int m1, int n1, int m2, int n2, int[][] arr1, int[][] arr2) {
		
		int[][] sum= new int[3][3];
		
		if ( m1 != m2 || n1 != n2 )
		{return null;}
						
		else
		{
			
			for ( int i = 0; i < m1; i++ )
			{
				for ( int j = 0; j < n1; j++ )
				{
					sum[i][j] = arr1[i][j] + arr2[i][j] ;
					System.out.println(sum[i][j]);
				}
			}
		}
		return sum;		
	}	
}
