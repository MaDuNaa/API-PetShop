package gft.dto.cachorro;


import gft.dto.cliente.ClienteMapper;
import gft.entities.Cachorro;
import gft.entities.Cliente;


public class CachorroMapper {

	public static Cachorro fromDTO(RegistroCachorroDTO dto, Cliente cliente) {
		return new Cachorro(dto.getCodigoCliente(), dto.getNome(), dto.getEspecie(), dto.getRaca(), 
				dto.getVacina(), cliente);
	}
	
	
	public static ConsultaCachorroDTO fromEntity(Cachorro cachorro) {
		return new ConsultaCachorroDTO(cachorro.getId(), cachorro.getNome(), cachorro.getEspecie(),
				cachorro.getRaca(), cachorro.getVacina(), ClienteMapper.fromEntity(cachorro.getCliente()));
	}
	
}

