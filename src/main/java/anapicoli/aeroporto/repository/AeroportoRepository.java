package anapicoli.aeroporto.repository;

import anapicoli.aeroporto.model.Aeroporto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AeroportoRepository extends JpaRepository<Aeroporto, Long> {
}
