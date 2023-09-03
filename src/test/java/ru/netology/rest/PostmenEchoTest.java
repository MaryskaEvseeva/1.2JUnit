package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PostmenEchoTest {
    @Test
    void ShouldReturnSentData(){

        given()
                .baseUri("https://postman-echo.com")
                .body("some data")

                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data", egualTo("some data"));
           }


    }



