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
			
			f.setNome("Hugo Ara�jo N�brega");
			f.setDepartamento("Desenvolvedor Java");
			f.setRg("2207962");
			
			
			
			empresa.adicionar(f);
			
			verSeContem = f;
		}
		
		empresa.mostraEmpresa();
		System.out.println("---- RELA��O DE FUNCIONARIOS ----");
		empresa.mostraEmpregados();
		
		System.out.println(empresa.contem(verSeContem));
	}
}
