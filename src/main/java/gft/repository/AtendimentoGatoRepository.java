package gft.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import gft.entities.AtendimentoGato;

public interface AtendimentoGatoRepository extends JpaRepository<AtendimentoGato, Long> {
	
	Page<AtendimentoGato> findAll(Pageable pageable);

}
