package gft.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import gft.dto.racaGato.ConsultaRacaGatoDTO;
import gft.dto.racaGato.RacaGatoMapper;
import gft.dto.racaGato.RegistroRacaGatoDTO;
import gft.entities.RacaGato;
import reactor.core.publisher.Flux;

@Service
public class RacaGatoService {
	
	public Flux<ConsultaRacaGatoDTO> buscaTodasAsRacasGato() {
		
		String uri = "https://api.thecatapi.com/v1/breeds/?api_key=7e82d4dd-b6f0-4be8-9764-e95e0aa03089";
		WebClient client = WebClient.create(uri);
		WebClient.ResponseSpec responseSpec = client.get().retrieve();
		Flux<ConsultaRacaGatoDTO> responseBody = responseSpec.bodyToFlux(ConsultaRacaGatoDTO.class);
		
		return responseBody;
	
}

public Flux<ConsultaRacaGatoDTO> buscaRacaGatoPorNome(String nome) {
	
		String uri = "https://api.thecatapi.com/v1/breeds/search?api_key=7e82d4dd-b6f0-4be8-9764-e95e0aa03089"+nome;
		WebClient client = WebClient.create(uri);
		WebClient.ResponseSpec responseSpec = client.get().retrieve();
		Flux<ConsultaRacaGatoDTO> responseBody = responseSpec.bodyToFlux(ConsultaRacaGatoDTO.class);
		
		return responseBody;
	
	
}

public RacaGato criaRacaGatoPelaBusca (Long id) {
	
		String uri = "https://api.thecatapi.com/v1/breeds/"+id+"?api_key=7e82d4dd-b6f0-4be8-9764-e95e0aa03089";
		WebClient client = WebClient.create(uri);
		WebClient.ResponseSpec responseSpec = client.get().retrieve();
		Flux<RegistroRacaGatoDTO> responseBody = responseSpec.bodyToFlux(RegistroRacaGatoDTO.class);
		List<RegistroRacaGatoDTO> listaDTO = responseBody.collectList().block();
		RacaGato racaGato = RacaGatoMapper.fromDTO(listaDTO.get(0));
		return racaGato;
		
}

public Flux<ConsultaRacaGatoDTO> buscaRacaGatoPorId(Long id) {
	
		String uri = "https://api.thecatapi.com/v1/breeds/"+id+"?api_key=7e82d4dd-b6f0-4be8-9764-e95e0aa03089";
		WebClient client = WebClient.create(uri);
		WebClient.ResponseSpec responseSpec = client.get().retrieve();
		Flux<ConsultaRacaGatoDTO> responseBody = responseSpec.bodyToFlux(ConsultaRacaGatoDTO.class);
		
		return responseBody;
	
}

}
