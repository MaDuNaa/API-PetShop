package gft.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gft.dto.gato.ConsultaGatoDTO;
import gft.dto.gato.GatoMapper;
import gft.dto.gato.RegistroGatoDTO;
import gft.entities.Gato;
import gft.services.GatoService;

@RestController
@RequestMapping("v1/gatos")
public class GatoController {
	
	 private final GatoService gatoService;
		
		public GatoController(GatoService gatoService) {
			this.gatoService = gatoService;
		}
		
		@GetMapping
	    public ResponseEntity<Page<ConsultaGatoDTO>> buscarTodosOsGato(@PageableDefault Pageable pageable) {
			  
			  
			  return  ResponseEntity.ok(gatoService.listarTodosOsGato(pageable)
					  .map(GatoMapper::fromEntity));
			  
	    }
		
		 @PostMapping
		  public ResponseEntity<ConsultaGatoDTO> salvarGato(@RequestBody RegistroGatoDTO dto){
			  
			  Gato gato = gatoService.salvarGato(dto);
			  
			  return ResponseEntity.ok(GatoMapper.fromEntity(gato));
			  
		  }
		 
		 @GetMapping("{id}")
		  public ResponseEntity<ConsultaGatoDTO> buscarGato(@PathVariable Long id) {
			  
			  
			      Gato gato  = gatoService.buscarGato(id);
			  
			      return ResponseEntity.ok(GatoMapper.fromEntity(gato));
			
		  }
		 
		 @PutMapping("{id}")
		  public ResponseEntity<ConsultaGatoDTO> alterarGato(@RequestBody RegistroGatoDTO dto,
				  @PathVariable Long id) {
			  
			  try {
			  Gato gato = gatoService.atualizarGato(GatoMapper.fromDTO(dto, null), id);
			  
			  return ResponseEntity.ok(GatoMapper.fromEntity(gato));
			  }catch(RuntimeException ex) {
				  return ResponseEntity.notFound().build();
			  }
		  }
		 
		 @DeleteMapping("{id}")
	     public ResponseEntity<ConsultaGatoDTO> excluirGato(@PathVariable Long id) {
			  
			  try {
			     gatoService.excluirGato(id);
			  
			      return ResponseEntity.ok().build();
			  }catch(RuntimeException ex) {
				  return ResponseEntity.notFound().build();
			  }
			  
	  }

}
