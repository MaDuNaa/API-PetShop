package gft.dto.atendimento;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import gft.dto.cachorro.ConsultaCachorroDTO;
import gft.dto.cliente.ConsultaClienteDTO;
import gft.dto.medico.ConsultaMedicoDTO;

public class ConsultaAtendimentoDTO {
	
	
	    private Long id;
	    private String dadosAnimal;
		private String diagnostico;
		private String comentarios;
		
		@JsonFormat(pattern="dd/MM/yyyy HH:mm:ss", shape = Shape.STRING)
		LocalDateTime localdatatime;
		
		private ConsultaClienteDTO cliente;
		private ConsultaMedicoDTO medico;
		private ConsultaCachorroDTO cachorro;
		
		


		public ConsultaAtendimentoDTO() {
		
		}



		public ConsultaAtendimentoDTO(Long id, String dadosAnimal, String diagnostico, String comentarios,
				LocalDateTime localdatatime, ConsultaClienteDTO cliente, ConsultaCachorroDTO cachorro,
				ConsultaMedicoDTO medico) {
		
			this.id = id;
			this.dadosAnimal = dadosAnimal;
			this.diagnostico = diagnostico;
			this.comentarios = comentarios;
			this.localdatatime = localdatatime;
			this.cliente = cliente;
			this.medico = medico;
			this.cachorro = cachorro;
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



		public ConsultaCachorroDTO getCachorro() {
			return cachorro;
		}



		public void setCachorro(ConsultaCachorroDTO cachorro) {
			this.cachorro = cachorro;
		}



		@Override
		public String toString() {
			return "ConsultaAtendimentoDTO [id=" + id + ", dadosAnimal=" + dadosAnimal + ", diagnostico=" + diagnostico
					+ ", comentarios=" + comentarios + ", localdatatime=" + localdatatime + ", cliente=" + cliente
					+ ", medico=" + medico + ", cachorro=" + cachorro + "]";
		}


		
}
