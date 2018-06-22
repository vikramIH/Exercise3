package com.main;


public class ChessBoard {
	
	public String[][] chessBoard(String a, String b)
	{
		String[][] c = new String[8][8];
		for(int i=0; i< c.length; i++)
		{
			for( int j = 0 ; j < c[0].length; j++ )
			{	if((i+j)%2==0)
				c[i][j] = a;
			else
				c[i][j] = b;
		}}
		return c;
	}
}
