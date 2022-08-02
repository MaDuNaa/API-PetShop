package gft.entities;


import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_cliente")
public class Cliente {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String telefone;
	private String email;
	
	@Embedded
	private Endereco endereco;
	
	@OneToMany(mappedBy = "cliente")
	private List<Cachorro> cachorro;
	
	@OneToMany(mappedBy = "cliente")
	private List<Gato> gato;
	
	@OneToMany(mappedBy = "cliente")
	private List<Atendimento> atendimento;
	
	@OneToMany(mappedBy = "cliente")
	private List<AtendimentoGato> atendimentogatoO;
	

	public Cliente(Long id, String nome, String telefone, String email, Endereco endereco, List<Cachorro> cachorro) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
		this.cachorro = cachorro;
	}


	public Cliente() {
	}
	
	


	public Cliente(Long id) {
		
		this.id = id;
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public List<Cachorro> getCachorro() {
		return cachorro;
	}


	public void setCachorro(List<Cachorro> cachorro) {
		this.cachorro = cachorro;
	}


}
