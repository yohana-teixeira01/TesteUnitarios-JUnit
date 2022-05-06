package com.yohanateixeira;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContadorTest extends JUnitTest {

	@Test
	public void testContador() {
		System.out.println("Contador De Letras");
		JUnitTest test = new JUnitTest();
		 int output = test.contadorDePalavras("Amarelo");
		 assertEquals(2,output);
	}

}
