package com.gavs.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 
 *  Handling External Factors using Assumptions
 *	I'm assuming a certain predicate. If that is not true. Hey Junit, do not run this test
 *  
 *  
 */
class AssumeTest10 {
	Calculator calcInstance = null;
	String weather="rainy";
	
	@BeforeEach
	void initCalc() {
		calcInstance = new Calculator();
	}
	
	@Test
	@DisplayName("Go out and Play")
	void testPlay() {
		assumeTrue("sunny".equals(weather));
		assertEquals(2, calcInstance.add(1, 1), "1+1 should equals 2");
	}
	
	@Test
	@DisplayName("Sit home and Eat")
	void testEat() {		
		assertEquals(2, calcInstance.subtract(4, 2), "4%2 should equals 2");
	}
}
