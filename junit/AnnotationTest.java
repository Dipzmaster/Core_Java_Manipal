package com.tests;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AnnotationTest {
	private ArrayList testList;

	@BeforeClass
	public static void onceExecuteBeforeAll(){
		System.out.println("@BeforeClass : onceExecuteBeforeAll");
	}

	@Test
	public void emptyList(){
		assertTrue(testList.isEmpty());
		System.out.println("@Test : emptyList checked");
		
	}

	@Test
	public void twoItemsCollection(){
		//assertTrue(testList.isEmpty());

		testList.add("Ram");
		testList.add("Shyam");
		assertEquals(2, testList.size());
		System.out.println("@Test : two Itemes Collection..");
	}

	@Before
	public void createObject(){
		testList = new ArrayList();
		assertTrue(testList.isEmpty());
		System.out.println("@Before : createObject");
	}

	@After
	public void afterEach(){
		testList.clear();
		System.out.println("@After : execute after each Test ");
	}
	
	@AfterClass
	public static void afterExecuteAll(){
		System.out.println("@AfterClass : after ALLLLLLLLLLLLLll");
	}
	
	@Test
	public void amIignored(){
		System.out.println("@Ignored : I am really ignored...");
	}

}
