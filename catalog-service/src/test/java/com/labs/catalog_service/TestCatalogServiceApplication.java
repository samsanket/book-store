package com.labs.catalog_service;

import org.springframework.boot.SpringApplication;

public class TestCatalogServiceApplication {


	public static void main(String[] args) {
		SpringApplication.from(CatalogServiceApplication::main)
				.with(TestContainersConfiguration.class)
				.run(args);
	}

}
