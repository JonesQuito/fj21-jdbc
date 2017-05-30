package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import javax.swing.JOptionPane;


import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaInsere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contato contato = new Contato();
		contato.setNome(JOptionPane.showInputDialog("Nome"));
		contato.setEmail(JOptionPane.showInputDialog("Email"));
		contato.setEndereco(JOptionPane.showInputDialog("Endereço"));
		
		int ano = Integer.parseInt((JOptionPane.showInputDialog("Ano do Nascimento")));
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Mês do Nascimento")) -1;
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Dia do Nascimento"));
		
		Calendar data = Calendar.getInstance();		
		data.set(ano, mes, dia);
		contato.setDataNascimento(data);
		
		//grave nessa conexão
		ContatoDAO dao = new ContatoDAO();
		
		//método elegante
		dao.adiciona(contato);
		
		System.out.println("Gravado!");

	}

}
