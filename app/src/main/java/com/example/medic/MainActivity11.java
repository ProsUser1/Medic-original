package com.example.medic;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity11 extends AppCompatActivity {

    private ImageView toggle_on;
    private ImageView toggle_off;
    private EditText address;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        //присваиваем переменным значения
        toggle_on=findViewById(R.id.imageView29);
        toggle_off=findViewById(R.id.imageView28);
        address=findViewById(R.id.editTextText25);

        //делаем невидимыми объекты
        toggle_on.setVisibility(View.INVISIBLE);
        address.setVisibility(View.INVISIBLE);

    }

    public void toggle(View v){
        //делаем объекты видимыми
        toggle_on.setVisibility(View.VISIBLE);
        address.setVisibility(View.VISIBLE);

        //невидимым
        toggle_off.setVisibility(View.INVISIBLE);

    }


    //включаем
    public void toggle_on(View v){
        toggle_on.setVisibility(View.INVISIBLE);
        address.setVisibility(View.INVISIBLE);

        toggle_off.setVisibility(View.VISIBLE);

    }


    //вернуться к оформлению заказа
    public void goBackOrder(View v){
        Intent intent = new Intent(this, MainActivity10.class);
        startActivity(intent);
    }
}