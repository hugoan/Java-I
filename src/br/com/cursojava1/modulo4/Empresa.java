package br.com.cursojava1.modulo4;

public class Empresa {
	String nome;
	String cnpj;
	Funcionario[] empregados = new Funcionario[2];
	int contador = 0;

	void adicionar(Funcionario f) {

		this.empregados[this.contador] = f;
		this.contador++;
	}

	void mostraEmpresa() {
		System.out.println("Empresa: " + this.nome);
		System.out.println("CNPJ: " + this.cnpj);
	}

	void mostraEmpregados() {
		for (int i = 0; i < this.empregados.length; i++) {
			empregados[i].mostra();
		}
	}

	boolean contem(Funcionario func) {
	    for (int i = 0; i < this.empregados.length; i++) {
	    if (func.nome == this.empregados[i].getNome()) {
	            return true;
	        }
	    }
	    return false;
	}
}
