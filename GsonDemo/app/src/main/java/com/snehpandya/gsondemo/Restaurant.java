package com.snehpandya.gsondemo;

/**
 * Created by sneh.pandya on 14/06/17.
 */

public class Restaurant {
    String name;

    Owner owner;
    Cook mCook;
    Waiter mWaiter;
}

class Owner {
    String name;

    UserAddress address;
}

class Cook {
    Cook name;
    Cook age;
    Cook salary;
}

class Waiter {
    Waiter name;
    Waiter age;
    Waiter salary;
}
