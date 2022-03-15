package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //actionbar titel
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("second activity");

        //intent to get data
        Intent i = getIntent();
        String name = i.getStringExtra("NAME");
        String age = i.getStringExtra("AGE");

        //result
        TextView Result1 =findViewById(R.id.result1);
        Result1.setText("Name : "+name+"");


        //result
        TextView Result2 =findViewById(R.id.result2);
        Result2.setText("Age: "+age+"");




    }
}