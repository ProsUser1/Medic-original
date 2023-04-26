package com.example.medic;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity9 extends AppCompatActivity {

    private ImageView i1;
    private ImageView i2;
    private ImageView i3;
    private TextView t1;
    private Button btn;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        i1=findViewById(R.id.imageView19);
        i2=findViewById(R.id.imageView21);
        i3=findViewById(R.id.imageView14);
        t1=findViewById(R.id.textView22);
        btn=findViewById(R.id.order);
    }

    //переход на страницу оформления заказа
    public void goToOrder(View view){
        Intent intent = new Intent(this, MainActivity10.class);
        startActivity(intent);
    }

    //возвращение на главную страницу
    public void goBack(View view){
        Intent intent = new Intent(this, MainActivity8.class);
        startActivity(intent);
    }


    //очистка корзины
    public void cleanBasket(View view){
        i1.setVisibility(View.INVISIBLE);
        i2.setVisibility(View.INVISIBLE);
        i3.setVisibility(View.INVISIBLE);
        t1.setVisibility(View.INVISIBLE);
        btn.setVisibility(View.INVISIBLE);
    }

}