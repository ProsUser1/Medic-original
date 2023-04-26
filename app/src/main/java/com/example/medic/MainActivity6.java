package com.example.medic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }

// Переход на профиль пользователя
    public void goToProfile(View v){
        Intent intent = new Intent(this, MainActivity7.class);
        startActivity(intent);
    }

    //переход на пустой активити
    public void goToEmptyActivity(View v){
        Intent intent = new Intent(this, MainActivity8.class);
        startActivity(intent);
    }
}