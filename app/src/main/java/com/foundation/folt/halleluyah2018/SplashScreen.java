package com.foundation.folt.halleluyah2018;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.foundation.folt.halleluyah2018.MainActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent Intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(Intent);
                finish();

            }
        },3000);
    }
}
