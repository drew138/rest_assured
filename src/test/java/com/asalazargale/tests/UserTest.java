package com.asalazargale.tests;

import static org.assertj.core.api.Assertions.assertThat;

import com.asalazargale.pages.LoginPage;
import com.asalazargale.pages.ProfilePage;
import com.asalazargale.restapi.UserApi;
import com.asalazargale.restapi.UserProvider;
import com.asalazargale.util.UserFactory;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class UserTest extends BaseTest {
    private UserProvider userApi;
    private LoginPage loginPage;
    private ProfilePage profilePage;

    @BeforeEach
    public void initializePages() {
        this.userApi = new UserApi();
        this.loginPage = new LoginPage(driver);
        this.profilePage = new ProfilePage(driver);
    }

    @Test
    @DisplayName("Integration test for user CRUD operations")
    public void userCrudTest() {
        // Arrange
        String userName = UserFactory.generateRandomUserName();
        String password = UserFactory.generateRandomPassword();
        Response response = userApi.createUser(userName, password);
        response.then().statusCode(201);

        loginPage.open();
        loginPage.enterCredentials(userName, password);
        loginPage.clickLogin();

        profilePage.deleteAccount();
        profilePage.confirmDeleteAccount();

//        loginPage.enterCredentials(userName, password);
//        loginPage.clickLogin();

        //assertThat(loginPage.getErrorMessage()).isEqualTo("Username and password do not match any user in this service");

    }
}
