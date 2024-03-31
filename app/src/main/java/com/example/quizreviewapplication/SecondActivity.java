package com.example.quizreviewapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        display = findViewById(R.id.display);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Intent intent = getIntent();
        String output = intent.getStringExtra("name");
        int age = intent.getIntExtra("age",0);
        display.setText("Welcome " + output + "!" + "\n" + "Age:" + age);
    }
}