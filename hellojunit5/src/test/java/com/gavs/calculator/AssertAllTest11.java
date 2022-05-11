package com.gavs.calculator;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

/**
 *  
 * assertAll - Run a bunch of Assertions in just one statement. It takes in a
 * bunch of lambdas that you can pass in and each of those lambdas have assert
 * statement. i.e AND condition for your asserts
 * 
 */
class AssertAllTest11 {
	Calculator calcInstance = null;

	@BeforeEach
	void initCalc() {
		calcInstance = new Calculator();
	}

	@Test
	@DisplayName("This is Add")
	void testAdd() {
		assertAll(
				() -> assertEquals(2, calcInstance.add(1, 1), "1+1 should equals 2"),
				() -> assertEquals(7, calcInstance.add(4, 3), "4+3 should equals 7"),
				() -> assertEquals(9, calcInstance.add(2, 7), "2+7 should equals 9"),
				() -> assertEquals(13, calcInstance.add(5, 8), "5+8 should equals 13")
				);

	}

}
