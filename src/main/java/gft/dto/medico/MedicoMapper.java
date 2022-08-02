package gft.dto.medico;

import gft.dto.endereco.EnderecoMapper;
import gft.entities.Medico;

public class MedicoMapper {

	
	public static Medico fromDTO(RegistroMedicoDTO dto) {
		return new Medico(null, dto.getNome(), dto.getTelefone(), dto.getEmail(),
				EnderecoMapper.fromDTO(dto.getEndereco()));
	}
	
	public static ConsultaMedicoDTO fromEntity(Medico medico) {
		return new ConsultaMedicoDTO(medico.getId(), medico.getNome(), medico.getTelefone(),
				medico.getEmail(), EnderecoMapper.fromEntity(medico.getEndereco()));
	}
}
