-- Criação do banco de dados
CREATE DATABASE db_pizzaria_legal;

-- Criação das tabelas
CREATE TABLE tb_pizza(
	id INT,
    tipo VARCHAR(100),
    tamanho VARCHAR(100),
    bordaRecheada VARCHAR(5),
    PRIMARY KEY(id)
);

CREATE TABLE tb_categoria(
	id INT,
    sabor VARCHAR(100),
    recheioBorda VARCHAR(100),
    Adicional VARCHAR(100),
    Retirar VARCHAR(100),
	preco DOUBLE,
    id_pizza INT,
    PRIMARY KEY (id),
	FOREIGN KEY (id_pizza) REFERENCES tb_pizza(id)
);

-- Inserção de dados

INSERT INTO tb_pizza VALUES (1, 'Doce', 'Média', 'Não');
INSERT INTO tb_pizza VALUES (2, 'Salgada', 'Grande', 'Sim');
INSERT INTO tb_pizza VALUES (3, 'Salgada', 'Grande', 'Não');

INSERT INTO tb_categoria VALUES (1, 'Quatro Queijos', 'Catupiry', 'Não', 'Não', 49.00, 2);
INSERT INTO tb_categoria VALUES (2, 'Brigadeiro', 'Sem recheio', 'Nao', 'Não', 40, 1);
INSERT INTO tb_categoria VALUES (3, 'Lombo Canadense', 'Sem recheio', 'Bacon', 'Não', 67.00, 3); 

-- Execução das consultas

SELECT * FROM tb_categoria
	WHERE preco > 45;
    
SELECT * FROM tb_categoria
	WHERE preco BETWEEN 29 and 60;
    
SELECT * FROM tb_categoria
	WHERE sabor LIKE '%C%';
    
SELECT * FROM tb_pizza
	INNER JOIN tb_categoria on tb_categoria.id = tb_pizza.id;
    
SELECT * FROM tb_pizza
	WHERE tipo = 'Salgada';