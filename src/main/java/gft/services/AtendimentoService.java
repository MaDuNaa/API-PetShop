package gft.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import gft.dto.atendimento.AtendimentoMapper;
import gft.dto.atendimento.RegistroAtendimentoDTO;
import gft.entities.Atendimento;
import gft.entities.Cachorro;
import gft.entities.Cliente;
import gft.entities.Historico;
import gft.entities.Medico;
import gft.exception.EntityNotFoundException;
import gft.repository.AtendimentoRepository;
import gft.repository.CachorroRepository;
import gft.repository.ClienteRepository;
import gft.repository.MedicoRepository;

@Service
public class AtendimentoService {
	
	@Autowired
	private HistoricoService historicoService;
	
	@Autowired
	private AtendimentoRepository atendimentoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private MedicoRepository medicoRepository;
	
	@Autowired
	private CachorroRepository cachorroRepository;
	
	 public Atendimento salvarAtendimento(RegistroAtendimentoDTO dto) {
	    	
			Cliente cliente = clienteRepository.findById(dto.getCodigoCliente()).orElseThrow(() -> 
			new RuntimeException("Cliente não encontrado."));
			
			Medico medico = medicoRepository.findById(dto.getCodigoMedico()).orElseThrow(() ->
			new RuntimeException("Medico não encontrado"));
			
			Cachorro cachorro = cachorroRepository.findById(dto.getCodigoCachorro()).orElseThrow(() ->
			new RuntimeException("Cachorro não encontrado"));
			

			return atendimentoRepository.save(AtendimentoMapper.fromDTO(dto, cliente, medico, cachorro));
			
		}
	 
	 public Page<Atendimento> listarTodosOsAtendimentos(Pageable pageable){
	 		
			return atendimentoRepository.findAll(pageable);
			
		}
	
	 public Atendimento buscarAtendimento(Long id) {
			
	        Optional<Atendimento> optional = atendimentoRepository.findById(id);
			
			return optional.orElseThrow(() -> new EntityNotFoundException("Atendimento não encontrado."));
			
		}
	 
	 public Atendimento atualizarAtendimento(Atendimento atendimento, Long id) {
	 		
	 		Atendimento atendimentoOriginal = this.buscarAtendimento(id);
	 		
	 	   atendimento.setId(atendimentoOriginal.getId());
	 	   
	 	   return atendimentoRepository.save(atendimento);
	 		
	 	}
	 
	 public void excluirAtendimento(Long id) {
	 		Atendimento atendimentoOriginal = this.buscarAtendimento(id);
	 		
	 		Historico historico = new Historico(null, AtendimentoMapper.fromEntity(atendimentoOriginal).toString());
			historicoService.salvarHistorico(historico);

	 		
	 		atendimentoRepository.delete(atendimentoOriginal);
	 		
	 	}
 
}
