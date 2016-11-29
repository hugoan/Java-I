package br.com.cursojava1.modulo4;

public class Funcionario {
	String nome;
	String rg;
	double salario;
	String departamento;
	DataAdmissao data = new DataAdmissao();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	void receberAumento(double valor){
		this.salario += valor;
	}
	
	double calculeGanhoAnual(){
		return this.salario * 12;
		
	}
	
	void mostra(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Sal�rio: " + this.salario);
		System.out.println("Data de Entrada: " + this.data.getDataFormatada());
		System.out.println("RG n�: " + this.rg);
	}
	
}
