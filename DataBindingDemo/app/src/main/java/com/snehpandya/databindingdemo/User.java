package com.snehpandya.databindingdemo;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

/**
 * Created by Sneh on 06-06-2017.
 */

public class User {
    private String name, surname;
    private int image;

    public User(String name, String surname, int image) {
        this.name = name;
        this.surname = surname;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getImage() {
        return image;
    }

    @BindingAdapter("android:src")
    public static void setImageResource(ImageView imageView, int resource) {
        imageView.setImageResource(resource);
    }
}
