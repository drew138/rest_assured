package com.asalazargale.restapi;

import io.restassured.response.Response;

public interface UserProvider {
    Response createUser(String userName, String password);
}
