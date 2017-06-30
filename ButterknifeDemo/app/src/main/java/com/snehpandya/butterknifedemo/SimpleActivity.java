package com.snehpandya.butterknifedemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnItemClick;

/**
 * Created by sneh.pandya on 30/06/17.
 */

public class SimpleActivity extends Activity {

    @BindView(R.id.list_of_things)
    ListView listOfThings;

    private com.snehpandya.butterknifedemo.SimpleAdapter adapter;

    @OnItemClick(R.id.list_of_things)
    void onItemClick(int position) {
        Toast.makeText(this, "You clicked: " + adapter.getItem(position), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_activity);
        ButterKnife.bind(this);

        adapter = new com.snehpandya.butterknifedemo.SimpleAdapter(this);
        listOfThings.setAdapter(adapter);
    }
}