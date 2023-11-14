package org.example;

import com.google.gson.Gson;
import dto.DeckDto;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;
import static org.example.CardValueMapper.getCardValue;

public class BlackJack {
    public static void main(String[] args) {
        Response response = given().
                log().
                all().
                post("https://deckofcardsapi.com/api/deck/new/").
                then().
                log().
                all().
                //statusCode(HttpStatus.SC_OK);
                        extract().response();


        // Deserialization
        DeckDto result = new Gson().fromJson(response.asString(), DeckDto.class);

        String deckId = result.getDeck_id();

        String urlForShuffle = "https://deckofcardsapi.com/api/deck/" + deckId + "/shuffle/";

        given().
                log().
                all().
                post(urlForShuffle).
                then().
                log().
                all().
                statusCode(HttpStatus.SC_OK);

        String urlForCards = "https://deckofcardsapi.com/api/deck/" + deckId + "/draw/?count=6";

        Response responseForCards = given().
                log().
                all().
                get(urlForCards).
                then().
                log().
                all().
                assertThat().
                extract().response();

        // Parse the JSON response using JsonPath
        JsonPath jsonPath = JsonPath.from(responseForCards.asString());

        // Extract the ArrayList of "value"
        ArrayList<String> valuesList = jsonPath.get("cards.value");
        System.out.println(valuesList);

        // Convert ArrayList to String[]
        String[] values = valuesList.toArray(new String[0]);


        System.out.println("Value:" + getCardValue("JACK"));


    }
}
