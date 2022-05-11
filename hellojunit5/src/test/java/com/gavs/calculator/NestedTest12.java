package com.gavs.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

/**
 * Group Multiple Tests with @Nested
 * 
 * Easy to Organize
 * It affects the failure state for these tests 
 * 
 */
@DisplayName("Nested Test Component")
class NestedTest12 {
	Calculator calcInstance = null;

	@BeforeEach
	void initCalc() {
		calcInstance = new Calculator();
	}

	
	@Nested
	class AddTest{
		@Test
		@DisplayName("Add positive numbers")
		void testAddPositive() {		
			assertEquals(3, calcInstance.add(1, 1), "1+1 should equals 2");
		}
		
		@Test
		@DisplayName("Add negative numbers")
		void testAddNegative() {		
			assertEquals(-2, calcInstance.add(-1, -1), "-1-1 should equals -2");
		}
	}
	
	@Nested
	class MultiplyTest{
		@Test
		@DisplayName("Multiply regular numbers")
		void testMultiply() {		
			assertEquals(6, calcInstance.multiply(3, 2), "3*2 should equals 6");
		}
		
		@Test
		@DisplayName("Multiply by zero")
		void testMultiplyByZero() {		
			assertEquals(0, calcInstance.multiply(5, 0), "5*0 should equals 0");
		}
	}

}
