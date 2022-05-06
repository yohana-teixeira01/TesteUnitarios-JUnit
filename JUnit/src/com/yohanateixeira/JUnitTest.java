package com.yohanateixeira;
public class JUnitTest {

	public int quadrado(int x) {
		return x * x ;
	}

	public int contadorDePalavras(String palavra) {
		int cont = 0;
		for(int i = 0; i < palavra.length(); i++) 
			if(palavra.charAt(i) == 'a' || palavra.charAt(i) == 'A')
		        cont++;
				
		return cont;
	}

}
