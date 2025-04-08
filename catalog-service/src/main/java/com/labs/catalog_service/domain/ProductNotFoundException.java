package com.labs.catalog_service.domain;

public class ProductNotFoundException extends  RuntimeException{
    public  ProductNotFoundException(String message){
        super(message);
    }

    public static ProductNotFoundException forCode(String code){
        return new ProductNotFoundException("product not found with code " + code);
    }
}
