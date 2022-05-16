package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread thread=new Thread(){
            public void run(){
                try {
                    sleep(3000);
                    finish();
                    Intent spl=new Intent(SplashScreenActivity.this,WelcomeActivity.class);
                    startActivity(spl);
                }
                catch (Exception e){
                }
            }
        };
        thread.start();
    }
}