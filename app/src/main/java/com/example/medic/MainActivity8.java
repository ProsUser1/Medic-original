package com.example.medic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
    }

    //переход на профиль пользователя
    public void goToProfile(View v){
        Intent intent = new Intent(this, MainActivity7.class);
        startActivity(intent);
    }


    //переход на главную страницу с анализами
    public void goToAnalisy(View v){
        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);
    }
}