package com.jeenwalv.tranquiltravels.activity;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

import com.jeenwalv.tranquiltravels.R;

public class LaunchActivity extends AppCompatActivity {

    private static int LAUNCH_TIME_OUT = 2000; // 2 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(LaunchActivity.this, SplashActivity.class);
                startActivity(i);
                finish();
            }
        }, LAUNCH_TIME_OUT);
    }
}

