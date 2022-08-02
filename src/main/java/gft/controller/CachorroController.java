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

import gft.dto.cachorro.CachorroMapper;
import gft.dto.cachorro.ConsultaCachorroDTO;
import gft.dto.cachorro.RegistroCachorroDTO;
import gft.entities.Cachorro;
import gft.services.CachorroService;

@RestController
@RequestMapping("v1/cachorros")
public class CachorroController {
	
    private final CachorroService cachorroService;
	
	public CachorroController(CachorroService cachorroService) {
		this.cachorroService = cachorroService;
	}
	
	@GetMapping
    public ResponseEntity<Page<ConsultaCachorroDTO>> buscarTodosOsCachorros(@PageableDefault Pageable pageable) {
		  
		  
		  return  ResponseEntity.ok(cachorroService.listarTodosOsCachorro(pageable)
				  .map(CachorroMapper::fromEntity));
		  
    }
	
	 @PostMapping
	  public ResponseEntity<ConsultaCachorroDTO> salvarCachorro(@RequestBody RegistroCachorroDTO dto){
		  
		  Cachorro cachorro = cachorroService.salvarCachorro(dto);
		  
		  return ResponseEntity.ok(CachorroMapper.fromEntity(cachorro));
		  
	  }
	 
	 @GetMapping("{id}")
	  public ResponseEntity<ConsultaCachorroDTO> buscarCachorro(@PathVariable Long id) {
		  
		  
		      Cachorro cachorro = cachorroService.buscarCachorro(id);
		  
		      return ResponseEntity.ok(CachorroMapper.fromEntity(cachorro));
		
	  }
	 
	 @PutMapping("{id}")
	  public ResponseEntity<ConsultaCachorroDTO> alterarCachorro(@RequestBody RegistroCachorroDTO dto,
			  @PathVariable Long id) {
		  
		  try {
		  Cachorro cachorro = cachorroService.atualizarCachorro(CachorroMapper.fromDTO(dto, null), id);
		  
		  return ResponseEntity.ok(CachorroMapper.fromEntity(cachorro));
		  }catch(RuntimeException ex) {
			  return ResponseEntity.notFound().build();
		  }
	  }
	 
	 @DeleteMapping("{id}")
     public ResponseEntity<ConsultaCachorroDTO> excluirCachorro(@PathVariable Long id) {
		  
		  try {
		     cachorroService.excluirCachorro(id);
		  
		      return ResponseEntity.ok().build();
		  }catch(RuntimeException ex) {
			  return ResponseEntity.notFound().build();
		  }
		  
  }

}
