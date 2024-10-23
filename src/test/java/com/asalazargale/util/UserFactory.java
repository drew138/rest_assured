package com.asalazargale.util;

public class UserFactory {
    public static String generateRandomUserName(){
        return "user" + System.currentTimeMillis();
    }

    public static String generateRandomPassword(){
        return "Password@" + System.currentTimeMillis();
    }
}
