package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.FuncionarioDAO;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaAlteraFunc {

	public static void main(String[] args) {
		
		Funcionario func = new FuncionarioDAO().pesquisar((long)1);
		func.setSenha("Jones@SI2015");
		new FuncionarioDAO().altera(func);

	}

}
