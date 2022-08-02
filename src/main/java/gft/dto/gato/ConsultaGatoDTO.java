package gft.dto.gato;

import gft.dto.cliente.ConsultaClienteDTO;

public class ConsultaGatoDTO {

	private Long id;
	private String nome;
	private String raca;
	private ConsultaClienteDTO cliente;
	
	
	
	//private ConsultaRacaGatoDTO racaGatoDTO;
	
	
	public ConsultaGatoDTO() {
		
	}

	public ConsultaGatoDTO(Long id, String nome, String raca, ConsultaClienteDTO cliente) {
		
		this.id = id;
		this.nome = nome;
		this.raca = raca;
		this.cliente = cliente;
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


	public ConsultaClienteDTO getCliente() {
		return cliente;
	}


	public void setCliente(ConsultaClienteDTO cliente) {
		this.cliente = cliente;
	}




	public String getRaca() {
		return raca;
	}



	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	public String toString() {
		return "ConsultaGatoDTO [id=" + id + ", nome=" + nome + ", raca=" + raca + ", cliente=" + cliente + "]";
	}
	
	
	
	
	
}
