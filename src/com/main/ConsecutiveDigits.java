package com.main;

public class ConsecutiveDigits {

	public boolean isConsecutive ( String number ) {
		
		String[] str = number.split(",");
		int len = str.length;
		
		for ( int i = 0; i < len-1; i++ )
		{
			if( (Integer.parseInt(str[i]) + 1) != Integer.parseInt(str[i+1])   &&
					Integer.parseInt(str[i]) != Integer.parseInt(str[i+1]) + 1   )
					
			{return false;}
		}
		
		return true;
	}
	
}
