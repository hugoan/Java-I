package br.com.cursojava1.modulo2;

public class Exercicio7 {
	public static void main(String[] args) {
        long fatorial = 1;
        for (int i = 1; i < 40; i++) {
            fatorial *= i;
            System.out.println("Fatorial de "+i+ " = " +fatorial);
        }
    }
}
