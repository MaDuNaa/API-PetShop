package gft.dto.atendimento;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

public class RegistroAtendimentoDTO {

	
    private String dadosAnimal;
	private String diagnostico;
	private String comentarios;
	
	@JsonFormat(pattern="dd/MM/yyyy HH:mm:ss", shape = Shape.STRING)
	LocalDateTime localdatatime;
	
	private Long codigoCliente;
	private Long codigoMedico;
	private Long codigoCachorro;
	
	
	
	public RegistroAtendimentoDTO() {
	
	}


	public RegistroAtendimentoDTO(String dadosAnimal, String diagnostico, String comentarios,
			LocalDateTime localdatatime, Long codigoCliente, Long codigoMedico, Long codigoCachorro) {
		this.dadosAnimal = dadosAnimal;
		this.diagnostico = diagnostico;
		this.comentarios = comentarios;
		this.localdatatime = localdatatime;
		this.codigoCliente = codigoCliente;
		this.codigoMedico = codigoMedico;
		this.codigoCachorro = codigoCachorro;
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


	public Long getCodigoCachorro() {
		return codigoCachorro;
	}


	public void setCodigoCachorro(Long codigoCachorro) {
		this.codigoCachorro = codigoCachorro;
	}
	
	
	
	
	
}
