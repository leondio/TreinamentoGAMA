create database gamaitau;

use gamaitau;

# Esta linha é um comentário

CREATE TABLE funcionarios (
    codigo INT AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    endereco VARCHAR(80),
    PRIMARY KEY (codigo)
);

alter table funcionarios drop column endereco;

alter table funcionarios add endereco varchar(100) not null;

drop table funcionarios, projetos, dependentes, historicoprojetos;

CREATE TABLE funcionarios (
    matricula INT AUTO_INCREMENT,
    nome VARCHAR(40),
    salario DECIMAL(8 , 2 ),
    endereco VARCHAR(80),
    dataAdmissao DATE,
    dataNascimento DATE,
    departamento VARCHAR(30),
    PRIMARY KEY (matricula)
);
CREATE TABLE projetos (
    codigo INT AUTO_INCREMENT,
    descricao VARCHAR(60),
    dataInicio DATE,
    dataTermino DATE,
    PRIMARY KEY (codigo)
);
CREATE TABLE dependentes (
    codigo INT AUTO_INCREMENT,
    nome VARCHAR(60),
    dataNascimento DATE,
    matricula INT,
    PRIMARY KEY (codigo),
    FOREIGN KEY (matricula)
        REFERENCES funcionarios (matricula)
);
CREATE TABLE historicoprojetos (
    matricula INT,
    codigo_projeto INT,
    dataEntrada DATE,
    dataSaida DATE,
    PRIMARY KEY (matricula , codigo_projeto),
    FOREIGN KEY (matricula)
        REFERENCES funcionarios (matricula),
    FOREIGN KEY (codigo_projeto)
        REFERENCES projetos (codigo)
);

insert into funcionarios (matricula, nome, salario, endereco, dataAdmissao, dataNascimento, departamento) values (null, "Marcos", 1000, "rua candido 100", str_to_date("17/04/1980","%d/%m/%Y"), str_to_date("17/04/1971","%d/%m/%Y"), "TI");