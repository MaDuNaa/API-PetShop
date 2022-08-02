package gft.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import gft.entities.Historico;
import gft.exception.EntityNotFoundException;
import gft.repository.HistoricoRepository;

@Service
public class HistoricoService {

	private final HistoricoRepository historicoRepository;

	public HistoricoService(HistoricoRepository historicoRepository) {
		this.historicoRepository = historicoRepository;
	}
	
	public Historico salvarHistorico(Historico historico) {
		return historicoRepository.save(historico);
	}
	
	public List<Historico> listarTodosOsHistorico() {
		return historicoRepository.findAll();
	}
	
	public Historico buscarHistoricoPorId(Long id) throws EntityNotFoundException{
    	Optional<Historico> historico = historicoRepository.findById(id);

        return historico.orElseThrow(() -> new EntityNotFoundException("Arquivo não encontrado!"));
    }
	

}
