package br.com.caelum.jdbc.modelo;

public class Funcionario {
	
	/*ATRIBUTOS DE FUNCIONARIO*/
	private long id;
	private String nome;
	private String usuario;
	private String senha;
	
	/*CONSTRUTORES PARA FUNCION�RIO*/
	public Funcionario(){}
	
	public Funcionario(String nome, String usuario, String senha){
		this.nome = nome;
		this.usuario = usuario;
		this.senha = senha;
	}
	
	public Funcionario(long id, String nome, String usuario, String senha){
		this.id =  id;
		this.nome = nome;
		this.usuario = usuario;
		this.senha = senha;
	}
	
	/*M�TODOS ACESSORES DE FUNCIONARIOS*/
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	
	

}
