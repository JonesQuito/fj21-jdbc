package br.com.caelum.jdbc.teste;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaLista {

	public static void main(String[] args) {
		
		ContatoDAO dao = new ContatoDAO();
		
		List<Contato> contatos = dao.getLista();
		
		/* ##################### DOIS MODOS DE FOMATAR DATA ####################*/
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		/*  #####			 OU				#####	*/
		
		DateFormat df = DateFormat.getDateInstance();
		/* ##################### DOIS MODOS DE FOMATAR DATA ####################*/
	
		
		for(Contato contato: contatos){
			System.out.println("Id: " + contato.getId());
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endereço: " + contato.getEndereco());
			System.out.println("Nascimento: " + sdf.format(contato.getDataNascimento().getTime()));
			System.out.println("Nascimento: " + df.format(contato.getDataNascimento().getTime()));
		}
		
		
		

	}

}
