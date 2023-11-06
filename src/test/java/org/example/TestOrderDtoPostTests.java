package org.example;

import com.google.gson.Gson;
import dto.*;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOrderDtoPostTests {


    @Test
    public void CreatingOrderWithAllFieldsWithPositiveData() {
        // Arrange
        TestOrderDto testOrderDtoSetterForTests = new TestOrderDto();
        testOrderDtoSetterForTests.setCustomerName("Nestle");
        testOrderDtoSetterForTests.setCustomerPhone("505253");
        testOrderDtoSetterForTests.setComment("without comment");

        // serialization
        String testOrderDtoAsJsonForTests = new Gson().toJson(testOrderDtoSetterForTests);

        Response response = given().
                log().
                all().
                header("Content-Type", "application/json").
                // header("Bearer Token", "TOKEN_VALUE").
                        body(testOrderDtoAsJsonForTests).
                post("http://51.250.6.164:8080/test-orders").
                then().
                log().
                all().
                // statusCode(HttpStatus.SC_OK).
                        extract().response();

        // deserialization
        TestOrderDto result = new Gson().fromJson(response.asString(), TestOrderDto.class);

        // Assert
        assertAll(
                "Grouped Assertions of User",
                () -> assertEquals("OPEN", result.getStatus(), "1st Assert"),
                () -> Assertions.assertEquals(1, result.getCourierId(), "2nd Assert"),
                () -> Assertions.assertEquals(HttpStatus.SC_OK, response.getStatusCode(), "3rd Assert")
        );


    }

    @Test
    public void CreatingOrderWithoutIdField() {
        // Arrange
        TestOrderDtoForNegativeTests testOrderDtoForNegativeTests = new TestOrderDtoForNegativeTests(5, "Snikers", "1234568", "comment1");
        testOrderDtoForNegativeTests.setCustomerPhone("1234");
        testOrderDtoForNegativeTests.setComment("comment3");

        // serialization
        String testOrderDtoAsJsonForTests = new Gson().toJson(testOrderDtoForNegativeTests);

        Response response = given().
                log().
                all().
                header("Content-Type", "application/json").
                // header("Bearer Token", "TOKEN_VALUE").
                        body(testOrderDtoAsJsonForTests).
                post("http://51.250.6.164:8080/test-orders").
                then().
                log().
                all().
                // statusCode(HttpStatus.SC_OK);
                        extract().response();

        // deserialization
        TestOrderDtoForNegativeTests result = new Gson().fromJson(response.asString(), TestOrderDtoForNegativeTests.class);

        // Assert
        assertAll(
                "Grouped Assertions of User",
                () -> Assertions.assertEquals("Snikers", result.getCustomerName(), "1nd Assert"),
                () -> Assertions.assertEquals(HttpStatus.SC_OK, response.getStatusCode(), "2rd Assert"),
                () -> Assertions.assertEquals("comment3", result.getComment(), "3rd Assert")
        );


    }

    @Test
    public void CreatingOrderWithIncorrectCourierIdValueStringInsteadOfInt() {
        // Arrange
        TestOrderDtoForNegativeTests2 testOrderDtoForNegativeTests2 = new TestOrderDtoForNegativeTests2("Six", "Mars", "123456", "comment3", 5);

        // serialization
        String testOrderDtoAsJsonForTests = new Gson().toJson(testOrderDtoForNegativeTests2);

        Response response = given().
                log().
                all().
                header("Content-Type", "application/json").
                // header("Bearer Token", "TOKEN_VALUE").
                        body(testOrderDtoAsJsonForTests).
                post("http://51.250.6.164:8080/test-orders").
                then().
                log().
                all().
                //statusCode(HttpStatus.SC_BAD_REQUEST);
                        extract().response();

        // Deserialization in this case doesn't apply because in response body just "Incorrect query" error without json body


        // Assert
        Assertions.assertEquals(HttpStatus.SC_BAD_REQUEST, response.getStatusCode());


    }

    @Test
    public void CreatingUserPositiveTest() {
        // Arrange
        TestCreateUserDto testCreateUserDto = new TestCreateUserDto();
        testCreateUserDto.setId(2);
        testCreateUserDto.setUsername("King");
        testCreateUserDto.setFirstName("Ivan");
        testCreateUserDto.setLastName("Ivanov");
        testCreateUserDto.setEmail("inanovking@gmail.com");
        testCreateUserDto.setPassword("12345");
        testCreateUserDto.setPhone("123456789654");
        testCreateUserDto.setUserStatus(2);

        // Serialization
        String testCreateUserDtoAsJsonForTests = new Gson().toJson(testCreateUserDto);


        Response response = given().
                log().
                all().
                header("Content-Type", "application/json").
                // header("Bearer Token", "TOKEN_VALUE").
                        body(testCreateUserDtoAsJsonForTests).
                post("https://petstore.swagger.io/v2/user").
                then().
                log().
                all().
                // statusCode(HttpStatus.SC_OK);
                        extract().response();

        // Deserialization
        ApiResponseForCreateUser result = new Gson().fromJson(response.asString(), ApiResponseForCreateUser.class);

        // Assert
        assertAll(
                "Grouped Assertions of User",
                () -> Assertions.assertEquals("application/json", response.contentType(), "1nd Assert"),
                () -> Assertions.assertEquals(HttpStatus.SC_OK, response.getStatusCode(), "2rd Assert"),
                () -> Assertions.assertEquals("unknown", result.getType(), "3rd Assert"),
                () -> Assertions.assertEquals(200, result.getCode(), "4rd Assert")


        );


    }


}
