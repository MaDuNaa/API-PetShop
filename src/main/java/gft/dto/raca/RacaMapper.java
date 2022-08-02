package gft.dto.raca;

import gft.entities.Raca;

public class RacaMapper {
	
	public static Raca fromDTO (RegistroRacaDTO dto) { 
		return new Raca(dto.getId(), dto.getName(), null);
	}
	
	public static ConsultaRacaDTO fromEntity (Raca raca) {
		return new ConsultaRacaDTO(raca.getId(), raca.getNome(), raca.getExpectativaDeVida());
	}

}
