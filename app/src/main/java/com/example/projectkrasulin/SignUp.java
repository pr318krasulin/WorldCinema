package com.example.projectkrasulin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Button button = findViewById(R.id.si);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(SignUp.this, SignIn.class);
                SignUp.this.startActivity(a);
            }
        });

        Button button1 = findViewById(R.id.sii);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s = new Intent(SignUp.this, SignIn.class);
                SignUp.this.startActivity(s);
            }
        });
    }
}