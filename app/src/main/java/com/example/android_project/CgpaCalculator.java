package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CgpaCalculator extends AppCompatActivity {
    public static final String extrastring = "com.example.android_project";
    private EditText p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12;
    private Button calc;

    float p01=0,p02=0,p03=0,p04=0,p05=0,p06=0,p07=0,p08=0,p09=0,p010=0,p011=0,p012=0;
    float result,i_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa_calculator);

        p1 = findViewById(R.id.p1);
        p2 = findViewById(R.id.p2);
        p3 = findViewById(R.id.p3);
        p4 = findViewById(R.id.p4);
        p5 = findViewById(R.id.p5);
        p6 = findViewById(R.id.p6);
        p7 = findViewById(R.id.p7);
        p8 = findViewById(R.id.p8);
        p9 = findViewById(R.id.p9);
        p10 = findViewById(R.id.p10);
        p11 = findViewById(R.id.p11);
        p12 = findViewById(R.id.p12);

        calc = findViewById(R.id.calcid);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int n = 0;


                try {

                    p01 = Float.parseFloat(p1.getText().toString());
                    n += 1;
                } catch (Exception e) {
                }


                try {
                    p02 = Float.parseFloat(p2.getText().toString());
                    n += 1;

                } catch (Exception e) {
                }

                try {
                    p03 = Float.parseFloat(p3.getText().toString());
                    n += 1;

                } catch (Exception e) {
                }

                try {
                    p04 = Float.parseFloat(p4.getText().toString());
                    n += 1;

                } catch (Exception e) {
                }

                try {
                    p05 = Float.parseFloat(p5.getText().toString());
                    n += 1;

                } catch (Exception e) {
                }

                try {
                    p06 = Float.parseFloat(p6.getText().toString());
                    n += 1;

                } catch (Exception e) {
                }

                try {
                    p07 = Float.parseFloat(p7.getText().toString());
                    n += 1;

                } catch (Exception e) {
                }

                try {
                    p08 = Float.parseFloat(p8.getText().toString());
                    n += 1;

                } catch (Exception e) {
                }

                try {
                    p09 = Float.parseFloat(p9.getText().toString());
                    n += 1;

                } catch (Exception e) {
                }

                try {
                    p010 = Float.parseFloat(p10.getText().toString());
                    n += 1;

                } catch (Exception e) {
                }

                try {
                    p011 = Float.parseFloat(p11.getText().toString());
                    n += 1;

                } catch (Exception e) {
                }

                try {
                    p012 = Float.parseFloat(p12.getText().toString());
                    n += 1;

                } catch (Exception e) {
                }


                i_result = p01 + p02 + p03 + p04 + p05 + p06 + p07 + p08 + p09 + p010 + p011 + p012;
                result = i_result / n;


                Intent intent = new Intent(CgpaCalculator.this,cgparesultActivity.class);
                intent.putExtra(extrastring,result);
                startActivity(intent);

            }
        });
    }
}
