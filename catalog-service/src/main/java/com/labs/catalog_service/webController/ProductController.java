package com.labs.catalog_service.webController;

import com.labs.catalog_service.domain.PageResult;
import com.labs.catalog_service.domain.Product;
import com.labs.catalog_service.domain.ProductNotFoundException;
import com.labs.catalog_service.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/product")
class ProductController {

    private final ProductService productService;

    ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
     PageResult<Product> getProducts(@RequestParam(name = "page" , defaultValue = "1") int pageNo){
        return productService.getAllProduct(pageNo);
    }

    @GetMapping("/code/{code}")
    ResponseEntity<Product> getProductByCodeName(@PathVariable String code){
        return productService.getProductByCode(code)
                .map(ResponseEntity::ok).orElseThrow(()->ProductNotFoundException.forCode(code));
    }
}

