package br.com.cursojava.modeficadoresdeacesso;

public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario f = new Funcionario();

		f.setNome("Hugo Araújo Nóbrega");
		f.setDepartamento("Desenvolvedor Java");
		f.setRg("2207962");

		DataAdmissao data = new DataAdmissao();
		data.defineData(1, 8, 2011);

		f.setData(data);
		f.setSalario(10000.00);

		f.mostra();
	}

}
