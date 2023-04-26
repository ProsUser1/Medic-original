package com.example.medic;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity6 extends AppCompatActivity {

    private ImageView image1;
    private ImageView image2;
    private ImageView image3;
    private ImageView image4;
    private Button basket;

    private int price =0;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);


        //присваиваем переменным значения
        image1=findViewById(R.id.i1);
        image2=findViewById(R.id.i2);
        image3=findViewById(R.id.i3);
        image4=findViewById(R.id.i4);

        basket=findViewById(R.id.order);


    }



    //добавление в корзину
    public void add_price(View v){
        basket.setVisibility(View.VISIBLE);

        int id = v.getId();

        switch (id){
            case 2131362345:
                price=price+1800;
                break;
            case 2131362346:
                price=price+690;
                break;
            case 2131362347:
                price=price+2440;
                break;
            case 2131362348:
                price=price+240;
                break;

        }


       // 0 - 2131362345
        // 1 -2131362346
        //2 - 2131362347
        // 3 - 2131362348

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


    //переход в корзину
    public void goToBasket(View v){
        Intent intent = new Intent(this, MainActivity9.class);
        intent.putExtra("sum",price);
        startActivity(intent);
    }
}