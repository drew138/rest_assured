package com.asalazargale;
import org.junit.jupiter.api.Test;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;


public class SimpleTest {
    String url = "https:/simple-books-api.glitch.me";
    @Test
    public void sampleTest(){
        String endpoint = "/orders";
        String bearer = "";
        String requestBody = "";

        Response response = given()
                .contentType(ContentType.JSON)
                .auth().oauth2(bearer)
                .body(requestBody)
                .when()
                .post(url + endpoint)
                .then()
                .statusCode(201)
                .extract().response();
    }
}
