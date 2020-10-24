package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class BasicCalculatorActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonadd, buttonsub, buttondiv,
            buttonmul, buttonequal, buttondot, buttonc;

    TextView textView_result, textView_input;

    float mValueOne, mValueTwo;
    boolean crunchifyAddition, mSubtract, crunchifyMultiplication, crunchifyDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_calculator);

        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonc = findViewById(R.id.butttonc);
        buttondot= findViewById(R.id.buttondot);
        buttonadd = findViewById(R.id.buttonadd);
        buttonsub = findViewById(R.id.buttonsub);
        buttonmul = findViewById(R.id.buttonmul);
        buttondiv = findViewById(R.id.buttondiv);
        buttonequal = findViewById(R.id.buttonequal);
        textView_input = findViewById(R.id.textView_input);
        textView_result = findViewById(R.id.textView_result);


        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_input.setText(textView_input.getText() + "0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_input.setText(textView_input.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_input.setText(textView_input.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_input.setText(textView_input.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_input.setText(textView_input.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_input.setText(textView_input.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_input.setText(textView_input.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_input.setText(textView_input.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_input.setText(textView_input.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_input.setText(textView_input.getText() + "9");
            }
        });


        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    textView_result.setText(textView_input.getText() + " +");
                    mValueOne = Float.parseFloat(textView_input.getText() + "");
                    crunchifyAddition = true;
                    textView_input.setText(null);
                }
                catch (Exception e)
                {

                }
            }
        });

        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    textView_result.setText(textView_input.getText() + " -");

                    mValueOne = Float.parseFloat(textView_input.getText() + "");
                    mSubtract = true;
                    textView_input.setText(null);

                }
                catch (Exception e)
                {

                }
            }
        });

        buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    textView_result.setText(textView_input.getText() + " *");

                    mValueOne = Float.parseFloat(textView_input.getText() + "");
                    crunchifyMultiplication = true;
                    textView_input.setText(null);
                }
                catch (Exception e)
                {

                }
            }
        });

        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    textView_result.setText(textView_input.getText() + " /");

                    mValueOne = Float.parseFloat(textView_input.getText() + "");
                    crunchifyDivision = true;
                    textView_input.setText(null);
                }
                catch (Exception e)
                {

                }
            }
        });

        buttonequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    mValueTwo = Float.parseFloat(textView_input.getText() + "");

                    if (crunchifyAddition == true) {
                        textView_result.setText(mValueOne + mValueTwo + "");
                        crunchifyAddition = false;
                        textView_input.setText(null);
                    }

                    if (mSubtract == true) {
                        textView_result.setText(mValueOne - mValueTwo + "");
                        mSubtract = false;
                        textView_input.setText(null);
                    }

                    if (crunchifyMultiplication == true) {
                        textView_result.setText(mValueOne * mValueTwo + "");
                        crunchifyMultiplication = false;
                        textView_input.setText(null);
                    }

                    if (crunchifyDivision == true) {
                        textView_result.setText(mValueOne / mValueTwo + "");
                        crunchifyDivision = false;
                        textView_input.setText(null);
                    }
                }
                catch (Exception e) {

                }
            }
        });

        buttonc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_input.setText("");
                textView_result.setText("");
            }
        });

        buttondot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_input.setText(textView_input.getText() + ".");
            }
        });


    }
}
