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

import gft.dto.AtendimentoGato.AtendimentoGatoMapper;
import gft.dto.AtendimentoGato.ConsultaAtendimentoGatoDTO;
import gft.dto.AtendimentoGato.RegistroAtendimentoGatoDTO;
import gft.entities.AtendimentoGato;
import gft.services.AtendimentoGatoService;

@RestController
@RequestMapping("v1/atendimentosgatos")
public class AtendimentoGatoController {
	
	 private final AtendimentoGatoService atendimentogatoService;
		
		public AtendimentoGatoController(AtendimentoGatoService atendimentogatoService) {
			this.atendimentogatoService = atendimentogatoService;
		}
		
		@GetMapping
	    public ResponseEntity<Page<ConsultaAtendimentoGatoDTO>> buscarTodosOsAtendimentosGato(@PageableDefault Pageable pageable) {
			  
			  
			  return  ResponseEntity.ok(atendimentogatoService.listarTodosOsAtendimentosGato(pageable)
					  .map(AtendimentoGatoMapper::fromEntity));
			  
	    }
		
		 @PostMapping
		  public ResponseEntity<ConsultaAtendimentoGatoDTO> salvarAtendimentoGato(@RequestBody RegistroAtendimentoGatoDTO dto){
			  
			  AtendimentoGato atendimentogato = atendimentogatoService.salvarAtendimentoGato(dto);
			  
			  return ResponseEntity.ok(AtendimentoGatoMapper.fromEntity(atendimentogato));
			  
		  }
		 
		 @GetMapping("{id}")
		  public ResponseEntity<ConsultaAtendimentoGatoDTO> buscarAtendimentoGato(@PathVariable Long id) {
			  
			 
			      AtendimentoGato atendimentogato = atendimentogatoService.buscarAtendimentoGato(id);
			  
			      return ResponseEntity.ok(AtendimentoGatoMapper.fromEntity(atendimentogato));
			  
		  }
		 
		 @PutMapping("{id}")
		  public ResponseEntity<ConsultaAtendimentoGatoDTO> alterarAtendimentoGato(@RequestBody RegistroAtendimentoGatoDTO dto,
				  @PathVariable Long id) {
			  
			  try {
			  AtendimentoGato atendimentogato = atendimentogatoService.atualizarAtendimentoGato(AtendimentoGatoMapper.fromDTO(dto, null, null, null), id);
			  
			  return ResponseEntity.ok(AtendimentoGatoMapper.fromEntity(atendimentogato));
			  }catch(RuntimeException ex) {
				  return ResponseEntity.notFound().build();
			  }
		  }
		 
		 @DeleteMapping("{id}")
	     public ResponseEntity<ConsultaAtendimentoGatoDTO> excluirAtendimentoGato(@PathVariable Long id) {
			  
			  try {
			     atendimentogatoService.excluirAtendimentoGato(id);
			  
			      return ResponseEntity.ok().build();
			  }catch(RuntimeException ex) {
				  return ResponseEntity.notFound().build();
			  }
		 }  

}
