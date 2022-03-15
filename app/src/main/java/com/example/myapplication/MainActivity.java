package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //actionbar titel
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("first activity");

        //Edit text
        final EditText name1 = findViewById(R.id.name);
        final EditText age1 = findViewById(R.id.age);

        //Button
        Button calculate = findViewById(R.id.NEXT);

        //Button click listener
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //get data from Edit text
                String name = name1.getText().toString();
                String age = age1.getText().toString();

                //activety intent
                final Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("NAME", name);
                i.putExtra("AGE", age);
                startActivity(i);



                //Button reset
                Button reset = findViewById(R.id.RESET);
                reset.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        name1.setText("");
                        age1.setText("");

                    }
                });
            }

        });

    }
}