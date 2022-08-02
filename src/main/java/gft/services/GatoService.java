package gft.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import gft.dto.gato.GatoMapper;
import gft.dto.gato.RegistroGatoDTO;
import gft.entities.Cliente;
import gft.entities.Gato;
import gft.exception.EntityNotFoundException;
import gft.repository.ClienteRepository;
import gft.repository.GatoRepository;

@Service
public class GatoService {
	
	@Autowired
	private  GatoRepository gatoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	//@Autowired
	//private RacaGatoRepository racaGatoRepository;
	
	 public Gato salvarGato(RegistroGatoDTO dto) {
	    	
			Cliente cliente = clienteRepository.findById(dto.getCodigoCliente()).orElseThrow(() -> 
			new RuntimeException("Cliente não encontrado."));
			
			//RacaGato racaGato = racaGatoRepository.findById(dto.getCodigoRacaGato()).orElseThrow(() -> 
			//new RuntimeException("Raca não encontrada."));
			
			
			return gatoRepository.save(GatoMapper.fromDTO(dto, cliente));
			
		}
	    
	    public Page<Gato> listarTodosOsGato(Pageable pageable){
	 		
			return gatoRepository.findAll(pageable);
			
		}
	    
	     public Gato buscarGato(Long id) {
			
	        Optional<Gato> optional = gatoRepository.findById(id);
			
			return optional.orElseThrow(() -> new EntityNotFoundException("Gato não encontrado."));
			
		}
	     
	     public Gato atualizarGato(Gato gato, Long id) {
	 		
	 		Gato gatoOriginal = this.buscarGato(id);
	 		
	 	   gato.setId(gatoOriginal.getId());
	 	   
	 	   return gatoRepository.save(gato);
	 		
	 	}
	     
	     public void excluirGato(Long id) {
	 		Gato gatoOriginal = this.buscarGato(id);
	 		
	 		gatoRepository.delete(gatoOriginal);
	 		
	 	}
	

}
