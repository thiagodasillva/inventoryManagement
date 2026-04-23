package com.thiagoRaimundo.controleEstoque.repository;

import com.thiagoRaimundo.controleEstoque.models.Sale;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale,Long> {
}
