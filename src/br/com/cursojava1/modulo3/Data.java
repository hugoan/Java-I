package br.com.cursojava1.modulo3;

public class Data {
	int dia;
	int mes;
	int ano;

	String getDataFormatada() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
}
