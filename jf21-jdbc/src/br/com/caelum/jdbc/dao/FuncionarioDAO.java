package br.com.caelum.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.caelum.jdbc.ConnectionFactory;
import br.com.caelum.jdbc.modelo.Funcionario;

public class FuncionarioDAO {
	
	private Connection connection;
	
	public FuncionarioDAO(){
		
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void adiciona(Funcionario funcionario){
		
		String sql = "insert into funcionarios (nome, usuario, senha) values (?, ?, ?)";
		
		try(PreparedStatement stmt = this.connection.prepareStatement(sql)){
			stmt.setString(1, funcionario.getNome());
			stmt.setString(2, funcionario.getUsuario());
			stmt.setString(3, funcionario.getSenha());
			
			stmt.execute();
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	
	
	public List<Funcionario> getLista(){
		
		String sql = "select * from funcionarios";
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		try(PreparedStatement stmt = this.connection.prepareStatement(sql); ResultSet rs = stmt.executeQuery()){
			while(rs.next()){
				Funcionario func = new Funcionario(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getString(4));
				funcionarios.add(func);
			}
			
			return funcionarios;
			
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	
	public Funcionario pesquisar(long idFuncionario){
		
		String sql = "select * from funcionarios where id=?";
		
		try{
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setLong(1, idFuncionario);
		
			ResultSet rs = stmt.executeQuery();
			
			Funcionario funcionario = new Funcionario();
			if(rs.next()){
				funcionario.setId(rs.getLong(1));
				funcionario.setNome(rs.getString(2));
				funcionario.setUsuario(rs.getString(3));
				funcionario.setSenha(rs.getString(4));
			}
			rs.close();
			stmt.close();
			return funcionario;
	
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	public void altera(Funcionario funcionario){
		
		String sql = "update funcionarios set nome=?, usuario=?, senha=? where id=?";
		
		try{
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setString(1, funcionario.getNome());
			stmt.setString(2, funcionario.getUsuario());
			stmt.setString(3, funcionario.getSenha());
			stmt.setLong(4, funcionario.getId());
			
			stmt.execute();
			stmt.close();
			
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
		
	}
	
	public void excluir(Funcionario funcionario){
		
		String sql = "delete from funcionarios where id=?";
		
		try{
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setLong(1, funcionario.getId());
			
			stmt.execute();
			stmt.close();
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
		
	}

}
