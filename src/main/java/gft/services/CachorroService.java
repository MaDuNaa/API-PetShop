package gft.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import gft.dto.cachorro.CachorroMapper;
import gft.dto.cachorro.RegistroCachorroDTO;
import gft.entities.Cachorro;
import gft.entities.Cliente;
import gft.exception.EntityNotFoundException;
import gft.repository.CachorroRepository;
import gft.repository.ClienteRepository;

@Service
public class CachorroService {
	
	@Autowired
	private  CachorroRepository cachorroRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	
	
    public Cachorro salvarCachorro(RegistroCachorroDTO dto) {
    	
		Cliente cliente = clienteRepository.findById(dto.getCodigoCliente()).orElseThrow(() -> 
		new RuntimeException("Cliente não encontrado."));

		return cachorroRepository.save(CachorroMapper.fromDTO(dto, cliente));
		
	}
    
    public Page<Cachorro> listarTodosOsCachorro(Pageable pageable){
 		
		return cachorroRepository.findAll(pageable);
		
	}
    
     public Cachorro buscarCachorro(Long id) {
		
        Optional<Cachorro> optional = cachorroRepository.findById(id);
		
		return optional.orElseThrow(() -> new EntityNotFoundException("Cachorro não encontrado."));
		
	}
     
     public Cachorro atualizarCachorro(Cachorro cachorro, Long id) {
 		
 		Cachorro cachorroOriginal = this.buscarCachorro(id);
 		
 	   cachorro.setId(cachorroOriginal.getId());
 	   
 	   return cachorroRepository.save(cachorro);
 		
 	}
     
     public void excluirCachorro(Long id) {
 		Cachorro cachorroOriginal = this.buscarCachorro(id);
 		
 		cachorroRepository.delete(cachorroOriginal);
 		
 	}

}
