package br.com.cursojava.modeficadoresdeacesso;

public class Funcionario {
	private String nome;
	private String rg;
	private double salario;
	private String departamento;
	private DataAdmissao data;
	
	public String getNome(){
		return this.nome; 
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getRg(){
		return this.rg;
	}
	
	public void setRg(String rg){
		this.rg = rg;
	}
	
	public double getSalario(){
		return this.salario;
	}
	
	public void setSalario(double salario){
		this.salario = salario;
	}
	
	public String getDepartamento(){
		return this.departamento;
	}
	
	public void setDepartamento(String departamento){
		this.departamento = departamento;
	}
	
	public DataAdmissao getData(){
		return this.data;
	}
	
	public void setData(DataAdmissao data){
		this.data = data;
	}
	
	
	public void receberAumento(double valor){
		this.salario += valor;
	}
	
	public double getGanhoAnual(){
		return this.salario * 12;
		
	}
	
	public void mostra(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salário: " + this.salario);
		System.out.println("Data de Entrada: " + this.data.getDataFormatada());
		System.out.println("RG nº: " + this.rg);
	}
	
}
