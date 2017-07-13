package com.snehpandya.databindingdemo2;

import android.view.View;
import android.widget.Button;

/**
 * Created by sneh.pandya on 13/07/17.
 */

public class Handler {
    public void onButtonClick(View v) {
        if (v instanceof Button) {
            int count = Integer.parseInt(v.getTag().toString());
            count += 1;
            ((Button) v).setText("Clicked " +count);
            v.setTag(count);
        }
    }
}
