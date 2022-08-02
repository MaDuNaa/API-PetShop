package gft.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
@Table(name = "tb_atendimentogato")
public class AtendimentoGato {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String dadosAnimal;
	
	private String diagnostico;
	
	private String comentarios;
	
	@JsonFormat(pattern="dd/MM/yyyy HH:mm:ss", shape = Shape.STRING)
	LocalDateTime localdatatime;
	
	@ManyToOne
	private Medico medico;
	
	@ManyToOne
	private Cliente cliente;
	
	@ManyToOne
	private Gato gato;
	

	public AtendimentoGato(Long id, String dadosAnimal, String diagnostico, String comentarios,
			LocalDateTime localdatatime, Medico medico, Cliente cliente, Gato gato) {
		
		this.id = id;
		this.dadosAnimal = dadosAnimal;
		this.diagnostico = diagnostico;
		this.comentarios = comentarios;
		this.localdatatime = localdatatime;
		this.medico = medico;
		this.cliente = cliente;
		this.gato = gato;
	}


	public AtendimentoGato() {
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDadosAnimal() {
		return dadosAnimal;
	}


	public void setDadosAnimal(String dadosAnimal) {
		this.dadosAnimal = dadosAnimal;
	}


	public String getDiagnostico() {
		return diagnostico;
	}


	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}


	public String getComentarios() {
		return comentarios;
	}


	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}


	public LocalDateTime getLocaldatatime() {
		return localdatatime;
	}


	public void setLocaldatatime(LocalDateTime localdatatime) {
		this.localdatatime = localdatatime;
	}


	public Medico getMedico() {
		return medico;
	}


	public void setMedico(Medico medico) {
		this.medico = medico;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Gato getGato() {
		return gato;
	}


	public void setGato(Gato gato) {
		this.gato = gato;
	}
	
	

}
