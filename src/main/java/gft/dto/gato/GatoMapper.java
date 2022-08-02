package gft.dto.gato;

import gft.dto.cliente.ClienteMapper;
import gft.entities.Cliente;
import gft.entities.Gato;

public class GatoMapper {
	
	public static Gato fromDTO(RegistroGatoDTO dto, Cliente cliente) {
		
		return new Gato(null, dto.getNome(), dto.getRaca(), cliente);
	}
	
	public static ConsultaGatoDTO fromEntity(Gato gato) {
		return new ConsultaGatoDTO(gato.getId(), gato.getNome(), gato.getRaca(), 
				ClienteMapper.fromEntity(gato.getCliente()));
	}

}
