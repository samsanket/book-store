package com.labs.catalog_service.webController;

//import com.labs.catalog_service.AbstractIntegrationTest;
//import io.restassured.http.ContentType;
//import org.junit.jupiter.api.Test;
//import org.springframework.test.context.jdbc.Sql;
//
//
//import static io.restassured.RestAssured.given;
//import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
//import static org.hamcrest.core.Is.is;
//
//@Sql("/one-data.sql")
//class ProductControllerTest extends AbstractIntegrationTest {
//
//    @Test
//    void getProducts() {
//        given()
//                .contentType(ContentType.JSON)
//                .when()
//                .get("/api/v1/product/").
//                then()
//                .statusCode(200)
//                .body("data",hasSize(10))
//                .body("pageNumber",is(1))
//                .body("isFirst",is(true));
//
//
//    }
//}