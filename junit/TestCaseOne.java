package com.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.kg.programs.Calculator;

public class TestCaseOne {

	Calculator calculator = new Calculator();
	
	@Test
	public void testSum() {
		assertEquals("5 + 5 must be 10 : ",10,   calculator.sum(5, 5));
	}

	@Test
	public void testPrintMessage() {
		assertEquals('I', calculator.getLastChar("RAGINI"));
	}
	
	@Test
	public void testIsDivisible(){
		assertTrue(calculator.isDivisibleByTwo(18));
		assertFalse(calculator.isDivisibleByTwo(27));
	}
	
	@Test
	public void testReverseArray(){
		int [] num = {1,2,3,4};
		int [] exNum = {4,3,2,1};
		assertArrayEquals(exNum, calculator.reverseArray(num));
	}
	
	@Test
	public void testGetMinimum(){		
		int result = calculator.getMinimum(new int[]{1,2,3,4});
		assertEquals(1, result);
	}
	
}
