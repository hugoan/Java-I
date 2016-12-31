package br.com.cursojava1.construtores;


public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		DataAdmissao data = new DataAdmissao(01, 12, 16);

		f.setNome("Hugo Araújo Nóbrega");
		f.setDepartamento("Desenvolvedor Java");
		f.setRg("2207962");

		data.preencheData(1, 8, 2011);

		f.setDataDeEntrada(data);
		f.setSalario(10000.00);

		f.mostraFuncionario();
		
		System.out.println("----------------------------");
		
		Funcionario f1 = new Funcionario();
		DataAdmissao data1 = new DataAdmissao(01, 12, 16);

		f1.setNome("Hugo Araújo Nóbrega");
		f1.setDepartamento("Desenvolvedor Java");
		f1.setRg("2207962");

		data1.preencheData(1, 8, 2011);

		f1.setDataDeEntrada(data);
		f1.setSalario(10000.00);

		f1.mostraFuncionario();
		
		System.out.println(f == f1);
	
	}

}
