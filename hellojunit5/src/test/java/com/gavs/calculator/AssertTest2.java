	package com.gavs.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertTest2 {

	@Test
	void test() {
		DivisionComponent component = new DivisionComponent();
		int actual = component.divide(10, 5);
		int expected = 2;
		assertEquals(expected , actual);
	}
	
	@Test
	void testWithMsg() {
		DivisionComponent component = new DivisionComponent();
		int actual = component.divide(10, 5);
		int expected = 2;
		assertEquals(expected , actual, "Division failed");
	}
	
	@Test
	void testException() {
		DivisionComponent component = new DivisionComponent();
		assertThrows(ArithmeticException.class , () -> component.divide(10, 0),"divide by zero should throw Arithmetic Exception");
	}

}
