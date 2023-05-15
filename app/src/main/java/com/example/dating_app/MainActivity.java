package com.example.dating_app;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;

import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    int ct = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zastavka);

        ImageView startImage = findViewById(R.id.startimage);

        // Анимация увеличения
        ScaleAnimation scaleUp = new ScaleAnimation(1.0f, 1.2f, 1.0f, 1.2f,
                Animation.RELATIVE_TO_SELF, 0.3f, Animation.RELATIVE_TO_SELF, 0.3f);
        scaleUp.setDuration(2000);

        // Анимация уменьшения
        ScaleAnimation scaleDown = new ScaleAnimation(1.2f, 1.0f, 1.2f, 1.0f,
                Animation.RELATIVE_TO_SELF, 0.3f, Animation.RELATIVE_TO_SELF, 0.3f);
        scaleDown.setDuration(1500);

        // Комбинированная анимация
        final Animation scaleAnimate = new ScaleAnimation(1.0f, 1.2f, 1.0f, 1.2f,
                Animation.RELATIVE_TO_SELF, 0.3f, Animation.RELATIVE_TO_SELF, 0.3f);
        scaleAnimate.setDuration(1500);
        scaleAnimate.setRepeatCount(Animation.INFINITE);
        scaleAnimate.setRepeatMode(Animation.REVERSE);
        startImage.startAnimation(scaleAnimate);

        // стоп анимации начального изображения
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startImage.clearAnimation(); // стоп анимации начального изображения
                setContentView(R.layout.activity_main);
            }
        }, 1500);
        ct++;
    }
    public void startProfile(View v){
        Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
        startActivity(intent);
    }
    public void startChat(View v){
        Intent intent = new Intent(this, ChatActivity.class);
        startActivity(intent);
    }
    public void startSearchpeople(View v){
        Intent intent = new Intent(this, SearcheopleActivity.class);
        startActivity(intent);
    }

}


