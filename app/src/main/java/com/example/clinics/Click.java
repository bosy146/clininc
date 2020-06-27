package com.example.clinics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Click extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click);
        Intent intent=getIntent();


    }

    public void click(View view) {
        Toast.makeText ( this, "تم الحجز", Toast.LENGTH_SHORT ).show ();

    }
}
