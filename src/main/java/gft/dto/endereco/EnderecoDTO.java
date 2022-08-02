package gft.dto.endereco;

public class EnderecoDTO {
	
	private String logradouro;
	
	private String numero;
	
	private String complemento;

	public EnderecoDTO(String logradouro, String numero, String complemento) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
	}

	public EnderecoDTO() {
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	

}
