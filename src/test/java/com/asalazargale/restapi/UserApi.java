package com.asalazargale.restapi;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UserApi implements UserProvider {
    @Override
    public Response createUserAccount(String userName, String password) {
        String requestBody = """
        {
            "userName": "%s",
            "password": "%s"
        }
        """.formatted(userName, password);

        return given()
                .baseUri("https://demoqa.com")
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("/Account/v1/User");
    }
}
