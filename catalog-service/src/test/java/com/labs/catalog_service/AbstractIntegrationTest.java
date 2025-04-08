package com.labs.catalog_service;


import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.context.annotation.Import;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@Import(TestContainersConfiguration.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
public class AbstractIntegrationTest {


    private static final Logger log = LoggerFactory.getLogger(AbstractIntegrationTest.class);
    @LocalServerPort
    int port;

    @BeforeEach
    void setUp(){
        RestAssured.port=port;
        log.info("test engine started at {}", RestAssured.baseURI);
        log.info("test engine started at {}", RestAssured.port);
    }
}
