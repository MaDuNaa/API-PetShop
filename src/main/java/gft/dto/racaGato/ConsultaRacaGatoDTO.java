package gft.dto.racaGato;

public class ConsultaRacaGatoDTO {
	
	private String id;
	private String name;
	private String life_span;
	
	
	

	public ConsultaRacaGatoDTO(String id, String name, String life_span) {
		
		this.id = id;
		this.name = name;
		this.life_span = life_span;
	}


	public ConsultaRacaGatoDTO() {
		
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLife_span() {
		return life_span;
	}


	public void setLife_span(String life_span) {
		this.life_span = life_span;
	}


	
	

}
