package gft.dto.medico;

import gft.dto.endereco.EnderecoDTO;

public class ConsultaMedicoDTO {

	private Long id;
	private String nome;
	private String telefone;
	private String email;
	private EnderecoDTO endereco;
	
	
	public ConsultaMedicoDTO(Long id, String nome, String telefone, String email, EnderecoDTO endereco) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
	}

	public ConsultaMedicoDTO() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public EnderecoDTO getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoDTO endereco) {
		this.endereco = endereco;
	}
	
	
	
}
