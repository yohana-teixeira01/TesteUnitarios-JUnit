package com.yohanateixeira;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContadorTest extends JUnitTest {

	@Test
	public void testContador() {
		System.out.println("Contador De Letras");
		JUnitTest test = new JUnitTest();
		 int output = test.contadorDePalavras("Amarelo");
		 assertEquals(2,output);
	}

}
