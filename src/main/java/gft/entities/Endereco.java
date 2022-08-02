package gft.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Endereco {
	
	private String logradouro;
	private String numero;
	private String complemento;

	public Endereco(String logradouro, String numero, String complemento) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
	}
	
	
	public Endereco() {
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
