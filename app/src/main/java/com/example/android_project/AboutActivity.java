package com.example.android_project;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);


        TextView link = findViewById(R.id.linkid);
        link.setMovementMethod(LinkMovementMethod.getInstance());

        TextView link2 = findViewById(R.id.linkid2);
        link2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView lin3 = findViewById(R.id.linkid3);
        lin3.setMovementMethod(LinkMovementMethod.getInstance());




    }
}
