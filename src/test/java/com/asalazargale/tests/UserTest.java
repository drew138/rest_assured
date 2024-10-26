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
    @DisplayName("Test for user create & delete workflow")
    public void userCreationWorkflowTest() {
        // Arrange
        String userName = UserFactory.generateRandomUserName();
        String password = UserFactory.generateRandomPassword();

        // Act
        Response response = userApi.createUserAccount(userName, password);
        response.then().statusCode(201).onFailMessage("User account was not created successfully.");

        loginPage.open();
        loginPage.enterCredentials(userName, password);
        loginPage.clickLogin();

        profilePage.deleteUserAccount();
        profilePage.confirmDeleteUserAccount();

        loginPage.enterCredentials(userName, password);
        loginPage.clickLogin();

        // Assert
        assertThat(loginPage.getOutputMessage()).isEqualTo("Invalid username or password!");
    }
}
