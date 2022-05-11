package com.gavs.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

/**
 *	Tagging
 *
 *	maven-surefire-plugin
 *  <plugin>
 *         <groupId>org.apache.maven.plugins</groupId>
 *         <artifactId>maven-surefire-plugin</artifactId>
 *         <version>2.21.0</version>
 *         <configuration>
 *             <!-- include tags -->
 *             <groups>UP</groups>
 *             <!-- exclude tags -->
 *             <excludedGroups>DOWN</excludedGroups>
 *         </configuration>
 *  </plugin>
 *  
 *  In console, uses -D option
 *  mvn -Dgroups="UP"
 *  mvn -DexcludedGroups="DOWN"
 * 
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)	//No Guarantee of Ordering
//@TestInstance(TestInstance.Lifecycle.PER_METHOD) -> Default Behavior
class TagTest14 {
	Calculator calcInstance = null;
	
	
	@BeforeEach
	void initCalc() {
		calcInstance = new Calculator();
	}
	
	@Nested
	@Tag("UP")
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
