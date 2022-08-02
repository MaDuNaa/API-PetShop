package gft.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import gft.dto.raca.ConsultaRacaDTO;
import gft.services.RacaService;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("v1/racas")
public class RacaController {
	
	private final RacaService racaService;

	public RacaController(RacaService racaService) {
		this.racaService = racaService;
	}

	@GetMapping("busca/todas")
	private ResponseEntity<Flux<ConsultaRacaDTO>> buscaTodasAsRacas() {
		return ResponseEntity.ok(racaService.buscaTodasAsRacas());
	}
	
	@GetMapping("busca/porNome")
	private ResponseEntity<Flux<ConsultaRacaDTO>> buscaRacaPorNome(@RequestParam String nome) {
		return ResponseEntity.ok(racaService.buscaRacaPorNome(nome));
	}
	
	@GetMapping("busca/{id}")
	private ResponseEntity<Flux<ConsultaRacaDTO>> buscaRacaPorId(@PathVariable Long id) {
		return ResponseEntity.ok(racaService.buscaRacaPorId(id));
	}



}
