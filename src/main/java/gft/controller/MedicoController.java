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

import gft.dto.medico.ConsultaMedicoDTO;
import gft.dto.medico.MedicoMapper;
import gft.dto.medico.RegistroMedicoDTO;
import gft.entities.Medico;
import gft.services.MedicoService;

@RestController
@RequestMapping("v1/medicos")
public class MedicoController {

	private final MedicoService medicoService;
	
	public MedicoController(MedicoService medicoService) {
		this.medicoService = medicoService;
	}
	
	@GetMapping
    public ResponseEntity<Page<ConsultaMedicoDTO>> buscarTodosOsMedicos(@PageableDefault Pageable pageable) {
		  
		  
		  return  ResponseEntity.ok(medicoService.listarTodosOsMedicos(pageable)
				  .map(MedicoMapper::fromEntity));
		  
    }
	
	 @PostMapping
	  public ResponseEntity<ConsultaMedicoDTO> salvarMedico(@RequestBody RegistroMedicoDTO dto){
		  
		  Medico medico = medicoService.salvarMedico(MedicoMapper.fromDTO(dto));
		  
		  return ResponseEntity.ok(MedicoMapper.fromEntity(medico));
		  
	  }
	 
	 @GetMapping("{id}")
	  public ResponseEntity<ConsultaMedicoDTO> buscarMedico(@PathVariable Long id) {
		  
		 
		      Medico medico = medicoService.buscarMedico(id);
		  
		      return ResponseEntity.ok(MedicoMapper.fromEntity(medico));
		  
	  }
	 
	  @PutMapping("{id}")
	  public ResponseEntity<ConsultaMedicoDTO> alterarMedico(@RequestBody RegistroMedicoDTO dto,
			  @PathVariable Long id) {
		  
		  try {
		  Medico medico = medicoService.atualizarMedico(MedicoMapper.fromDTO(dto), id);
		  
		  return ResponseEntity.ok(MedicoMapper.fromEntity(medico));
		  }catch(RuntimeException ex) {
			  return ResponseEntity.notFound().build();
		  }
	  }
	  
	  @DeleteMapping("{id}")
      public ResponseEntity<ConsultaMedicoDTO> excluirMedico(@PathVariable Long id) {
		  
		  try {
		     medicoService.excluirMedico(id);
		  
		      return ResponseEntity.ok().build();
		  }catch(RuntimeException ex) {
			  return ResponseEntity.notFound().build();
		  }
		  
   }
}
