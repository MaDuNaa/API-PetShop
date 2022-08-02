package gft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gft.entities.Historico;

@Repository
public interface HistoricoRepository extends JpaRepository<Historico, Long>{

}
