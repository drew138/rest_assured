package com.asalazargale.tests;
import com.asalazargale.restapi.UserApi;
import com.asalazargale.restapi.UserProvider;
import com.asalazargale.util.UserFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.post;


public class SimpleTest {
    private UserProvider userApi;

    @BeforeEach
    public void setUp(){
        this.userApi = new UserApi();
    }

    @Test
    @DisplayName("Create user successfully")
    public void createUserTest(){
        // Arrange
        String userName = UserFactory.generateRandomUserName();
        String password = UserFactory.generateRandomPassword();

        // Act
        Response response = userApi.createUser(userName, password);

        // Assert
        response.then().statusCode(201);
    }
}
