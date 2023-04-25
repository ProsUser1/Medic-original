package com.example.medic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private EditText mail;
    private Button button;
    private String input_mail ="";
    int color;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        mail = findViewById(R.id.editTextTextEmailAddress);
        button = findViewById(R.id.button2);
        isEmptyEdit(mail);


    }

// переход на другой активити
    public void goNext(View view){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }

    //проверка на поле ввода майла
    public void isEmptyEdit(EditText et){
        input_mail= String.valueOf(mail.getText());
        if(input_mail.isEmpty()!=false){

        }
    }
}