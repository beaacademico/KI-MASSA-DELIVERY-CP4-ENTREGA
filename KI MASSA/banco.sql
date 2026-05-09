CREATE DATABASE kimassa;

CREATE TABLE cliente (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100),
    endereco VARCHAR(200),
    telefone VARCHAR(20)
);

CREATE TABLE produto (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100),
    preco NUMERIC(10,2),
    estoque INT
);

CREATE TABLE entregador (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100),
    veiculo VARCHAR(50),
    disponivel BOOLEAN
);

CREATE TABLE pedido (
    id SERIAL PRIMARY KEY,
    id_cliente INT,
    id_produto INT,
    id_entregador INT,
    quantidade INT, 
    valor_total NUMERIC(10,2),
);

INSERT INTO cliente(nome, endereco, telefone)
VALUES
('Beatriz', 'Rua Central', '11999999999');

INSERT INTO produto(nome, preco, estoque)
VALUES
('Pizza Calabresa', 55.00, 20),
('Hamburguer Artesanal', 35.00, 15);

INSERT INTO entregador(nome, veiculo, disponivel)
VALUES
('Carlos', 'Moto', true);