package br.com.cursojava1.construtores;

import br.com.cursojava1.modulo3.Data;

public class TestaEmpresa {
	public static void main(String[] args){
		
		Empresa empresa = new Empresa();
		Funcionario verSeContem = new Funcionario();
		verSeContem = null;
		
		empresa.setNome("Sindiatacadista");
		empresa.setCnpj("04.835.601/0001-75");
		
		for(int i = 0; i < empresa.empregados.length; i++){
			Funcionario f = new Funcionario();
			
			f.setNome("Hugo Araújo Nóbrega");
			f.setDepartamento("Desenvolvedor Java");
			f.setRg("2207962");
			
			
			
			empresa.adicionar(f);
			
			verSeContem = f;
		}
		
		empresa.mostraEmpresa();
		System.out.println("---- RELAÇÃO DE FUNCIONARIOS ----");
		empresa.mostraEmpregados();
		
		System.out.println(empresa.contem(verSeContem));
	}
}
