package br.com.cursojava1.modulo2;

public class Exercicio4 {
	public static void main(String[] args){
		int numero = 1;
		int resultadoSoma = 0;
		
		while(numero <= 100){
			
			resultadoSoma = resultadoSoma + numero;
			numero++;
									
		}
		
		System.out.println("O resultado da soma é: " + resultadoSoma);
	}

}
