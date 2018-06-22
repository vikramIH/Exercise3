package com.test;

import static org.junit.jupiter.api.Assertions.*;
import com.main.ChessBoard;

import org.junit.jupiter.api.Test;

class ChessBoardTest {

	@Test
	void test() {
		String a = "WW|";
		String b = "BB|";
		ChessBoard obj = new ChessBoard();
		String[][] c = obj.chessBoard(a, b);
		assertEquals("WW|",c[0][0]);
		assertEquals("BB|",c[0][1]);
		assertEquals("BB|",c[1][0]);
		assertEquals("WW|",c[1][1]);
	}

}

