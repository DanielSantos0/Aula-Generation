CREATE DATABASE db_generation_game_online;

-- Criação de tabelas
CREATE TABLE tb_classe(
	id INT,
    nome VARCHAR(100),
    especie VARCHAR(100),
    elemento VARCHAR(100),
    PRIMARY KEY (id)
);

CREATE TABLE tb_personagem(
	id INT,
    nome VARCHAR(100),
    armadura VARCHAR(100),
    arma VARCHAR(100),
    ataque INT,
    defesa INT,
    id_classe INT,
    PRIMARY KEY (id),
    FOREIGN KEY (id_classe) REFERENCES tb_classe(id)
);

-- Inserção de dados
INSERT INTO tb_classe VALUES(1, 'Monstro', 'Orc', 'Terra');
INSERT INTO tb_classe VALUES(2, 'Humano', 'Homem', 'Fogo');
 
INSERT INTO tb_personagem VALUES (1, 'Kratos', 'Ferro', 'Machado', 3000, 4000, 1);
INSERT INTO tb_personagem VALUES (2, 'Nathan', 'Couro', 'Pistola', 1000, 2400, 2);
INSERT INTO tb_personagem VALUES (3, 'Carlos', 'Couro', 'Sem arma', 1500, 1000, 2);
INSERT INTO tb_personagem VALUES (4, 'Jorge', 'Ferro', 'Espada', 1500, 1200, 2);

-- Execução de consultas
SELECT * FROM tb_personagem
	WHERE ataque > 2000;
    
SELECT * FROM tb_personagem
	WHERE defesa BETWEEN 1000 and 2000;
    
SELECT * FROM tb_personagem
	WHERE nome LIKE '%C%';
    
SELECT * FROM tb_classe
	INNER JOIN tb_personagem on tb_personagem.id = tb_classe.id;
    
SELECT * FROM tb_classe
	WHERE especie = 'Orc';


    
   



