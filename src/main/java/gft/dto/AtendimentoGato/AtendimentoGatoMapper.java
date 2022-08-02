package gft.dto.AtendimentoGato;

import gft.dto.cliente.ClienteMapper;
import gft.dto.gato.GatoMapper;
import gft.dto.medico.MedicoMapper;
import gft.entities.AtendimentoGato;
import gft.entities.Cliente;
import gft.entities.Gato;
import gft.entities.Medico;

public class AtendimentoGatoMapper {

	public static AtendimentoGato fromDTO(RegistroAtendimentoGatoDTO dto, Cliente cliente, Medico medico,
			Gato gato) {
		
		return new AtendimentoGato(dto.getCodigoCliente(), dto.getDadosAnimal(), dto.getDiagnostico(), dto.getComentarios(),
				dto.getLocaldatatime(), medico, cliente, gato);
				
	}
	
	public static ConsultaAtendimentoGatoDTO fromEntity(AtendimentoGato atendimento) {
		return new ConsultaAtendimentoGatoDTO(atendimento.getId(), atendimento.getDadosAnimal(),
				atendimento.getDiagnostico(), atendimento.getComentarios(), atendimento.getLocaldatatime(),
				ClienteMapper.fromEntity(atendimento.getCliente()),
				GatoMapper.fromEntity(atendimento.getGato()),
				MedicoMapper.fromEntity(atendimento.getMedico()));
	}
	
}
