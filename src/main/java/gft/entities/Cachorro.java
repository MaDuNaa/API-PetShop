package gft.entities;


import java.util.List;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Embeddable
@Table(name = "tb_cachorro")
public class Cachorro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String especie;
	
	private String raca;
	
	private String vacina;
	
	@ManyToOne
	private Cliente cliente;
	
	@OneToMany(mappedBy = "cachorro")
	private  List<Atendimento> atendimento;
	
	
	public Cachorro() {
		
	}


	public Cachorro(Long id, String nome, String especie, String raca, String vacina, Cliente cliente) {
	
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



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	

	
	

}
