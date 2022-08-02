package gft.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gft.entities.Historico;
import gft.services.HistoricoService;

@RestController
@RequestMapping("v1/historicos")
public class HistoricoController {
	
private final HistoricoService historicoService;
	
	public HistoricoController(HistoricoService historicoService) {
		this.historicoService = historicoService;
	}
	
	
	@GetMapping
	public ResponseEntity<List<Historico>> buscarTodosOsHistoricos(@PageableDefault Pageable pageable) {
				
		return ResponseEntity.ok(historicoService.listarTodosOsHistorico().stream().
				collect(Collectors.toList()));
	}

		

    @GetMapping("{id}")
    public ResponseEntity<Historico> buscarHistoricosPorId(@PathVariable Long id) {
  	
        return ResponseEntity.ok(historicoService.buscarHistoricoPorId(id));        
    }


}
