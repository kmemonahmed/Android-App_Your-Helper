package com.example.android_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    ImageView Qr_Scanner,Basic_Calc,Cgpa_Calc,Bmi_Calc,Emi_Calc,About;
    TextView Qr_TV,Basic_TV,Cgpa_TV,Bmi_Tv,Emi_Tv,Abouttv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        Qr_Scanner = findViewById(R.id.qr_id);
        Qr_TV = findViewById(R.id.qr_tvid);

        Basic_Calc = findViewById(R.id.Basic_id);
        Basic_TV = findViewById(R.id.Basic_idtv);

        Cgpa_Calc = findViewById(R.id.cg_id);
        Cgpa_TV = findViewById(R.id.cg_idtv);

        Bmi_Calc = findViewById(R.id.bmi_id);
        Bmi_Tv = findViewById(R.id.bmi_idtv);

        Emi_Calc = findViewById(R.id.emi_id);
        Emi_Tv = findViewById(R.id.emi_idtv);

        About = findViewById(R.id.about_id);
        Abouttv = findViewById(R.id.about_idtv);

        Basic_Calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,BasicCalculatorActivity.class);
                startActivity(intent);
            }
        });

        Basic_TV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,BasicCalculatorActivity.class);
                startActivity(intent);
            }
        });

        Cgpa_Calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,CgpaCalculator.class);
                startActivity(intent);
            }
        });

        Cgpa_TV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,CgpaCalculator.class);
                startActivity(intent);
            }
        });

        Bmi_Calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,BmiActivity.class);
                startActivity(intent);
            }
        });

        Bmi_Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,BmiActivity.class);
                startActivity(intent);
            }
        });

        Emi_Calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,EmiActivity.class);
                startActivity(intent);
            }
        });

        Emi_Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,EmiActivity.class);
                startActivity(intent);
            }
        });

        Qr_Scanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,QrActivity.class);
                startActivity(intent);
            }
        });

        Qr_TV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,QrActivity.class);
                startActivity(intent);
            }
        });

        About.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,AboutActivity.class);
                startActivity(intent);
            }
        });

        Abouttv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,AboutActivity.class);
                startActivity(intent);
            }
        });

    }
}
