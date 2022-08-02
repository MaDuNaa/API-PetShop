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
@Table(name = "tb_gato")
public class Gato {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String raca;
	
	//@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	//private RacaGato racaGato;
	
	@ManyToOne
	private Cliente cliente;
	
	@OneToMany(mappedBy = "gato")
	private List<AtendimentoGato> atendimentogato;
	

	public Gato(Long id, String nome, String raca, Cliente cliente) {
		
		this.id = id;
		this.nome = nome;
		this.raca = raca;
		this.cliente = cliente;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public Gato() {
		super();
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



	public String getRaca() {
		return raca;
	}



	public void setRaca(String raca) {
		this.raca = raca;
	}




}
