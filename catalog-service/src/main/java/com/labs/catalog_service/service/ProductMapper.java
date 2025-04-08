package com.labs.catalog_service.service;

import com.labs.catalog_service.domain.Product;
import com.labs.catalog_service.domain.ProductEntity;

public class ProductMapper {
    static Product toProduct(ProductEntity productEntity){
        return new Product(productEntity.getCode(),
                productEntity.getName(),
                productEntity.getDescription(),
                productEntity.getPrice().doubleValue(),
                productEntity.getImageUrl());
    }
}
