CREATE DATABASE sistema_vendas;

USE sistema_vendas;

CREATE TABLE Produtos (
  codProduto INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  nome VARCHAR(30) NOT NULL,
  valor DOUBLE NOT NULL,
  unidade VARCHAR(3) NOT NULL,
  descricao VARCHAR(80) NOT NULL,
  imagem VARCHAR(40) NOT NULL DEFAULT 'src\main\resources\produtos',
  PRIMARY KEY(codProduto)
);

CREATE TABLE Vendedores (
  codVendedor INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  nome VARCHAR(30) NOT NULL,
  cpf VARCHAR(15) NOT NULL UNIQUE,
  dataNascimento varchar(10) NOT NULL,
  email VARCHAR(50) NOT NULL,
  contato1 VARCHAR(11) NOT NULL,
  contato2 VARCHAR(11) NULL,
  usuario VARCHAR(15) NOT NULL UNIQUE,
  senha VARCHAR(15) NOT NULL,
  tipo VARCHAR(8) NOT NULL DEFAULT 'Vendedor',
  estadoAtual VARCHAR(7) NOT NULL DEFAULT 'Ativo',
  comissao DOUBLE NOT NULL DEFAULT 0,
  PRIMARY KEY(codVendedor)
);

CREATE TABLE Clientes (
  codCliente INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  nomeFantasia VARCHAR(30) NOT NULL,
  razaoSocial VARCHAR(40) NOT NULL,
  cnpj VARCHAR(19) NOT NULL UNIQUE,
  email VARCHAR(50) NOT NULL,
  contato1 VARCHAR(11) NOT NULL,
  contato2 VARCHAR(11) NULL,
  usuario VARCHAR(15) NOT NULL UNIQUE,
  senha VARCHAR(15) NOT NULL,
  tipo VARCHAR(8) NOT NULL DEFAULT 'Cliente',
  estadoAtual VARCHAR(7) NOT NULL DEFAULT 'Ativo',
  rua VARCHAR(20) NOT NULL,
  numero VARCHAR(8) NOT NULL,
  bairro VARCHAR(20) NOT NULL,
  cidade VARCHAR(20) NOT NULL,
  estado VARCHAR(2) NOT NULL,
  complemento VARCHAR(60) NULL,
  PRIMARY KEY(codCliente)
);

CREATE TABLE Vendas (
  codVenda INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Vendedores_codVendedor INTEGER UNSIGNED NOT NULL,
  Clientes_codCliente INTEGER UNSIGNED NOT NULL,
  dataVenda DATE NOT NULL,
  valorVenda DOUBLE NOT NULL,
  razaoSocial VARCHAR(40) NOT NULL,
  PRIMARY KEY(codVenda),
  FOREIGN KEY(Clientes_codCliente)
    REFERENCES Clientes(codCliente)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(Vendedores_codVendedor)
    REFERENCES Vendedores(codVendedor)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE ItensVenda (
  codItemVenda INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Produtos_codProduto INTEGER UNSIGNED NOT NULL,
  Vendas_codVenda INTEGER UNSIGNED NOT NULL,
  quantidade INTEGER UNSIGNED NULL,
  valor DOUBLE NULL,
  nomeProduto VARCHAR(30) NULL,
  PRIMARY KEY(codItemVenda),
  FOREIGN KEY(Vendas_codVenda)
    REFERENCES Vendas(codVenda)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(Produtos_codProduto)
    REFERENCES Produtos(codProduto)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

select * from Vendedores;
select * from Clientes;
select * from Produtos;
select * from ItensVenda;
select * from Vendas;

insert into Vendedores (nome, cpf, dataNascimento, email, contato1, contato2, usuario, senha) values ('Jeferson', '111.222.333-03', '15/11/1998', 'email@email.com', '1111112222', '2222221111', 'jeff', '12345');

insert into Clientes (nomeFantasia, razaoSocial, cnpj, email, contato1, contato2, usuario, senha, rua, numero, bairro, cidade, estado, complemento) values ('Fantasia', 'Razão Social', '13.456.789/0001-01', 'empresa@email.com', '1111123456', '11981286341', 'cliente', '12345', 'Rua Panorama', '155', 'JD STO Eduardo', 'Embu das Artes', 'SP', 'Complemento');

insert into Produtos (nome, valor, unidade, descricao, imagem) values ('Castanha', 150.00, 'KG', 'Castanha seca do Pará.', 'src\main\resources\produtos');
insert into Produtos (nome, valor, unidade, descricao, imagem) values ('Castanha Caju', 100.00, 'KG', 'Castanha do caju rica em vitamina tal...', 'src\main\resources\produtos\caju.png');
insert into Produtos (nome, valor, unidade, descricao, imagem) values ('Ameixa', 80.00, 'KG', 'Ameixarica em vitamina tal...', 'src\main\resources\produtos\ameixa.png');
insert into Produtos (nome, valor, unidade, descricao, imagem) values ('òleo de coco', 50.00, 'L', 'Òleo de coco', 'src\main\resources\produtos\oleo.png');

insert into Vendas (Vendedores_codVendedor, Clientes_codCliente, dataVenda, valorVenda, razaoSocial) values (1, 1, '2021-06-06', 310, 'Teste');