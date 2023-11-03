package org.example;

import com.google.gson.Gson;
import dto.TestCreateUserDto;
import dto.TestOrderDto;
import dto.TestOrderDtoForNegativeTests;
import dto.TestOrderDtoForNegativeTests2;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

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

        given().
                log().
                all().
                header("Content-Type", "application/json").
                // header("Bearer Token", "TOKEN_VALUE").
                        body(testOrderDtoAsJsonForTests).
                post("http://51.250.6.164:8080/test-orders").
                then().
                log().
                all().
                statusCode(HttpStatus.SC_OK);


    }

    @Test
    public void CreatingOrderWithoutIdField() {
        // Arrange
        TestOrderDtoForNegativeTests testOrderDtoForNegativeTests = new TestOrderDtoForNegativeTests(5, "Snikers", "1234568", "comment1");

        // serialization
        String testOrderDtoAsJsonForTests = new Gson().toJson(testOrderDtoForNegativeTests);

        given().
                log().
                all().
                header("Content-Type", "application/json").
                // header("Bearer Token", "TOKEN_VALUE").
                        body(testOrderDtoAsJsonForTests).
                post("http://51.250.6.164:8080/test-orders").
                then().
                log().
                all().
                statusCode(HttpStatus.SC_OK);


    }

    @Test
    public void CreatingOrderWithIncorrectCourierIdValueStringInsteadOfInt() {
        // Arrange
        TestOrderDtoForNegativeTests2 testOrderDtoForNegativeTests2 = new TestOrderDtoForNegativeTests2("Six", "Mars", "123456", "comment3", 5);

        // serialization
        String testOrderDtoAsJsonForTests = new Gson().toJson(testOrderDtoForNegativeTests2);

        given().
                log().
                all().
                header("Content-Type", "application/json").
                // header("Bearer Token", "TOKEN_VALUE").
                        body(testOrderDtoAsJsonForTests).
                post("http://51.250.6.164:8080/test-orders").
                then().
                log().
                all().
                statusCode(HttpStatus.SC_BAD_REQUEST);

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
        given().
                log().
                all().
                header("Content-Type", "application/json").
                // header("Bearer Token", "TOKEN_VALUE").
                        body(testCreateUserDtoAsJsonForTests).
                post("https://petstore.swagger.io/v2/user").
                then().
                log().
                all().
                statusCode(HttpStatus.SC_OK);


    }


}
