package br.com.caelum.jdbc.teste;

import java.text.DateFormat;
import java.util.Calendar;

import javax.swing.JOptionPane;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class TesteUpdate {
	
	public static void main(String[] args){
		
		Contato contato = new ContatoDAO().pesquisarContato(Long.parseLong(JOptionPane.showInputDialog("Id do Contatos")));
		
		System.out.println(contato.toString());
				
		contato.setNome(JOptionPane.showInputDialog("Nome"));
		contato.setEmail(JOptionPane.showInputDialog("Email"));
		contato.setEndereco(JOptionPane.showInputDialog("Endereço"));
		
		int ano = Integer.parseInt((JOptionPane.showInputDialog("Ano do Nascimento")));
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Mês do Nascimento")) -1;
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Dia do Nascimento"));
		
		Calendar data = Calendar.getInstance();
		data.set(ano, mes, dia);
		contato.setDataNascimento(data);
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.DEFAULT);
		System.out.println("Id: " + contato.getId());
		System.out.println("Nome: " + contato.getNome());
		System.out.println("Email: " + contato.getEmail());
		System.out.println("Endereço: " + contato.getEndereco());
		System.out.println("Nascimento: " + df.format(contato.getDataNascimento().getTime()));
		
		//alterar contato
		ContatoDAO dao = new ContatoDAO();
		dao.altera(contato);
		
		System.out.println("Atualizado!");
		
		
		
		
		
	}

}
