package gft.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gft.entities.Raca;

@Repository
public interface RacaRepository  extends JpaRepository<Raca, Long>{
	
	Optional<Raca> findByNome(String nome);
	

}
