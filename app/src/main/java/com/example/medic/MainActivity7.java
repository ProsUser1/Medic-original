package com.example.medic;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class MainActivity7 extends AppCompatActivity {

    private EditText name;
    private EditText surname;
    private EditText ot;
    private EditText birthday;
    private EditText pol;
    private Button save;

    private List<String> list_user;
    private String text = "Данные успешно сохранены";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        //присваиваем переменным значения

        name=findViewById(R.id.name);
        surname=findViewById(R.id.surname);
        ot=findViewById(R.id.ot);
        pol=findViewById(R.id.pol);
        save=findViewById(R.id.save);

    }


    //сохранение данных пользователя
    public void save_information(View v){

//        list_user.add(name.toString());
//        list_user.add(String.valueOf(ot.getText()));
//        list_user.add(String.valueOf(surname.getText()));
//        list_user.add(String.valueOf(pol.getText()));

//        name.setText(list_user.get(0));
//        ot.setText(list_user.get(1));
//        surname.setText(list_user.get(2));
//        pol.setText(list_user.get(3));

        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
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