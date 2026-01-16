# fuctura_java-fullstack
projetos do curso de java fullstack

## criar banco de dados

-- CRIAÇAO DE TABELA------
create table autor(
id serial,
nome varchar(255),
primary key(id)
);


create table categoria(
id serial,
nome varchar(255),
primary key(id)
);

create  table livro(
id serial,
titulo varchar(255),
primary key(id)
);

create table usuario(
id serial,
nome varchar(255),
primary key(id)
);

create table exemplar(
id serial,
codigoTombo varchar(255),
disponivel bool,
primary key(id)
);

create table emprestimo(
id serial,
dataEmprestimo date,
dataDevolucao date, 
primary key(id)
);

-- Inserir/ cadastrar----

insert into autor (nome)
values ('Denis');

-- buscar os dados da tabela--
select id, nome from autor;
