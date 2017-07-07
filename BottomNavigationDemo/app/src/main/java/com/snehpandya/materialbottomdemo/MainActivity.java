package com.snehpandya.materialbottomdemo;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

//https://appsandbiscuits.com/bottom-navigation-android-11-5c5a2d758681

public class MainActivity extends AppCompatActivity implements FavoriteFragment.OnFragmentInteractionListener , HomeFragment.OnFragmentInteractionListener , MusicFragment.OnFragmentInteractionListener {

    BottomNavigationView mBottomNavigationView;

    public void onFragmentInteraction(Uri uri){}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.content, FavoriteFragment.newInstance("What","Ever"));
        transaction.commit();


        final TextView textFavorites = (TextView) findViewById(R.id.text_favorite);
        final TextView textHome = (TextView) findViewById(R.id.text_home);
        final TextView textMusic = (TextView) findViewById(R.id.text_music);

        mBottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        mBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment;
                switch (item.getItemId()) {
                    case R.id.action_favorites:
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        selectedFragment = FavoriteFragment.newInstance("Sneh", "Pandya");
                        transaction.replace(R.id.content, selectedFragment);
                        transaction.commit();
                        textFavorites.setVisibility(View.VISIBLE);
                        textHome.setVisibility(View.GONE);
                        textMusic.setVisibility(View.GONE);
                        break;
                    case R.id.action_schedules:
                        FragmentTransaction transaction2 = getSupportFragmentManager().beginTransaction();
                        selectedFragment = HomeFragment.newInstance("Sneh", "Pandya");
                        transaction2.replace(R.id.content, selectedFragment);
                        transaction2.commit();
                        textFavorites.setVisibility(View.GONE);
                        textHome.setVisibility(View.VISIBLE);
                        textMusic.setVisibility(View.GONE);
                        break;
                    case R.id.action_music:
                        FragmentTransaction transaction3 = getSupportFragmentManager().beginTransaction();
                        selectedFragment = MusicFragment.newInstance("Sneh", "Pandya");
                        transaction3.replace(R.id.content, selectedFragment);
                        transaction3.commit();
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
