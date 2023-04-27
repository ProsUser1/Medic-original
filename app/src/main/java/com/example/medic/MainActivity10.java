package com.example.medic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
    }


    //ввод адреса пользователя
    public  void enter_address(View v){
        Intent intent = new Intent(this, MainActivity11.class);
        startActivity(intent);
    }

    //ввод даты и времени
    public  void  enter_date(View v){
        Intent intent = new Intent(this, MainActivity12.class);
        startActivity(intent);
    }


    //выбор пациента
    public void add_patient(View v){
        Intent intent = new Intent(this, MainActivity13.class);
        startActivity(intent);
    }
}