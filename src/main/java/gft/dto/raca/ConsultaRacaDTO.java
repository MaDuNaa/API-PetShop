package gft.dto.raca;

public class ConsultaRacaDTO {
	
	private Long id;
	private String name;
	private String life_span;
	
	
	public ConsultaRacaDTO(Long id, String name, String life_span) {
	
		this.id = id;
		this.name = name;
		this.life_span = life_span;
	}


	public ConsultaRacaDTO() {
	
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
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
