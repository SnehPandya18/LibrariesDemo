package com.snehpandya.butterknifedemo;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindColor;
import butterknife.BindDrawable;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.name)
    TextView title;

    @BindView(R.id.image)
    ImageView mImageView;

    @BindColor(R.color.colorPrimaryDark)
    int red;

    @BindDrawable(R.mipmap.ic_launcher)
    Drawable image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        title.setText("Sneh Pandya");
        title.setTextColor(red);
        mImageView.setImageDrawable(image);
    }

    @OnClick(R.id.button)
    void buttonClick() {
        Toast.makeText(this, "Button pressed", Toast.LENGTH_SHORT).show();
    }
}
