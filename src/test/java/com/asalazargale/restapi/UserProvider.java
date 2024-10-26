package com.asalazargale.restapi;

import io.restassured.response.Response;

public interface UserProvider {
    Response createUserAccount(String userName, String password);
}
