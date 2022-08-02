CREATE TABLE tb_atendimentogato (
id BIGINT AUTO_INCREMENT PRIMARY KEY,
dadosAnimal VARCHAR(255),
diagnostico VARCHAR(255) NOT NULL,
comentarios VARCHAR(255),
localdatatime VARCHAR(255) NOT NULL,
cliente_id BIGINT ,
gato_id BIGINT ,
medico_id BIGINT ,
FOREIGN KEY (cliente_id) REFERENCES tb_cliente(id),
FOREIGN KEY (gato_id) REFERENCES tb_gato(id),
FOREIGN KEY (medico_id) REFERENCES tb_medico(id) );