package com.kg.progs;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	Calculator calculator = new Calculator();
	
	@Test
	public void testSum() {
		assertEquals(30, calculator.sum(10, 20));
	}

}
