package com.thiagoRaimundo.controleEstoque.repository;

import com.thiagoRaimundo.controleEstoque.models.Lote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LoteRepository extends JpaRepository<Lote,Long> {
    List<Lote> findByProductIdOrderByDataValidadeAsc(Long productId);

    Optional<Lote> findByProdut(Long id);
}
