package com.gavs.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

/**
 *	Test Instance 
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)	//No Guarantee of Ordering
//@TestInstance(TestInstance.Lifecycle.PER_METHOD) -> Default Behavior
class InstanceTest6 {
	Calculator calcInstance = null;
	
	@BeforeAll
	void init() {
		Calculator calcInstance = new Calculator();
		System.out.println("Before all invoked");
	}
	
	
	@BeforeEach
	void initCalc() {
		calcInstance = new Calculator();
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
