package com.main;

import java.util.Arrays;

public class VowelsInPlaces {

	public String[] removeVowels (String[] countries) {
		
		String[] res = new String[5];
		
		
		for ( int i = 0; i < countries.length; i++ )
		{
			res[i] = "";
			for ( int j = 0; j < countries[i].length(); j++ )
			{
				char ch = countries[i].charAt(j);
				switch(ch) { 
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					break;
				default : 
					res[i] = res[i].concat(ch + "");
				}
			}
		}
		System.out.println(Arrays.toString(res));
		return res;
		
				
	}
	
}
