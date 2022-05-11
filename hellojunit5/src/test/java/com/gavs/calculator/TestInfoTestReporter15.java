package com.gavs.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestReporter;

/**
 * Junit supports dependency injection
 * 
 * TestInfo and TestReporter - junit maintains internally
 * 
 * TestInfo contains information about the test
 * 
 * TestReporter provides ability to report TestInfo
 * 
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS) // No Guarantee of Ordering
//@TestInstance(TestInstance.Lifecycle.PER_METHOD) -> Default Behavior
class TestInfoTestReporter15 {
	TestInfo testInfo;
	TestReporter testReporter;
	
	Calculator calcInstance = null;

	@BeforeEach
	void initCalc(TestInfo testInfo, TestReporter testReporter) {
		this.testInfo = testInfo;
		this.testReporter = testReporter;
		calcInstance = new Calculator();
		testReporter.publishEntry("Calling method->"+testInfo.getDisplayName()+" with tag->"+testInfo.getTags());
	}

	@Nested
	@Tag("UP")
	class AddTest {
		@Test
		@DisplayName("Add positive numbers")
		void testAddPositive() {
			assertEquals(2, calcInstance.add(1, 1), "1+1 should equals 2");
			//System.out.println("testInfo DisplayName="+testInfo.getDisplayName());
			//System.out.println("testInfo Tags="+testInfo.getTags());
		}

		@Test
		@DisplayName("Add negative numbers")
		void testAddNegative() {
			assertEquals(-2, calcInstance.add(-1, -1), "-1-1 should equals -2");
		}
	}

	@Test
	@Tag("DOWN")
	void testSubtract() {
		assertEquals(1, calcInstance.subtract(3, 2), "3-2 should equals 1");
	}

	@Test
	@Tag("UP")
	void testMultiply() {
		assertEquals(9, calcInstance.multiply(3, 3), "3*3 should equals 9");
	}

	@Test
	@Tag("DOWN")
	void testDivide() {
		assertEquals(3, calcInstance.divide(6, 2), "6/2 should equals 3");
	}

}
