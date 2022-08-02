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

import gft.dto.atendimento.AtendimentoMapper;
import gft.dto.atendimento.ConsultaAtendimentoDTO;
import gft.dto.atendimento.RegistroAtendimentoDTO;
import gft.entities.Atendimento;
import gft.services.AtendimentoService;

@RestController
@RequestMapping("v1/atendimentos")
public class AtendimentoController {
	
    private final AtendimentoService atendimentoService;
	
	public AtendimentoController(AtendimentoService atendimentoService) {
		this.atendimentoService = atendimentoService;
	}
	
	@GetMapping
    public ResponseEntity<Page<ConsultaAtendimentoDTO>> buscarTodosOsAtendimentos(@PageableDefault Pageable pageable) {
		  
		  
		  return  ResponseEntity.ok(atendimentoService.listarTodosOsAtendimentos(pageable)
				  .map(AtendimentoMapper::fromEntity));
		  
    }
	
	 @PostMapping
	  public ResponseEntity<ConsultaAtendimentoDTO> salvarAtendimento(@RequestBody RegistroAtendimentoDTO dto){
		  
		  Atendimento atendimento = atendimentoService.salvarAtendimento(dto);
		  
		  return ResponseEntity.ok(AtendimentoMapper.fromEntity(atendimento));
		  
	  }
	 
	 @GetMapping("{id}")
	  public ResponseEntity<ConsultaAtendimentoDTO> buscarAtendimento(@PathVariable Long id) {
		  
		 
		      Atendimento atendimento = atendimentoService.buscarAtendimento(id);
		  
		      return ResponseEntity.ok(AtendimentoMapper.fromEntity(atendimento));
		  
	  }
	 
	 @PutMapping("{id}")
	  public ResponseEntity<ConsultaAtendimentoDTO> alterarAtendimento(@RequestBody RegistroAtendimentoDTO dto,
			  @PathVariable Long id) {
		  
		  try {
		  Atendimento atendimento = atendimentoService.atualizarAtendimento(AtendimentoMapper.fromDTO(dto, null, null, null), id);
		  
		  return ResponseEntity.ok(AtendimentoMapper.fromEntity(atendimento));
		  }catch(RuntimeException ex) {
			  return ResponseEntity.notFound().build();
		  }
	  }
	 
	 @DeleteMapping("{id}")
     public ResponseEntity<ConsultaAtendimentoDTO> excluirAtendimento(@PathVariable Long id) {
		  
		  try {
		     atendimentoService.excluirAtendimento(id);
		  
		      return ResponseEntity.ok().build();
		  }catch(RuntimeException ex) {
			  return ResponseEntity.notFound().build();
		  }
		  
	
  }
	 
	 

}
