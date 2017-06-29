package com.snehpandya.butterknifedemo;

import android.app.Fragment;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import butterknife.BindDrawable;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by sneh.pandya on 29/06/17.
 */

public class ExampleFragment extends Fragment {

    private Unbinder mUnbinder;

    @BindView(R.id.imageView)
    ImageView imageView;

    @BindDrawable(R.mipmap.ic_launcher_round)
    Drawable img;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater
                .inflate(R.layout.fragment_new, container, false);

        mUnbinder = ButterKnife.bind(this, rootView);


        return rootView;
    }

    @OnClick(R.id.button1)
    void clicked() {
        imageView.setImageDrawable(img);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mUnbinder.unbind();
    }
}
