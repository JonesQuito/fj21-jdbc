/*CRIA O BANCO DE DADOS*/
create database fj21;

/*USA O BANCO DE DADOS*/
use fj21;

/*CRIA A TABELA DE CONTATOS*/
create table contatos(
	id bigint not null auto_increment,
	nome varchar(255),
	email varchar(255),
	endereco varchar(255),
	dataNascimento date,
	primary key(id)
);

/*CRIA A TABELA DE FUNCION�RIOS*/
create table funcionarios(
	id bigint not null auto_increment,
    nome varchar(255),
    usuario varchar(100),
    senha varchar(32),
    primary key(id)
);

/*COMANDOS PARA MANIPULAR A TABELA DE CONTATOS*/
select * from contatos;




/*COMANDOS PARA MANIPULAR A TABELA DE FUNCION�RIOS*/


