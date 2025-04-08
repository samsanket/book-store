package com.labs.catalog_service.repo;

import com.labs.catalog_service.domain.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepo extends JpaRepository<ProductEntity,Long> {
    Optional<ProductEntity> findByCode(String codeName);
}
