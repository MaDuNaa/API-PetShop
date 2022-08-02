CREATE TABLE tb_atendimento (
id BIGINT AUTO_INCREMENT PRIMARY KEY,
dadosAnimal VARCHAR(255),
diagnostico VARCHAR(255) NOT NULL,
comentarios VARCHAR(255),
localdatatime VARCHAR(255) NOT NULL,
cliente_id BIGINT ,
cachorro_id BIGINT ,
medico_id BIGINT ,
FOREIGN KEY (cliente_id) REFERENCES tb_cliente(id),
FOREIGN KEY (cachorro_id) REFERENCES tb_cachorro(id),
FOREIGN KEY (medico_id) REFERENCES tb_medico(id) );