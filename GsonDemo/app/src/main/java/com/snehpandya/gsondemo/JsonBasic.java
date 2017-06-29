package com.snehpandya.gsondemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by sneh.pandya on 14/06/17.
 */

public class JsonBasic extends AppCompatActivity {

    TextView mTextView;
    TextView mTextView2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json);

        //Simple data
        UserSimple userSimple = new UserSimple("Sneh", "xyz@gmail.com", 21, true);

        //Gson object
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        //Serialization using Gson
        String sJson = gson.toJson(userSimple);

        mTextView = (TextView) findViewById(R.id.textview);
        mTextView.setText(sJson);

        //Simple JSON
        String dJson = "{'age':21,'email':'xyz@gmail.com','isDev':true,'name':'Sneh'}";

        //Deserialization using Gson
        UserSimple json = gson.fromJson(dJson, UserSimple.class);
        String name = json.name;
        String email = json.email;
        int age = json.age;
        boolean isDev = json.isDev;

        String output = "Name: " + name + "\nEmail: " + email + "\nAge: " + age + "\nDeveloper: " + isDev;
        mTextView2 = (TextView) findViewById(R.id.textview2);
        mTextView2.setText(output);

    }
}
