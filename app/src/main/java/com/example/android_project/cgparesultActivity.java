package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class cgparesultActivity extends AppCompatActivity {
    private TextView resultg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgparesult);
        resultg = findViewById(R.id.resultgt);
        Intent intent = getIntent();
        float result = intent.getFloatExtra(CgpaCalculator.extrastring,0);
        resultg.setText(String.format("%.2f out of 4.00",result));
    }
}
