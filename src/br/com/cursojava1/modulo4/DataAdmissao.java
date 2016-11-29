package br.com.cursojava1.modulo4;

public class DataAdmissao {
	int dia;
	int mes;
	int ano;

	String getDataFormatada() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}

}
