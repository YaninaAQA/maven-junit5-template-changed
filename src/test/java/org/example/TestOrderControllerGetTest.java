package org.example;

import com.google.gson.Gson;
import dto.ApiResponseForGetOrderId;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertAll;

public class TestOrderControllerGetTest {

    @Test
    public void successGettingOrder() {

        Response response = given().
                log().
                all().
                when().
                get("http://51.250.6.164:8080/test-orders/10").
                then().
                log().
                all().
                //statusCode(HttpStatus.SC_OK);
                        extract().response();

        // deserialization
        ApiResponseForGetOrderId result = new Gson().fromJson(response.asString(), ApiResponseForGetOrderId.class);

        // Assert
        assertAll(
                "Grouped Assertions of User",

                () -> Assertions.assertEquals(HttpStatus.SC_OK, response.getStatusCode(), "1rd Assert"),
                () -> Assertions.assertEquals("OPEN", result.getStatus(), "2nd Assert"),
                () -> Assertions.assertEquals(10, result.getId(), "3rd Assert")

        );
    }

    @Test
    public void unsuccessfulGettingOrder() {

        given()
                .log()
                .all()
                .when()
                .get("http://51.250.6.164:8080/test-orders/15")
                .then()
                .log()
                .all()
                .statusCode(HttpStatus.SC_BAD_REQUEST);
        // For negative GET cases, do not accept serialisation and deserialization
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 5, 9, 10})
    public void successGettingOrderAndCheckResponseCode(int orderId) {


        Response response = given().
                log().
                all().
                when().
                get("http://51.250.6.164:8080/test-orders/{orderId}", orderId).
                then().
                log().
                all().
                //.statusCode(HttpStatus.SC_OK);
                        extract().response();

        // deserialization
        ApiResponseForGetOrderId result = new Gson().fromJson(response.asString(), ApiResponseForGetOrderId.class);

        // Assert
        assertAll(
                "Grouped Assertions of User",
                () -> Assertions.assertEquals("application/json", response.contentType(), "1nd Assert"),
                () -> Assertions.assertEquals(HttpStatus.SC_OK, response.getStatusCode(), "2rd Assert"),
                () -> Assertions.assertEquals("OPEN", result.getStatus(), "3rd Assert")
        );


    }

    @ParameterizedTest
    @ValueSource(ints = {0, 11, -5, 25, 1000})
    public void unsuccessfulGettingOrderAndCheckResponseCode(int orderId) {


        given()
                .log()
                .all()
                .when()
                .get("http://51.250.6.164:8080/test-orders/{orderId}", orderId)
                .then()
                .log()
                .all()
                .statusCode(HttpStatus.SC_BAD_REQUEST);
    }
// For negative GET cases, do not accept serialisation and deserialization

}
