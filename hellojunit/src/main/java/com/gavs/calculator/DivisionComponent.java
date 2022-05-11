package com.gavs.calculator;

public class DivisionComponent {

	public int divide(int x, int y) {		
		if (y == 0) {
			//throw new IllegalArgumentException("Denominator cannot be zero");
		}
		return x / y;
	}

}
