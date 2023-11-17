package org.example;

import Helper.SetupFunctions;
import com.google.gson.Gson;
import dto.LoggingDto;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class LoggingFeatureTest {
    static SetupFunctions setupFunctions;

    @BeforeAll
    public static void setup() {
        setupFunctions = new SetupFunctions();
        System.out.println("Username:" + setupFunctions.getUsername());
        System.out.println("Password:" + setupFunctions.getPassword());
    }


    @Test
    public void SuccessfulLoginTest() {
        // dto creation with constructor
        LoggingDto loggingDto = new LoggingDto(setupFunctions.getUsername(), setupFunctions.getPassword());


        // serialization
        String testLoggingDtoAsJson = new Gson().toJson(loggingDto);


        Response response = given().
                log().
                all().
                header("Content-Type", "application/json").
                // header("Bearer Token", "TOKEN_VALUE").
                        body(testLoggingDtoAsJson).
                post("http://51.250.6.164:8080/login/student").
                then().
                log().
                all().
                extract().
                response();
        //and.
        //assertThat().
        //statusCode(HttpStatus.SC_OK);
        Assertions.assertEquals("", response.asString());
        Assertions.assertEquals(401, response.getStatusCode());


    }

    @Test
    public void unsuccessfulLoginTest() {
        // dto creation with constructor
        LoggingDto loggingDto = new LoggingDto(setupFunctions.getUsername(), "123");


        // serialization
        String testLoggingDtoAsJson = new Gson().toJson(loggingDto);


        given().
                log().
                all().
                header("Content-Type", "application/json").
                // header("Bearer Token", "TOKEN_VALUE").
                        body(testLoggingDtoAsJson).
                post("http://51.250.6.164:8080/login/student").
                then().
                log().
                all().
                assertThat().
                statusCode(HttpStatus.SC_UNAUTHORIZED);


    }


}
