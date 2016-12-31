package br.com.cursojava1.construtores;

public class Empresa {
	private String nome;
	private String cnpj;
	Funcionario[] empregados = new Funcionario[2];
	int contador = 0;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return this.cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void adicionar(Funcionario f) {

		this.empregados[this.contador] = f;
		this.contador++;
	}

	public String getEmpresa() {
		return "Empresa: " + this.nome + " \n " + " CNPJ: " + this.cnpj;
	}

	public void mostraEmpregados() {
		for (int i = 0; i < this.empregados.length; i++) {
			empregados[i].mostraFuncionario();
		}
	}

	public boolean contem(Funcionario func) {
		for (int i = 0; i < this.empregados.length; i++) {
			if (func.getNome() == this.empregados[i].getNome()) {
				return true;
			}
		}
		return false;
	}
}
