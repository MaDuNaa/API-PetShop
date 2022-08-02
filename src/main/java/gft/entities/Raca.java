package gft.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Raca {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String expectativaDeVida;
	

	public Raca(Long id, String nome, String expectativaDeVida) {
		
		this.id = id;
		this.nome = nome;
		this.expectativaDeVida = expectativaDeVida;
	}

	public Raca() {
	
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
	public String getExpectativaDeVida() {
		return expectativaDeVida;
	}
	public void setExpectativaDeVida(String expectativaDeVida) {
		this.expectativaDeVida = expectativaDeVida;
	}

	
	
	
}
