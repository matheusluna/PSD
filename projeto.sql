﻿create table usuario(
    login varchar(50) not null unique primary key,
    senha varchar(30) not null,
    nome varchar(100) not null,
    apelido varchar(30) not null,
    dataNascimento varchar(11) not null,
    cidade varchar(50),
    email varchar(50) not null unique,
    profissao varchar(100),
    descricao text not null,
    status varchar(50) not null,
    altura real,
    peso real,
    corDoCabelo varchar(30),
    passatempos text not null,
    fotoPerfil text
);

create table galeria(
    email varchar(50) references usuario(email) on delete cascade on update cascade,
    foto text,
	datadepublicacao date,
    primary key(email, foto)
);

create table mensagem(
    id serial,
    de varchar(50) references usuario(email) on delete cascade on update cascade,
    para varchar(50) references usuario(email) on delete cascade on update cascade,
    mensagem text,
    primary key(id)
);

create table amizade(
    usuario varchar(50) references usuario(email) on delete cascade on update cascade,
    amigo varchar(50) references usuario(email) on delete cascade on update cascade,
    primary key(usuario, amigo)
);

create table pedidosAmizade(
    userEmail varchar(50) references usuario(email) on delete cascade on update cascade,
    userParaEmail varchar(50) references usuario(email) on delete cascade on update cascade,
    primary key(userEmail, userParaEmail)
);

create table pedidosRelacionamento(
    userEmail varchar(50) references usuario(email) on delete cascade on update cascade,
    userParaEmail varchar(50) references usuario(email) on delete cascade on update cascade,
    status varchar(50) not null,
    primary key(userEmail, userParaEmail)
);

create table relacionamento(
    userEmail varchar(50) references usuario(email) on delete cascade on update cascade,
    userParaEmail varchar(50) references usuario(email) on delete cascade on update cascade,
    status varchar(50) not null,
    primary key(userEmail, userParaEmail)
);

create table recomendacao(
	usuario varchar(50) references usuario(email) on delete cascade on update cascade,
	amigo varchar(50) references usuario(email) on delete cascade on update cascade,
	recomendarpara varchar(50) references usuario(email) on delete cascade on update cascade,
	primary key(usuario, amigo, recomendarpara)
);