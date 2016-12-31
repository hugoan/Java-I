package br.com.cursojava1.construtores;

public class Funcionario {
	private int identificador;
	private String nome;
	private String rg;
	private double salario;
	private String departamento;
	private DataAdmissao dataDeEntrada = new DataAdmissao(01, 12, 2016);
	
	private static int numeroIncremental = 1;
	
	public Funcionario(){
		this.identificador = numeroIncremental;
		numeroIncremental++;
	}
	
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
	
	public DataAdmissao getDataDeEntrada() {
		return dataDeEntrada;
	}
	
	public void setDataDeEntrada(DataAdmissao dataDeEntrada) {
		this.dataDeEntrada = dataDeEntrada;
	}
	
	
	
	public void receberAumento(double valor){
		this.salario += valor;
	}
	
	
	public double getGanhoAnual(){
		return this.salario * 12;
		
	}
	
	
	public void mostraFuncionario(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salário: " + this.salario);
		System.out.println("Data de Entrada: " + this.dataDeEntrada.getDataFormatada());
		System.out.println("RG nº: " + this.rg);
		System.out.println(identificador);
	}
	
}
