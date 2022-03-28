package com.example.projectkrasulin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Button button = findViewById(R.id.gm);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Profile.this, MainScreen.class);
                Profile.this.startActivity(a);
            }
        });

        LinearLayout button1 = findViewById(R.id.aa);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s = new Intent(Profile.this, MainScreen.class);
                Profile.this.startActivity(s);
            }
        });

        LinearLayout button2 = findViewById(R.id.aaa);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(Profile.this, Collection.class);
                Profile.this.startActivity(c);
            }
        });

        ImageView button3 = findViewById(R.id.obs);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(Profile.this, ChatList.class);
                Profile.this.startActivity(b);
            }
        });
    }
}