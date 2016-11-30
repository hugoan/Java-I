package br.com.cursojava1.modulo3;

public class Exercicio1 {
	String nome;
	String departamento;
	double salario;
	Data data = new Data();
	String rg;
	
	void recebeAumento(double valor){
		this.salario += valor;
	}
	
	double calculeGanhoAnual(){
		return this.salario * 12;
	}
	
	void mostra(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salário: " + this.salario);
		System.out.println("RG nº: " + this.rg);
		System.out.println("Data de entrada: " + this.data.getDataFormatada());
	}
}
