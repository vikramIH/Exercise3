package com.test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import com.main.FirstAndLastDate;

import org.junit.jupiter.api.Test;

class FirstAndLastDateTest {

	@Test
	void FirstDateTest() {
	    Calendar calendar = Calendar.getInstance();
	    FirstAndLastDate obj = new FirstAndLastDate();
	    Date now = obj.getWeekStartDate();
	}
	
	@Test
	void LastDateTest() {
	    Calendar calendar = Calendar.getInstance();
	    FirstAndLastDate obj = new FirstAndLastDate();
	    Date now = obj.getWeekEndDate();
	}

}
