package br.com.caelum.jdbc.teste;

import javax.swing.JOptionPane;

import br.com.caelum.jdbc.dao.FuncionarioDAO;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaPesquisaFunc {

	public static void main(String[] args) {
		
		long id = Long.parseLong(JOptionPane.showInputDialog("Id do funcionário"));
		
		FuncionarioDAO dao = new FuncionarioDAO();
		
		Funcionario func = dao.pesquisar(id);
		
		System.out.println("Id: " + func.getId() );
		System.out.println("Nome: " + func.getNome());
		System.out.println("Usuário: " + func.getUsuario());
		System.out.println("Senha: " + func.getSenha());
	}

}
