package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity5 extends AppCompatActivity {

    Button BtnSyntax5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        Button btnMove = findViewById(R.id.BtnSyntax5);
        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToSyntax5();
            }
        });
    }

    private void moveToSyntax5(){
        Intent intent = new Intent(Activity5.this, Syntax5.class);
        startActivity(intent);
    }

    public void browser1 (View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/topics/manifest/provider-element.html"));
        startActivity(browserIntent);
    }
}
