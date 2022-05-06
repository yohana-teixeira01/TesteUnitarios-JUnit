package com.yohanateixeira;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest extends Calculadora{

	@BeforeEach
	public void initEach(){
		System.out.println("Inicializando novo Teste!");
	}
	@Test
	public void testSomar() {
		System.out.println("Teste Soma");
		int n1=5;
		int n2=5;
		Calculadora instance = new Calculadora();
		double expResult = 10.0;
		double result = instance.somar(n1, n2);
		assertEquals(expResult, result, 0);
	}
	
	@Test
	public void testeisParTrue() {
		System.out.println(" Teste de Verificacao se � Par");
		
		Calculadora instance = new Calculadora();
		boolean isPar = instance.isPar(10);
		assertTrue(isPar);
	}
	
	@Test
	public void testeisParFalse() {
		System.out.println("Teste de Verificacao se � Par");
		
		Calculadora instance = new Calculadora();
		boolean isPar = instance.isPar(9);
		assertFalse(isPar);
	}
	@Test
	public void testSubtrair() {
		System.out.println("Teste de Subtra��o");
		int n1 = 5;
		int n2 = 3;
		Calculadora instance = new Calculadora();
		double expResult = 2;
		double result = instance.subtrair(n1, n2);
		assertEquals(expResult, result, 0);
	}
	@Test
	public void testMultiplicar() {
		System.out.println("Teste de Multiplica��o");
		int n1 = 2;
		int n2 = 3;
		Calculadora instance = new Calculadora();
		double expResult = 6;
		double result = instance.multiplicar(n1, n2);
		assertEquals(expResult, result, 0);
	}
	@Test
	public void testDividir() {
		System.out.println("Teste de Divis�o");
		int n1 = 10;
		int n2 = 2;
		Calculadora instance = new Calculadora();
		double expResult = 5;
		double result = instance.dividir(n1, n2);
		assertEquals(expResult, result, 0);
	}
	@Test
	public void testDividirPorZero() {
		System.out.println("Teste de Divis�o por Zero");
		assertThrows(IllegalArgumentException.class, () ->{
			int n1 = 10;
			int n2 = 0;
			Calculadora instance = new Calculadora();
			 instance.dividir(n1, n2);
		});
	}
   @AfterEach
   public void finishEach(){
		System.out.println(" Finalizando esse Teste!");
	  
}
}
