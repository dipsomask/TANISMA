package com.example.dating_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.firebase.ui.auth.AuthUI;

import com.google.firebase.auth.FirebaseAuth;


public class UsersChat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users_chat);

        //пользователь ещё не авторизован
        //if(FirebaseAuth.getInstance().getCurrentUser() == null)
    }
}