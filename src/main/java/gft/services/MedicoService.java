package gft.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import gft.entities.Medico;
import gft.exception.EntityNotFoundException;
import gft.repository.MedicoRepository;

@Service
public class MedicoService {
	
	private final MedicoRepository medicoRepository;
	
	public MedicoService(MedicoRepository medicoRepository) {
		this.medicoRepository = medicoRepository;
	}
	
      public Medico salvarMedico(Medico medico) {
		
		return medicoRepository.save(medico);
		
	}
      
      public Page<Medico> listarTodosOsMedicos(Pageable pageable){
  		
  		return medicoRepository.findAll(pageable);
  		
  	}
      
      public Medico buscarMedico(Long id) {
  		
          Optional<Medico> optional = medicoRepository.findById(id);
  		
  		return optional.orElseThrow(() -> new EntityNotFoundException("Medico não encontrado."));
  		
  	}
      
      public Medico atualizarMedico(Medico medico, Long id) {
  		
  		Medico medicoOriginal = this.buscarMedico(id);
  		
  	   medico.setId(medicoOriginal.getId());
  	   
  	   return medicoRepository.save(medico);
  		
  	}
      
      public void excluirMedico(Long id) {
  		Medico medicoOriginal = this.buscarMedico(id);
  		
  		medicoRepository.delete(medicoOriginal);
  		
  	}

  	

}
