package br.com.cursojava.modeficadoresdeacesso;

public class TestaEmpresa {
	public static void main(String[] args){
		
		Empresa empresa = new Empresa();
		Funcionario verSeContem = new Funcionario();
		verSeContem = null;
		
		empresa.nome = "Sindiatacadista";
		empresa.cnpj = "04.835.601/0001-75";
		
		for(int i = 0; i < empresa.empregados.length; i++){
			Funcionario f = new Funcionario();
			f.nome = "Hugo Araújo Nóbrega";
			f.departamento = "Desenvolvedor Java";
			f.rg = "2207962";
			f.data.dia = 1;
			f.data.mes = 8;
			f.data.ano = 2011;
			f.salario = 10000.00 + 1 * 100;
			
			empresa.adicionar(f);
			
			verSeContem = f;
		}
		
		empresa.mostraEmpresa();
		System.out.println("---- RELAÇÃO DE FUNCIONARIOS ----");
		empresa.mostraEmpregados();
		
		System.out.println(empresa.contem(verSeContem));
	}
}
