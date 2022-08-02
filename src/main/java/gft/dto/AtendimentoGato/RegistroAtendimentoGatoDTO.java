package gft.dto.AtendimentoGato;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

public class RegistroAtendimentoGatoDTO {

	
	 private String dadosAnimal;
		private String diagnostico;
		private String comentarios;
		
		@JsonFormat(pattern="dd/MM/yyyy HH:mm:ss", shape = Shape.STRING)
		LocalDateTime localdatatime;
		
		private Long codigoCliente;
		private Long codigoMedico;
		private Long codigoGato;
		
		
		public RegistroAtendimentoGatoDTO(String dadosAnimal, String diagnostico, String comentarios,
				LocalDateTime localdatatime, Long codigoCliente, Long codigoMedico, Long codigoGato) {
			
			this.dadosAnimal = dadosAnimal;
			this.diagnostico = diagnostico;
			this.comentarios = comentarios;
			this.localdatatime = localdatatime;
			this.codigoCliente = codigoCliente;
			this.codigoMedico = codigoMedico;
			this.codigoGato = codigoGato;
		}


		public RegistroAtendimentoGatoDTO() {
			
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


		public Long getCodigoCliente() {
			return codigoCliente;
		}


		public void setCodigoCliente(Long codigoCliente) {
			this.codigoCliente = codigoCliente;
		}


		public Long getCodigoMedico() {
			return codigoMedico;
		}


		public void setCodigoMedico(Long codigoMedico) {
			this.codigoMedico = codigoMedico;
		}


		public Long getCodigoGato() {
			return codigoGato;
		}


		public void setCodigoGato(Long codigoGato) {
			this.codigoGato = codigoGato;
		}
		
		
		
}
