package gft.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gft.entities.Cachorro;

@Repository
public interface CachorroRepository extends JpaRepository<Cachorro, Long> {

	Page<Cachorro> findAll(Pageable pageable);
}
