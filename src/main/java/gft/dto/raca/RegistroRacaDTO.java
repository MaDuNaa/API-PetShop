package gft.dto.raca;

public class RegistroRacaDTO {
	
	private Long id;
	private String name;
	
	
	public RegistroRacaDTO() {
		
	}

	public RegistroRacaDTO(Long id, String name) {
		
		this.id = id;
		this.name = name;
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

	

}
