package com.gavs.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class InstanceTest3 {
	
	

	@Test
	void testAdd() {
		Calculator calcInstance = new Calculator();
		assertEquals(2,calcInstance.add(1, 1),"1+1 should equals 2");
	}
	
	@Test
	void testSubtract() {
		Calculator calcInstance = new Calculator();
		assertEquals(1,calcInstance.subtract(3, 2),"3-2 should equals 1");
	}
	
	@Test
	void testMultiply() {
		Calculator calcInstance = new Calculator();
		assertEquals(9,calcInstance.multiply(3, 3),"3*3 should equals 9");
	}
	
	@Test
	void testDivide() {
		Calculator calcInstance = new Calculator();
		assertEquals(3,calcInstance.divide(6, 2),"6/2 should equals 3");
	}

}
