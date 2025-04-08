package com.labs.catalog_service.service;

import com.labs.catalog_service.ApplicationProperties;
import com.labs.catalog_service.domain.PageResult;
import com.labs.catalog_service.domain.Product;
import com.labs.catalog_service.repo.ProductRepo;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@Transactional
public class ProductService {

    private  final ProductRepo productRepo;
    private  final ApplicationProperties applicationProperties;


    public ProductService(ProductRepo productRepo,
                          ApplicationProperties applicationProperties) {
        this.productRepo = productRepo;
        this.applicationProperties=applicationProperties;
    }

    public PageResult<Product> getAllProduct(int pageNumber){
        pageNumber=pageNumber<=1 ?0 :pageNumber-1;
        Sort sort =Sort.by("name").ascending();
        Pageable pageable=PageRequest.of(pageNumber,applicationProperties.pageSize(),sort);
        Page<Product> productPage=
                productRepo.findAll(pageable)
                        .map(ProductMapper::toProduct);
        return new PageResult<>(
                productPage.getContent(),
                productPage.getTotalElements(),
                productPage.getNumber()+1,
                productPage.getTotalPages(),
                productPage.isFirst(),
                productPage.isLast(),
                productPage.hasNext(),
                productPage.hasPrevious()
        );

    }

    public Optional<Product> getProductByCode(String codeName){
        return productRepo.findByCode(codeName).map(ProductMapper::toProduct);
    }
}

