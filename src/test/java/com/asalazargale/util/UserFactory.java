package com.asalazargale.util;

/**
 * This class provides utility methods to generate random usernames and passwords.
 */
public class UserFactory {
    public static String generateRandomUserName(){
        return "user" + System.currentTimeMillis();
    }

    public static String generateRandomPassword(){
        return "Password@" + System.currentTimeMillis();
    }
}
