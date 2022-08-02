package gft.dto.gato;

public class RegistroGatoDTO {

	 private String nome;
	 
	 private String raca;
	 
	 private Long codigoCliente;
	 
	 
	 
	 
	public RegistroGatoDTO() {
		
	}


	public RegistroGatoDTO(String nome, String raca, Long codigoCliente) {
		
		this.nome = nome;
		this.raca = raca;
		this.codigoCliente = codigoCliente;
	}





	public String getRaca() {
		return raca;
	}




	public void setRaca(String raca) {
		this.raca = raca;
	}



	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Long getCodigoCliente() {
		return codigoCliente;
	}


	public void setCodigoCliente(Long codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	

	 
	 
	
}
