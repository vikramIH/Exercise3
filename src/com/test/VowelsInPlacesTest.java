package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.main.VowelsInPlaces;

class VowelsInPlacesTest {

	VowelsInPlaces vw = new VowelsInPlaces(); 
	
	@Test
	void test() {
		
		String[] countries = {"India", "United States","Germany","Egypt", "czechoslovakia"};
		String[] str = vw.removeVowels(countries);
		
		assertEquals("Ind",str[0]);
		assertEquals("Untd Stts",str[1]);
		assertEquals("Grmny",str[2]);
		assertEquals("Egypt",str[3]);
		assertEquals("czchslvk",str[4]);
	}

}
