package gft.dto.AtendimentoGato;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import gft.dto.cliente.ConsultaClienteDTO;
import gft.dto.gato.ConsultaGatoDTO;
import gft.dto.medico.ConsultaMedicoDTO;

public class ConsultaAtendimentoGatoDTO {
	
	private Long id;
    private String dadosAnimal;
	private String diagnostico;
	private String comentarios;
	
	@JsonFormat(pattern="dd/MM/yyyy HH:mm:ss", shape = Shape.STRING)
	LocalDateTime localdatatime;
	
	private ConsultaClienteDTO cliente;
	private ConsultaMedicoDTO medico;
	private ConsultaGatoDTO gato;
	
	public ConsultaAtendimentoGatoDTO(Long id, String dadosAnimal, String diagnostico, String comentarios,
			LocalDateTime localdatatime, ConsultaClienteDTO cliente, ConsultaGatoDTO gato, ConsultaMedicoDTO medico) {
		
		this.id = id;
		this.dadosAnimal = dadosAnimal;
		this.diagnostico = diagnostico;
		this.comentarios = comentarios;
		this.localdatatime = localdatatime;
		this.cliente = cliente;
		this.medico = medico;
		this.gato = gato;
	}

	public ConsultaAtendimentoGatoDTO() {
		
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

	public ConsultaClienteDTO getCliente() {
		return cliente;
	}

	public void setCliente(ConsultaClienteDTO cliente) {
		this.cliente = cliente;
	}

	public ConsultaMedicoDTO getMedico() {
		return medico;
	}

	public void setMedico(ConsultaMedicoDTO medico) {
		this.medico = medico;
	}

	public ConsultaGatoDTO getGato() {
		return gato;
	}

	public void setGato(ConsultaGatoDTO gato) {
		this.gato = gato;
	}

	@Override
	public String toString() {
		return "ConsultaAtendimentoGatoDTO [id=" + id + ", dadosAnimal=" + dadosAnimal + ", diagnostico=" + diagnostico
				+ ", comentarios=" + comentarios + ", localdatatime=" + localdatatime + ", cliente=" + cliente
				+ ", medico=" + medico + ", gato=" + gato + "]";
	}

	
	

}
