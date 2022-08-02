package gft.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gft.entities.RacaGato;

@Repository
public interface RacaGatoRepository extends JpaRepository<RacaGato, String>{
	
	Optional<RacaGato> findByNome(String nome);
	

}
