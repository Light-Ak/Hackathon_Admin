package com.example.fooddeliveringapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Button createAccountButton = findViewById(R.id.createAccountButton);
        createAccountButton.setOnClickListener(v -> {
            // এখানে সাইন-আপ লজিক লিখুন
            Toast.makeText(SignupActivity.this, "Create Account button clicked!", Toast.LENGTH_SHORT).show();
        });

        ImageButton arrowDownButton = findViewById(R.id.arrowDownButton);
        arrowDownButton.setOnClickListener(v -> {
            // এখানে অ্যারো বাটনে ক্লিক করার পর লজিক লিখুন
            Toast.makeText(SignupActivity.this, "Arrow Down button clicked!", Toast.LENGTH_SHORT).show();
        });
    }
}