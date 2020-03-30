package com.example.clinics.beauty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.clinics.Click;
import com.example.clinics.R;

public class Beautywo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beautywo);
        Intent intent=getIntent();
    }

    public void click(View view) {
        Intent in = new Intent( Beautywo.this, Click.class);
        startActivity(in);
    }
}
