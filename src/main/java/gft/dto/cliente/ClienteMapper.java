package gft.dto.cliente;

import gft.dto.endereco.EnderecoMapper;
import gft.entities.Cliente;

public class ClienteMapper {
	

	public static Cliente fromDTO(RegistroClienteDTO dto) {
		return new Cliente(dto.getClienteId(), dto.getNome(), dto.getTelefone(), dto.getEmail(),
				EnderecoMapper.fromDTO(dto.getEndereco()), null);
	}
	
	
	public static ConsultaClienteDTO fromEntity(Cliente cliente) {
		return new ConsultaClienteDTO(cliente.getId(), cliente.getNome(), cliente.getTelefone(),
				cliente.getEmail(), EnderecoMapper.fromEntity(cliente.getEndereco()));
	}

}
