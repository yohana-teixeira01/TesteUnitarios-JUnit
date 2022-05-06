package com.yohanateixeira;

public class Calculadora {
	
	// atributo
	private int resultado = 0;
	
	//m�todo somar
	public double somar(int n1, int n2) {
		
		resultado = n1 + n2;
		return resultado;
	}
	
	//m�todo subtrair
    public double subtrair(int n1, int n2) {
		
		resultado = n1 - n2;
		return resultado;
    }
    
  //m�todo multiplicar
    public double multiplicar(int n1, int n2) {
		
		resultado = n1 * n2;
		return resultado;
    }
    
  //m�todo dividir
    public double dividir(int n1, int n2) {
		
    	if(n2 == 0) {
    		throw new IllegalArgumentException("Imposs�vel dividir por Zero;");
    	}
		resultado = n1 / n2;
		return resultado;
		 	
    }
   
  //m�todo impar ou par
    public boolean isPar(int n1) {
       
    	if(n1 % 2 == 0) {
		   return true;
		}
    	
    	return false;
    }
    
 
}
