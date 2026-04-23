package com.thiagoRaimundo.controleEstoque.repository;

import com.thiagoRaimundo.controleEstoque.models.Product;
import com.thiagoRaimundo.controleEstoque.models.Stock;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StockRepository extends JpaRepository<Stock,Long> {
    Optional<Stock> findByProduct_Id(Long id);
}
