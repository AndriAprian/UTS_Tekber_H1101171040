package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMove = findViewById(R.id.BtnActivity2);
        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToActivity2();
            }
        });

        btnMove = findViewById(R.id.BtnActivity3);
        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToActivity3();
            }
        });

        btnMove = findViewById(R.id.BtnActivity4);
        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToActivity4();
            }
        });

        btnMove = findViewById(R.id.BtnActivity5);
        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToActivity5();
            }
        });

        btnMove = findViewById(R.id.BtnActivity6);
        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToActivity6();
            }
        });


    }
    private void moveToActivity2(){
        Intent intent = new Intent(MainActivity.this, Activity2.class);
        startActivity(intent);
    }

    private void moveToActivity3(){
        Intent intent = new Intent(MainActivity.this, Activity3.class);
        startActivity(intent);
    }

    private void moveToActivity4(){
        Intent intent = new Intent(MainActivity.this, Activity4.class);
        startActivity(intent);
    }

    private void moveToActivity5(){
        Intent intent = new Intent(MainActivity.this, Activity5.class);
        startActivity(intent);
    }

    private void moveToActivity6(){
        Intent intent = new Intent(MainActivity.this, Activity6.class);
        startActivity(intent);
    }



}
