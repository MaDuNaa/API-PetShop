package gft.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gft.entities.Gato;

@Repository
public interface GatoRepository extends JpaRepository<Gato, Long>{
	
	Page<Gato> findAll(Pageable pageable);

}
