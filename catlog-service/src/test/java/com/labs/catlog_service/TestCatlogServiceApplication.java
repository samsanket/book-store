package com.labs.catlog_service;

import org.springframework.boot.SpringApplication;

public class TestCatlogServiceApplication {


	public static void main(String[] args) {
		SpringApplication.from(CatlogServiceApplication::main)
				.with(TestcontainersConfiguration.class)
				.run(args);
	}

}
