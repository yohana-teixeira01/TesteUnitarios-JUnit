package com.yohanateixeira;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RaizQuadradaTest extends JUnitTest{

	@Test
	public void testRaizQuadrada() {
		System.out.println("Raiz Quadrada");
		JUnitTest test = new JUnitTest();
		 int output = test.quadrado(5);
		 assertEquals(25,output);
	}

}
