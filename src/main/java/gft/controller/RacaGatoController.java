package gft.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import gft.dto.racaGato.ConsultaRacaGatoDTO;
import gft.services.RacaGatoService;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("v1/racasgatos")
public class RacaGatoController {
	
	private final RacaGatoService racaGatoService;

	public RacaGatoController(RacaGatoService racaGatoService) {
		this.racaGatoService = racaGatoService;
	}

	@GetMapping("busca/todas")
	private ResponseEntity<Flux<ConsultaRacaGatoDTO>> buscaTodasAsRacasGato() {
		return ResponseEntity.ok(racaGatoService.buscaTodasAsRacasGato());
	}
	
	@GetMapping("busca/porNome")
	private ResponseEntity<Flux<ConsultaRacaGatoDTO>> buscaRacaGatoPorNome(@RequestParam String nome) {
		return ResponseEntity.ok(racaGatoService.buscaRacaGatoPorNome(nome));
	}
	
	@GetMapping("busca/{id}")
	private ResponseEntity<Flux<ConsultaRacaGatoDTO>> buscaRacaGatoPorId(@PathVariable Long id) {
		return ResponseEntity.ok(racaGatoService.buscaRacaGatoPorId(id));
	}



}
