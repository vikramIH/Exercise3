package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.main.StudentMarks;

class StudentMarksTest {

	@Test
	void isCorrect() {
		int numOfStudents = 4;
		int[] stuGrades = {23, 45, 96, 100};
		StudentMarks obj = new StudentMarks();
		assertEquals(true, obj.checkGradeValidity(numOfStudents, stuGrades));
	}
	
	@Test
	void isWrong() {
		int numOfStudents = 4;
		int[] stuGrades = {23, -45, 96, 105};
		StudentMarks obj = new StudentMarks();
		assertEquals(true, obj.checkGradeValidity(numOfStudents, stuGrades));
	}

}
