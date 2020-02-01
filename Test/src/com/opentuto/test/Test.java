
package com.opentuto.test;

import static org.junit.Assert.*;	

public class Test {
	
	@org.junit.BeforeClass
	public static void testBefore() {
		
		System.out.println("Avant les test Suitsetup");

	}	

	@org.junit.Test
	public void testNbCours() {
	
		assertEquals(5,Cours.nbCours(5));

	}
	
	@org.junit.AfterClass
	public static void testAfter() {
		
		System.out.print("après les test TearDown");

	}	

	}
	

