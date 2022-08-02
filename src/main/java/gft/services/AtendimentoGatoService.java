package gft.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import gft.dto.AtendimentoGato.AtendimentoGatoMapper;
import gft.dto.AtendimentoGato.RegistroAtendimentoGatoDTO;
import gft.entities.AtendimentoGato;
import gft.entities.Cliente;
import gft.entities.Gato;
import gft.entities.Historico;
import gft.entities.Medico;
import gft.exception.EntityNotFoundException;
import gft.repository.AtendimentoGatoRepository;
import gft.repository.ClienteRepository;
import gft.repository.GatoRepository;
import gft.repository.MedicoRepository;

@Service
public class AtendimentoGatoService {
	
	@Autowired
	private HistoricoService historicoService;
	
	@Autowired
	private AtendimentoGatoRepository atendimentogatoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private MedicoRepository medicoRepository;
	
	@Autowired
	private GatoRepository gatoRepository;
	
	 public AtendimentoGato salvarAtendimentoGato(RegistroAtendimentoGatoDTO dto) {
	    	
			Cliente cliente = clienteRepository.findById(dto.getCodigoCliente()).orElseThrow(() -> 
			new RuntimeException("Cliente não encontrado."));
			
			Medico medico = medicoRepository.findById(dto.getCodigoMedico()).orElseThrow(() ->
			new RuntimeException("Medico não encontrado"));
			
			Gato gato = gatoRepository.findById(dto.getCodigoGato()).orElseThrow(() ->
			new RuntimeException("Gato não encontrado"));
			

			return atendimentogatoRepository.save(AtendimentoGatoMapper.fromDTO(dto, cliente, medico, gato));
			
		}
	 
	 public Page<AtendimentoGato> listarTodosOsAtendimentosGato(Pageable pageable){
	 		
			return atendimentogatoRepository.findAll(pageable);
			
		}
	
	 public AtendimentoGato buscarAtendimentoGato(Long id) {
			
	        Optional<AtendimentoGato> optional = atendimentogatoRepository.findById(id);
			
			return optional.orElseThrow(() -> new EntityNotFoundException("Atendimento não encontrado."));
			
		}
	 
	 public AtendimentoGato atualizarAtendimentoGato(AtendimentoGato atendimentogato, Long id) {
	 		
	 		AtendimentoGato atendimentogatoOriginal = this.buscarAtendimentoGato(id);
	 		
	 	   atendimentogato.setId(atendimentogatoOriginal.getId());
	 	   
	 	   return atendimentogatoRepository.save(atendimentogato);
	 		
	 	}
	 
	 public void excluirAtendimentoGato(Long id) {
	 		AtendimentoGato atendimentogatoOriginal = this.buscarAtendimentoGato(id);
	 		
	 		Historico historico = new Historico(null, AtendimentoGatoMapper.fromEntity(atendimentogatoOriginal).toString());
			historicoService.salvarHistorico(historico);

	 		
	 		atendimentogatoRepository.delete(atendimentogatoOriginal);
	 		
	 	}

}
