package br.com.caelum.jdbc.teste;

import java.text.DateFormat;

import javax.swing.JOptionPane;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaPesquisaComId {

	public static void main(String[] args) {

		ContatoDAO dao = new ContatoDAO();
		
		DateFormat df = DateFormat.getDateInstance();
		
		Contato contato = dao.pesquisarContato(Long.parseLong(JOptionPane.showInputDialog("Id de pesquisa")));
		System.out.println("Id: " + contato.getId());
		System.out.println("Nome: " + contato.getNome());
		System.out.println("Email: " + contato.getEmail());
		System.out.println("Endereço: " + contato.getEndereco());
		System.out.println("Nascimento: " + df.format(contato.getDataNascimento().getTime()));
				

	}

}
