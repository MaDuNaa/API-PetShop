package gft.dto.cachorro;


import gft.dto.cliente.ConsultaClienteDTO;


public class ConsultaCachorroDTO {

	
    private Long id;
	private String nome;
	private String especie;
	private String raca;
	private String vacina;
	private ConsultaClienteDTO cliente;
	



	public ConsultaCachorroDTO(Long id, String nome, String especie, String raca, String vacina,
			ConsultaClienteDTO cliente) {
	
		this.id = id;
		this.nome = nome;
		this.especie = especie;
		this.raca = raca;
		this.vacina = vacina;
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





	public String getEspecie() {
		return especie;
	}





	public void setEspecie(String especie) {
		this.especie = especie;
	}





	public String getRaca() {
		return raca;
	}





	public void setRaca(String raca) {
		this.raca = raca;
	}





	public String getVacina() {
		return vacina;
	}





	public void setVacina(String vacina) {
		this.vacina = vacina;
	}





	public ConsultaClienteDTO getCliente() {
		return cliente;
	}





	public void setCliente(ConsultaClienteDTO cliente) {
		this.cliente = cliente;
	}




	@Override
	public String toString() {
		return "ConsultaCachorroDTO [id=" + id + ", nome=" + nome + ", especie=" + especie + ", raca=" + raca
				+ ", vacina=" + vacina + ", cliente=" + cliente + "]";
	}
	
	
	
	
}
