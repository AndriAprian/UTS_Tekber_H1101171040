package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity4 extends AppCompatActivity {

    Button BtnSyntax4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        Button btnMove = findViewById(R.id.BtnSyntax4);
        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToSyntax4();
            }
        });
    }

    private void moveToSyntax4(){
        Intent intent = new Intent(Activity4.this, Syntax4.class);
        startActivity(intent);
    }

    public void browser1 (View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/topics/manifest/receiver-element.html"));
        startActivity(browserIntent);
    }
}
