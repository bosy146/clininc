package com.example.clinics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Click extends AppCompatActivity {
    TextView mobText,eText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click);
        Intent intent=getIntent();
        mobText=findViewById(R.id.mobText);
        eText=findViewById(R.id.eText);
    }
}
