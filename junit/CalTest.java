package com.tests;

import com.kg.programs.Calculator;

import junit.framework.TestCase;

public class CalTest extends TestCase {

	Calculator calc = null;
	
	public void setUp(){
		calc = new Calculator();
		System.out.println("setUp called");
	}
	public void testSum(){
		assertEquals(9, calc.sum(2, 7) );
		System.out.println("........testSum called");
	}
	
	public void testDivide(){
		assertEquals(5, calc.divide(10,2) );
		System.out.println("........testDivide called");
	}
	public void tearDown(){
		calc = null;
		System.out.println("tearDown is called");
	}
	
	
}
