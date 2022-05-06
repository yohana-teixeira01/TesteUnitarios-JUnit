package com.yohanateixeira;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest extends Calculadora{

	
	@Test
	public void testSomar() {
		System.out.println("Somar");
		int n1 = 5;
		int n2 = 5;
		Calculadora instance = new Calculadora();
		double expResult = 10.0;
		double result = instance.somar(n1, n2);
		assertEquals(expResult, result, 0);
	}
	@Test
	public void testSubtrair() {
		System.out.println("Sistema voltado pra Matemática! :) ");
		System.out.println("Subtrair");
		int n1 = 5;
		int n2 = 3;
		Calculadora instance = new Calculadora();
		double expResult = 2;
		double result = instance.subtrair(n1, n2);
		assertEquals(expResult, result, 0);
	}
	@Test
	public void testMultiplicar() {
		System.out.println("Multiplicar");
		int n1 = 2;
		int n2 = 3;
		Calculadora instance = new Calculadora();
		double expResult = 6;
		double result = instance.multiplicar(n1, n2);
		assertEquals(expResult, result, 0);
	}
	@Test
	public void testDividir() {
		System.out.println("Dividir");
		int n1 = 10;
		int n2 = 2;
		Calculadora instance = new Calculadora();
		double expResult = 5;
		double result = instance.dividir(n1, n2);
		assertEquals(expResult, result, 0);
	}

}
