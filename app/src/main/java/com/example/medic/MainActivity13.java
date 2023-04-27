package com.example.medic;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity13 extends AppCompatActivity {

    private ImageView i1;
    private ImageView i2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);

        i1=findViewById(R.id.imageView33);
        i2=findViewById(R.id.imageView34);
    }


    //выбрать пациента
    public void visibilit_on(View v){
        i2.setVisibility(View.VISIBLE);
        i1.setVisibility(View.INVISIBLE);
    }

    //отменить выбор пациента
    public void visibilit_off(View v){
        i2.setVisibility(View.INVISIBLE);
        i1.setVisibility(View.VISIBLE);
    }

    //вернуться к оформлению заказа
    public void goBackOrder(View v){
        Intent intent = new Intent(this, MainActivity10.class);
        startActivity(intent);
    }


}