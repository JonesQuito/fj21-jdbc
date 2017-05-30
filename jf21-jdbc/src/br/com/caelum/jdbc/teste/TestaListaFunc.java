package br.com.caelum.jdbc.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.jdbc.dao.FuncionarioDAO;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaListaFunc {
	
	public static void main(String[] args){
		
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		funcionarios = new FuncionarioDAO().getLista();
		
		for(Funcionario func : funcionarios){
			System.out.println("Id: " + func.getId());
			System.out.println("Nome: " + func.getNome());
			System.out.println("Usuário: " + func.getUsuario());
			System.out.println("Senha: " + func.getSenha());
			System.out.println();
		}
	}

}
