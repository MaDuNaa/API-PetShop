package gft.dto.cliente;

import gft.dto.endereco.EnderecoDTO;

public class RegistroClienteDTO {
	
	private String nome;
	
	private String telefone;
	
	private String email;
	
	private EnderecoDTO endereco;
	private Long ClienteId;
	
	

	public EnderecoDTO getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoDTO endereco) {
		this.endereco = endereco;
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

	public Long getClienteId() {
		return ClienteId;
	}

	public void setClienteId(Long clienteId) {
		ClienteId = clienteId;
	}
	
	

}
