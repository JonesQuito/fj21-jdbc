package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.FuncionarioDAO;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaInsereFuncionario {

	public static void main(String[] args) {

		Funcionario func1 = new Funcionario("José Dhyone Quito de Oliveira", "dhyone_quito", "dhyone123");
		Funcionario func2 = new Funcionario("Jamile Quito", "jamile_quito", "jam123");
		Funcionario func3 = new Funcionario("Maria Antonia Soares Quito", "edileuza_quito", "edi123");
		Funcionario func4 = new Funcionario("Juan Eliel de Moraes Quito", "juanito_quito", "juan123");
		Funcionario func5 = new Funcionario("Benjamim de Moraes Quito", "benja_quito", "benja123");
		Funcionario func6 = new Funcionario("Simone Leitão Cardoso", "monikita", "monica123");
		Funcionario func7 = new Funcionario("Teste", "teste", "testel123");
		
		new FuncionarioDAO().adiciona(func1);
		new FuncionarioDAO().adiciona(func2);
		new FuncionarioDAO().adiciona(func3);
		new FuncionarioDAO().adiciona(func4);
		new FuncionarioDAO().adiciona(func5);
		new FuncionarioDAO().adiciona(func6);
		new FuncionarioDAO().adiciona(func7);
		
		
		
		
		
		

	}

}
