package gft.dto.racaGato;

import gft.entities.RacaGato;

public class RacaGatoMapper {
	
	public static RacaGato fromDTO (RegistroRacaGatoDTO dto) { 
		return new RacaGato(dto.getId(), dto.getName(), null);
	}
	
	public static ConsultaRacaGatoDTO fromEntity (RacaGato racaGato) {
		return new ConsultaRacaGatoDTO(racaGato.getId(), racaGato.getNome(), racaGato.getExpectativaDeVida());
	}

}
