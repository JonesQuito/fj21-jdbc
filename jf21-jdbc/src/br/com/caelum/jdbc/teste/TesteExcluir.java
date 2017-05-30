package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class TesteExcluir {

	public static void main(String[] args) {

		ContatoDAO dao = new ContatoDAO();
		Contato contato = dao.pesquisarContato((long)6);
		new ContatoDAO().remove(contato);
		
		System.out.println(contato.getNome()+ " excluido com sucesso!!");

	}

}
