package br.com.cursojava1.modulo2;

public class BalancoTrimestral {
	public static void main(String[] args){
		int gastosJaneiro = 1500; 
		int gastosFevereiro = 2300;
		int gastosMarco = 1700;
		
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		int mediaMensal = gastosTrimestre/3;
		
		System.out.println(gastosTrimestre);
		System.out.println("Valor da média mensal = " + mediaMensal);
		
	}
}
