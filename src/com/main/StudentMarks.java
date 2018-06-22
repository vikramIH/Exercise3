package com.main;

public class StudentMarks {
	boolean checkvalue;
	public boolean checkGradeValidity(int numOfStudents,int[] stuGrades) {
	for(int i = 0; i< numOfStudents;i++) {
		if(stuGrades[i]<0 && stuGrades[i]>100) {
		checkvalue = false;
		}	
		else
		checkvalue = true;
	}
		return checkvalue;
}
}
