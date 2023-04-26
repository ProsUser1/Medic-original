package com.example.medic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
    }

    //переход на главную страницу пользователя с анализами
    public void goToAnalisy(View v){
        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);
    }


    //преход на пустой активити
    public void goToEmptyActivity(View v){
        Intent intent = new Intent(this, MainActivity8.class);
        startActivity(intent);
    }
}