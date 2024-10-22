package com.asalazargale;
import org.junit.jupiter.api.Test;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.post;


public class SimpleTest {
    String url = "https://demoqa.com";
    @Test
    public void sampleTest(){
        String endpoint = "/Account/v1/User";
        String bearer = "";
        String requestBody = """
        {
            "userName": "aa12sdasdasdasdasda",
            "password": "AGsaasd1asd$asdasd"
        }
        """;


        Response response = given()
                .contentType(ContentType.JSON)
//                .auth().oauth2(bearer)
                .body(requestBody)
                .when()
                .post(url + endpoint)
                .then()
                .statusCode(201)
                .extract().response();
        post(url).then().statusCode(201);
        response.body().prettyPrint();
    }
}
