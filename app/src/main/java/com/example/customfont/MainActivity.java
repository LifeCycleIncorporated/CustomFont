package com.example.customfont;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView one, two, three, four, five;

    private Typeface typeface1, typeface2, typeface3, typeface4, typeface5;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = findViewById(R.id.oneId);
        two = findViewById(R.id.twoId);
        three = findViewById(R.id.threeId);
        four = findViewById(R.id.fourId);
        five = findViewById(R.id.fiveId);

        typeface1 = ResourcesCompat.getFont(this, R.font.a);
        one.setTypeface(typeface1);

        typeface2 = ResourcesCompat.getFont(this,R.font.b);
        two.setTypeface(typeface2);

        typeface3 =ResourcesCompat.getFont(this, R.font.c);
        three.setTypeface(typeface3);

        typeface4 = ResourcesCompat.getFont(this, R.font.d);
        four.setTypeface(typeface4);

        typeface5 = ResourcesCompat.getFont(this, R.font.e);
        five.setTypeface(typeface5);





    }
}