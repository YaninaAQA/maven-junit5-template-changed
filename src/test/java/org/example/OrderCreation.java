package org.example;

import Helper.Authorization;
import com.google.gson.Gson;
import dto.LoggingDto;
import dto.TestOrderDto;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class OrderCreation {
    static String token;
    @BeforeAll
    public static void setUp(){
        token = Authorization.getToken();
        System.out.println(token);
        System.out.println("This is token Before All" + token);
    }


    @Test
    public void createOrder() {
        // dto creation with constructor
        TestOrderDto orderDto = new TestOrderDto("New order", "123456", "no comment");


        // serialization
        String orderDtoAsJson = new Gson().toJson(orderDto);


        given().
                log().
                all().
                header("Content-Type", "application/json").
                // header("Authorization", "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ5YW5pbmEiLCJleHAiOjE3MDAwMDE0NjUsImlhdCI6MTY5OTk4MzQ2NX0.JczYnkjo79qhYsRU_eW1MEDl50U8RDqqWC8U5V1uVL4mUmXPY7KiBFMxR79Rw8raLV3QqRtwwyZr4tOzkz9NTg").
                        header("Authorization", "Bearer " + token).

                body(orderDtoAsJson).
                post("http://51.250.6.164:8080/orders").
                then().
                log().
                all().
                assertThat().
                statusCode(HttpStatus.SC_OK);


    }

    @Test
    public void getOrderById(){
        given().
                log().
                all().
                header("Content-Type", "application/json").
                //header("Authorization", "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ5YW5pbmEiLCJleHAiOjE3MDAwMDE0NjUsImlhdCI6MTY5OTk4MzQ2NX0.JczYnkjo79qhYsRU_eW1MEDl50U8RDqqWC8U5V1uVL4mUmXPY7KiBFMxR79Rw8raLV3QqRtwwyZr4tOzkz9NTg").
                header("Authorization", "Bearer " + token).
                //body(orderDtoAsJson).
                get("http://51.250.6.164:8080/orders/4827").
                then().
                log().
                all().
                assertThat().
                statusCode(HttpStatus.SC_OK);
    }
}
