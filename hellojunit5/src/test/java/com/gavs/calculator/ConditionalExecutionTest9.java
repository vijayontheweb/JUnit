package com.gavs.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

/**
 * Handling External Factors using Conditional Execution
 * 
 * If scenarios are not being met, it is equivalent to disabled
 * 
 * @EnabledOnOs(OS.LINUX) 
 * @EnabledOnJre(JRE.JAVA_11) 
 * @EnabledIf
 * @EnabledIfSystemProperty
 * @EnabledIfEnvironmentVariable
 * 
 */
class ConditionalExecutionTest9 {
	Calculator calcInstance = null;

	@BeforeEach
	void initCalc() {
		calcInstance = new Calculator();
	}

	@Test
	@DisplayName("This is Add")
	void testAdd() {
		assertEquals(2, calcInstance.add(1, 1), "1+1 should equals 2");
	}

	@Test
	@DisplayName("This is Subtraction")
	void testSubtract() {
		assertEquals(1, calcInstance.subtract(3, 2), "3-2 should equals 1");
	}

	@Test
	@DisplayName("This is Multiply")
	void testMultiply() {
		assertEquals(9, calcInstance.multiply(3, 3), "3*3 should equals 9");
	}

	@Test
	@EnabledOnOs(OS.LINUX)
	@DisplayName("This is Divide")
	void testDivide() {
		assertEquals(3, calcInstance.divide(6, 2), "6/2 should equals 3");
	}

}
