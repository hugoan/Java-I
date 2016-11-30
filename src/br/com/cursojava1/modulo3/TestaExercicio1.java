package br.com.cursojava1.modulo3;



public class TestaExercicio1 {
	public static void main(String[] args) {
		Exercicio1 f1 = new Exercicio1();
		f1.nome = "Hugo Araújo Nóbrega";
		f1.departamento = "Fábrica de Software";
		f1.rg = "2207962 SSP/DF";
		f1.salario = 10000.00;

		f1.data.dia = 01;
		f1.data.mes = 12;
		f1.data.ano = 2016;

		Exercicio1 f2 = new Exercicio1();
		f2.nome = "Nathália Nóbrega";
		f2.departamento = "Juiza";
		f2.rg = "123456 SSP/DF";
		f2.salario = 30000.00;

		
		f2.data.dia = 30;
		f2.data.mes = 11;
		f2.data.ano = 2016;
		
		System.out.println("O ganho por ano é: " + f1.calculeGanhoAnual());
		System.out.println("Salário atual é: " + f1.salario);

		f1.recebeAumento(300);

		System.out.println("Com o aumento o ganho por ano passa para: " + f1.calculeGanhoAnual());
		System.out.println("Salário com aumento é: " + f1.salario);
		System.out.println("--------------------------------");

		f1.mostra();
		
		System.out.println("==================================");
		
		System.out.println("O ganho por ano é: " + f2.calculeGanhoAnual());
		System.out.println("Salário atual é: " + f2.salario);

		f2.recebeAumento(3000);

		System.out.println("Com o aumento o ganho por ano passa para: " + f2.calculeGanhoAnual());
		System.out.println("Salário com aumento é: " + f2.salario);
		System.out.println("--------------------------------");

		f2.mostra();
		
		

	}
}
