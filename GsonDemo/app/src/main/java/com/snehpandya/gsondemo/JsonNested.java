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

//https://futurestud.io/tutorials/gson-getting-started-with-java-json-serialization-deserialization

public class JsonNested extends AppCompatActivity {

    TextView mTextView;
    TextView mTextView2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nested);

        //Nested data
        UserAddress userAddress = new UserAddress("Main Street", "42A", "Madgeburg", "Germany");
        UserNested userNested = new UserNested("Sneh", "xyz", true, 21, userAddress);

        //Gson object
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        //Serialization using Gson
        String user = gson.toJson(userNested);

        mTextView = (TextView) findViewById(R.id.textviewjn);
        mTextView.setText(user);

        //Nested JSON
        String restaurantJson = "{ 'name':'Future Studio Steak House', 'owner':{ 'name':'Christian', 'address':{ 'city':'Magdeburg', 'country':'Germany', 'houseNumber':'42', 'street':'Main Street'}}," +
                "'cook':{ 'age':18, 'name': 'Marcus', 'salary': 1500 }, 'waiter':{ 'age':18, 'name': 'Norman', 'salary': 1000}}";

        //Deserialization using Gson
        Restaurant restaurant = gson.fromJson(restaurantJson, Restaurant.class);
        String name = restaurant.name;
        String oName = restaurant.owner.name;

        String output = "Name: " + name + "\nOwner: " + oName;
        mTextView2 = (TextView) findViewById(R.id.textviewjn2);
        mTextView2.setText(output);
    }
}
