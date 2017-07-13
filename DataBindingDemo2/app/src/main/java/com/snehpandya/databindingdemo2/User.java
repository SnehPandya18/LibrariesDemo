package com.snehpandya.databindingdemo2;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

/**
 * Created by sneh.pandya on 13/07/17.
 */

public class User extends BaseObservable {

    private String name;
    private String surname;
    private String age;
    private int image;

    public User(String name, String surname, String age, int image) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.image = image;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
        notifyPropertyChanged(BR.surname);
    }

    @Bindable
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }

    @Bindable
    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
        notifyPropertyChanged(BR.image);
    }

    @BindingAdapter("android:src")
    public static void setImageResource(ImageView imageView, int resrouce) {
        imageView.setImageResource(resrouce);
    }
}
