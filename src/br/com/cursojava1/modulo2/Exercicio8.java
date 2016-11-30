package br.com.cursojava1.modulo2;

public class Exercicio8 {
	public static void main(String[] args) {
		int x = 3;
		System.out.println("Iniciando...\n");
		while (x != 1) {
			System.out.print(x + " > ");
			if (x % 2 == 0) {
				x = x / 2;
			} else {
				x = ((3 * x) + 1);
			}
		}
		System.out.print(x);
	}
}
