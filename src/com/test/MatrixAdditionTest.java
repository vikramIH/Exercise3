package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.main.MatrixAddition;

class MatrixAdditionTest {

	MatrixAddition matrixAddition = new MatrixAddition();
	
	@Test
	void test() {
		int[][] arr1 = { {1,1,1}, {1,1,1}, {1,1,1} };
		int[][] arr2 = { {1,1,1}, {1,1,1}, {1,1,1} };
		int[][] actualSum = {{2,2,2}, {2,2,2}, {2,2,2}};
		int m1, n1, m2, n2;
		m1 = n1 = m2 = n2 = 3;
		int[][] sum = matrixAddition.addMatrices(m1, n1, m2, n2, arr1, arr2);
		assertEquals(2,sum[0][1]); assertEquals(2,sum[1][2]);
		assertEquals(2,sum[0][2]); assertEquals(2,sum[2][0]);
		assertEquals(2,sum[0][0]); assertEquals(2,sum[2][1]);
		assertEquals(2,sum[1][0]); assertEquals(2,sum[2][2]);
		assertEquals(2,sum[1][1]);
	}

}
