package com.thiagoRaimundo.controleEstoque.repository;

import com.thiagoRaimundo.controleEstoque.models.StockMovement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockMovimentRepository extends JpaRepository<StockMovement,Long> {
}
