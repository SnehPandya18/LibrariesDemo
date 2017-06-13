package com.snehpandya.rxdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import rx.Observable;
import rx.functions.Action1;

public class MainActivity extends AppCompatActivity {

    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.textview);

        Observable.just("1", "2").subscribe(new Action1<String>() {
            @Override
            public void call(String s) {
                mTextView.setText("Text changed!");
            }
        });
    }
}
