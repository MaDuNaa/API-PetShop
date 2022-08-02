package gft.dto.atendimento;

import gft.dto.cachorro.CachorroMapper;
import gft.dto.cliente.ClienteMapper;
import gft.dto.medico.MedicoMapper;
import gft.entities.Atendimento;
import gft.entities.Cachorro;
import gft.entities.Cliente;
import gft.entities.Medico;

public class AtendimentoMapper {
	
	    
	public static Atendimento fromDTO(RegistroAtendimentoDTO dto, Cliente cliente, Medico medico,
			Cachorro cachorro) {
		
		return new Atendimento(dto.getCodigoCliente(), dto.getDadosAnimal(), dto.getDiagnostico(), dto.getComentarios(),
				dto.getLocaldatatime(), medico, cliente, cachorro);
				
	}
	
	public static ConsultaAtendimentoDTO fromEntity(Atendimento atendimento) {
		return new ConsultaAtendimentoDTO(atendimento.getId(), atendimento.getDadosAnimal(),
				atendimento.getDiagnostico(), atendimento.getComentarios(), atendimento.getLocaldatatime(),
				ClienteMapper.fromEntity(atendimento.getCliente()),
				CachorroMapper.fromEntity(atendimento.getCachorro()),
				MedicoMapper.fromEntity(atendimento.getMedico()));
	}
	
	
	
}
