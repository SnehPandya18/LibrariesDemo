package com.snehpandya.smstokendemo;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.token);
        SmsManager smsManager = SmsManager.getDefault();
        String appSmsToken = smsManager.createAppSpecificSmsToken(createSmsTokenPendingIntent());

        textView.setText(appSmsToken);

        Log.i("MainActivity", "sms token " + appSmsToken);
    }

    private PendingIntent createSmsTokenPendingIntent() {
        return PendingIntent.getActivity(this, 1234,
                new Intent(this, SmsTokenResultVerificationActivity.class), 0);
    }
}