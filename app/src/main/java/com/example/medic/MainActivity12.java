package com.example.medic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
    }

    //вернуться к оформлению заказа
    public void goBackOrder(View v){
        Intent intent = new Intent(this, MainActivity10.class);
        startActivity(intent);
    }
}