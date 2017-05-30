/*CRIA A TABELA DE FUNCIONÁRIOS*/
create table funcionarios(
	id bigint not null auto_increment,
    nome varchar(255),
    usuario varchar(100),
    senha varchar(32),
    primary key(id)
);

/*COMANDOS PARA MANIPULAR A TABELA DE FUNCIONÁRIOS*/
select * from funcionarios;