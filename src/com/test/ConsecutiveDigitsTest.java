package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.main.ConsecutiveDigits;

class ConsecutiveDigitsTest {

	ConsecutiveDigits consec = new ConsecutiveDigits();
	@Test
	void test() {
		
	boolean isTrue = consec.isConsecutive("33,32,31,32,33,34,35");
		assertEquals(true, isTrue);
	}
	
	@Test
	void test1() {
		
	boolean isTrue = consec.isConsecutive("91,92,93,94,95,96,96");
		assertEquals(false, isTrue);
	}

}
