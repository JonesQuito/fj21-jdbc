package br.com.caelum.jdbc.teste;

import javax.swing.JOptionPane;

import br.com.caelum.jdbc.dao.FuncionarioDAO;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaExcluiFunc {
	
	public static void main(String[] args){
		
		Funcionario func = new FuncionarioDAO().pesquisar(Long.parseLong(JOptionPane.showInputDialog("id do Funcionário")));
		
		new FuncionarioDAO().excluir(func);
	}

}
