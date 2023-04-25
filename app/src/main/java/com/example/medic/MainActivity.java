package com.example.medic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TextView skip;
    private ViewPager screenPager;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        skip = findViewById(R.id.textView);


        List<ScreenItem> mList = new ArrayList<>();

        mList.add(new ScreenItem("Анализы", "Экспресс сбор и получение проб", R.drawable.illustration));
        mList.add(new ScreenItem("Уведомления", "Вы быстро узнаете о результатах", R.drawable.illustration_1));
        mList.add(new ScreenItem("Мониторинг", "Наши врачи всегда наблюдают \n" +
                "за вашими показателями здоровья", R.drawable.illustration_2));

//         screenPager = findViewById(R.id.viewPager);
//        IntroViewPager introViewPager= new IntroViewPager(this, mList);
//
//        screenPager.setAdapter(introViewPager);


    }

    public void Skip(View v){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}