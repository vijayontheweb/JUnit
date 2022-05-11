package com.gavs.calculator;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

/**
 *  
 * Using @RepeatedTest
 * 
 */
class RepeatedTest13 {
	Calculator calcInstance = null;

	@BeforeEach
	void initCalc() {
		calcInstance = new Calculator();
	}

	@RepeatedTest(3)
	@DisplayName("This is Add")
	void testAdd() {
		assertAll(
				() -> assertEquals(2, calcInstance.add(1, 1), "1+1 should equals 2"),
				() -> assertEquals(7, calcInstance.add(4, 3), "4+3 should equals 7"),
				() -> assertEquals(9, calcInstance.add(2, 7), "2+7 should equals 9"),
				() -> assertEquals(13, calcInstance.add(5, 8), "5+8 should equals 13")
				);

	}
	
	@RepeatedTest(3)
	@DisplayName("This is Multiply")
	void testMultiply(RepetitionInfo repeatInfo) {
		if(repeatInfo.getCurrentRepetition()==1) {
			assertEquals(9, calcInstance.multiply(3, 3), "3*3 should equals 9");
		}else if(repeatInfo.getCurrentRepetition()==2) {
			assertEquals(12, calcInstance.multiply(3, 4), "3*4 should equals 12");
		}else if(repeatInfo.getCurrentRepetition()==3) {
			assertEquals(15, calcInstance.multiply(3, 5), "3*5 should equals 15");
		}
			
	}

}
