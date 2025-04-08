package com.labs.catalog_service.domain;

public record Product(String code ,
                      String name,
                      String description,
                      Double price,
                      String imageUrl
) {
}
