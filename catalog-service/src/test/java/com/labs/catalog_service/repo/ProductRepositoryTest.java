package com.labs.catalog_service.repo;


//import static org.assertj.core.api.Assertions.assertThat;
//
//import java.util.List;
//
//import com.labs.catalog_service.domain.ProductEntity;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.test.context.jdbc.Sql;
//
//@DataJpaTest(
//        properties = {
//                "spring.test.database.replace=none",
//                "spring.datasource.url=jdbc:tc:postgresql:16-alpine:///db",
//        })
//@Sql("/one-data.sql")
//class ProductRepositoryTest {
//
//    @Autowired
//    private ProductRepo productRepository;
//
//    // You don't need to test the methods provided by Spring Data JPA.
//    // This test is to demonstrate how to write tests for the repository layer.
//    @Test
//    void shouldGetAllProducts() {
//        List<ProductEntity> products = productRepository.findAll();
//        assertThat(products).hasSize(15);
//    }
//}