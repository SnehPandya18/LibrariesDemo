package com.snehpandya.materialbottomdemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView mBottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textFavorites = (TextView) findViewById(R.id.text_favorite);
        final TextView textHome = (TextView) findViewById(R.id.text_home);
        final TextView textMusic = (TextView) findViewById(R.id.text_music);

        mBottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        mBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_favorites:
                        textFavorites.setVisibility(View.VISIBLE);
                        textHome.setVisibility(View.GONE);
                        textMusic.setVisibility(View.GONE);
                        break;
                    case R.id.action_schedules:
                        textFavorites.setVisibility(View.GONE);
                        textHome.setVisibility(View.VISIBLE);
                        textMusic.setVisibility(View.GONE);
                        break;
                    case R.id.action_music:
                        textFavorites.setVisibility(View.GONE);
                        textHome.setVisibility(View.GONE);
                        textMusic.setVisibility(View.VISIBLE);
                        break;
                }
                return true;
            }
        });
    }
}
