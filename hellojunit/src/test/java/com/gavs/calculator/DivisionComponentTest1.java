package com.gavs.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class DivisionComponentTest1 {

	@Test(expected = IllegalArgumentException.class)
	public void testExceptionIsThrown() {
		DivisionComponent component = new DivisionComponent();
		component.divide(1000, 0);
	}

	@Test
	public void testDivide() {
		DivisionComponent component = new DivisionComponent();
		assertEquals("10 / 5 must be 2", 2, component.divide(10, 5));
	}

}
