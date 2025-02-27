package com.example.fooddeliveringapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button nextButton = findViewById(R.id.nextButton);

        nextButton.setOnClickListener(v -> {
            // Handle the button click here
            Toast.makeText(MainActivity.this, "Next button clicked!", Toast.LENGTH_SHORT).show();
            // You can add code to navigate to the next screen or perform other actions
        });

        // Add the correct ID for your main view
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            // Handle window insets
            return insets;
        });
    }
}
