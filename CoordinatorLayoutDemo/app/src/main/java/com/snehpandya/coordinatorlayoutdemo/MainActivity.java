package com.snehpandya.coordinatorlayoutdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.SwipeDismissBehavior;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        View dismiss = findViewById(R.id.dismiss);
        CoordinatorLayout.LayoutParams params = (CoordinatorLayout.LayoutParams) dismiss.getLayoutParams();
        SwipeDismissBehavior<View> behavior = new SwipeDismissBehavior<>();
        behavior.setSwipeDirection(SwipeDismissBehavior.SWIPE_DIRECTION_START_TO_END);
        behavior.setListener(new SwipeDismissBehavior.OnDismissListener() {
            @Override
            public void onDismiss(final View view) {
                Intent i = new Intent(MainActivity.this, NewActivity.class);
                startActivity(i);
            }

            @Override
            public void onDragStateChanged(int i) {}
        });
        params.setBehavior(behavior);
    }
}
