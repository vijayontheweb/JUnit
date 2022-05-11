package com.gavs.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Junit gives you hooks through which you can execute code at certain points in
 * the lifecycle from the creation of the class till termination
 * 
 * Junit creates a new class instance for every method run
 * 
 * @BeforeAll - Initialize before anything in this class runs
 * @BeforeEach - initialize before each method
 * @AfterEach - Teardown after each method
 * @AfterAll - Teardown after all methods are run
 *
 */
class LifecycleHooksTest5 {
	Calculator calcInstance = null;
	
	@BeforeAll
	void initAll() {
		System.out.println("Before all initialization..");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("After all clean up..");
	}
	
	
	@BeforeEach
	void initCalc() {
		System.out.println("Initializing before each method");
		calcInstance = new Calculator();
	}
	
	@AfterEach
	void exitCalc() {
		System.out.println("Cleaning up after each method");
	}
	
	@Test
	void testAdd() {		
		assertEquals(2, calcInstance.add(1, 1), "1+1 should equals 2");
	}

	@Test
	void testSubtract() {		
		assertEquals(1, calcInstance.subtract(3, 2), "3-2 should equals 1");
	}

	@Test
	void testMultiply() {		
		assertEquals(9, calcInstance.multiply(3, 3), "3*3 should equals 9");
	}

	@Test
	void testDivide() {		
		assertEquals(3, calcInstance.divide(6, 2), "6/2 should equals 3");
	}

}
