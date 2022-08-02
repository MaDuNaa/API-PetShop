package gft.dto.cachorro;

public class RegistroCachorroDTO {


    private String nome;
	private String especie;
	private String raca;
	private String vacina;
	private Long codigoCliente;


	

	public RegistroCachorroDTO() {
	
	}
	


	public RegistroCachorroDTO(String nome, String especie, String raca, String vacina, Long codigoCliente) {
		
		this.nome = nome;
		this.especie = especie;
		this.raca = raca;
		this.vacina = vacina;
		this.codigoCliente = codigoCliente;
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


	public Long getCodigoCliente() {
		return codigoCliente;
	}


	public void setCodigoCliente(Long codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	
	
}
