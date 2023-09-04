package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmenEchoTest {
    @Test
    void ShouldReturnSentData(){

        given()
                .baseUri("https://postman-echo.com")
                .body("some dat")

                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("some data"));
           }


    }






