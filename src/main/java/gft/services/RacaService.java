package gft.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import gft.dto.raca.ConsultaRacaDTO;
import gft.dto.raca.RacaMapper;
import gft.dto.raca.RegistroRacaDTO;
import gft.entities.Raca;
import reactor.core.publisher.Flux;

@Service
public class RacaService {
	

	public Flux<ConsultaRacaDTO> buscaTodasAsRacas() {
		
			String uri = "https://api.thedogapi.com/v1/breeds/?api_key=ee570607-976b-4acf-8606-2297159c4ff9";
			WebClient client = WebClient.create(uri);
			WebClient.ResponseSpec responseSpec = client.get().retrieve();
			Flux<ConsultaRacaDTO> responseBody = responseSpec.bodyToFlux(ConsultaRacaDTO.class);
			
			return responseBody;
		
	}
	
	public Flux<ConsultaRacaDTO> buscaRacaPorNome(String nome) {
		
			String uri = "https://api.thedogapi.com/v1/breeds/search?api_key=ee570607-976b-4acf-8606-2297159c4ff9"+nome;
			WebClient client = WebClient.create(uri);
			WebClient.ResponseSpec responseSpec = client.get().retrieve();
			Flux<ConsultaRacaDTO> responseBody = responseSpec.bodyToFlux(ConsultaRacaDTO.class);
			
			return responseBody;
		
		
	}
	
	public Raca criaRacaPelaBusca (Long id) {
		
			String uri = "https://api.thedogapi.com/v1/breeds/"+id+"?api_key=ee570607-976b-4acf-8606-2297159c4ff9";
			WebClient client = WebClient.create(uri);
			WebClient.ResponseSpec responseSpec = client.get().retrieve();
			Flux<RegistroRacaDTO> responseBody = responseSpec.bodyToFlux(RegistroRacaDTO.class);
			List<RegistroRacaDTO> listaDTO = responseBody.collectList().block();
			Raca raca = RacaMapper.fromDTO(listaDTO.get(0));
			return raca;
			
	}
	
	public Flux<ConsultaRacaDTO> buscaRacaPorId(Long id) {
		
			String uri = "https://api.thedogapi.com/v1/breeds/"+id+"?api_key=78d56926-6be0-4d78-86d3-448f3b88eaf5";
			WebClient client = WebClient.create(uri);
			WebClient.ResponseSpec responseSpec = client.get().retrieve();
			Flux<ConsultaRacaDTO> responseBody = responseSpec.bodyToFlux(ConsultaRacaDTO.class);
			
			return responseBody;
		
	}
	


}
