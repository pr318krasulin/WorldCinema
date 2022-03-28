package com.example.projectkrasulin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        LinearLayout button = findViewById(R.id.a);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainScreen.this, Profile.class);
                MainScreen.this.startActivity(a);
            }
        });

        LinearLayout button1 = findViewById(R.id.ee);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(MainScreen.this, Collection.class);
                MainScreen.this.startActivity(c);
            }
        });

    }
}