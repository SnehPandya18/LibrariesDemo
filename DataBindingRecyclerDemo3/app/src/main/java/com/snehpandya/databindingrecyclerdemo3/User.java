package com.snehpandya.databindingrecyclerdemo3;

/**
 * Created by sneh.pandya on 17/07/17.
 */

public class User {
    private String name, image;
    private int age;

    public User(String name, String image, int age) {
        this.name = name;
        this.image = image;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
