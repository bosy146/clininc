package com.example.clinics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Nose extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nose);
        Intent intent=getIntent();
    }

    public void click(View view) {
        Intent in = new Intent( Nose.this, Click.class);
        startActivity(in);
    }
}
