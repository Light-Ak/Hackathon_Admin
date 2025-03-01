package com.example.fooddeliveringapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_item);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
 <TextView
android:layout_width="0dp"
android:layout_height="57dp"
android:text="Select Image"
android:gravity="center_vertical"
android:paddingLeft="15dp"
android:fontFamily="@font/yeonsung_regular"
android:paddingRight="15dp"
android:textColor="@color/black"
app:layout_constraintEnd_toEndOf="@+id/enterfoodprice"
app:layout_constraintStart_toStartOf="@+id/enterfoodprice"
app:layout_constraintTop_toBottomOf="@+id/enterfoodprice"/>
