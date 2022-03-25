package com.example.projectkrasulin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        Button button = findViewById(R.id.siu);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(SignIn.this, SignUp.class);
                SignIn.this.startActivity(a);
            }
        });

        Button button1 = findViewById(R.id.vti);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent v = new Intent (SignIn.this, MainScreen.class);
                SignIn.this.startActivity(v);
            }
        });

    }
}