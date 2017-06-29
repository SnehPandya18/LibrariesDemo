package com.snehpandya.gsondemo;

/**
 * Created by sneh.pandya on 14/06/17.
 */

public class UserNested {
    String name;
    String email;
    boolean isDeveloper;
    int age;

    UserAddress userAddress;

    public UserNested(String name, String email, boolean isDeveloper, int age, UserAddress userAddress) {
        this.name = name;
        this.email = email;
        this.isDeveloper = isDeveloper;
        this.age = age;
        this.userAddress = userAddress;
    }
}