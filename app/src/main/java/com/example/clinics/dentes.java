package com.example.clinics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class dentes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dentes);
        Intent intent=getIntent();
    }

    public void click(View view) {
        Intent in = new Intent( dentes.this, Click.class);
        startActivity(in);
    }
}
