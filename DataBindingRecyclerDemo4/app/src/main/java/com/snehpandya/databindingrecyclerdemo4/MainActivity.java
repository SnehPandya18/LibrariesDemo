package com.snehpandya.databindingrecyclerdemo4;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.snehpandya.databindingrecyclerdemo4.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        binding.contactList.setLayoutManager(layoutManager);

        List<Article> articles = new ArrayList<>();

        articles.add(new Article("An outbreak of parasitic bees",
                "This summer, we are facing a very serious issue. And it is nothing else but an outbreak of parasitic bees.",
                true, "android.resource://com.example.databindingblog/drawable/bee", 45));
        articles.add(new Article("Brno - the city of 2016",
                "It has been announced by the committee of know-it-all that Brno has been elected city of year 2016.",
                false, "android.resource://com.example.databindingblog/drawable/brno", 0));
        articles.add(new Article("Restaurants in trouble",
                "Restaurants offering daily menus could soon face a serious trouble. The government has just...",
                true, "android.resource://com.example.databindingblog/drawable/food", 1));
        articles.add(new Article("Survey amongst drivers reveals shocking facts",
                "A survey taken by 1100 drivers commuting every day to work shows that the drivers mostly drive their car alone.",
                false, "android.resource://com.example.databindingblog/drawable/driver", 33));
        articles.add(new Article("Rugby for everyone?",
                "Until lately, rugby has been considered a sport played only by men. What are the consequences...",
                false, "android.resource://com.example.databindingblog/drawable/rugby", 11));

        ArticleAdapter articleAdapter = new ArticleAdapter(articles);
        binding.contactList.setAdapter(articleAdapter);
    }
}