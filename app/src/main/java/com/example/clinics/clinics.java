package com.example.clinics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class clinics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clinics);
        Intent intent=getIntent();
        //String result=intent.getStringExtra("name");
      //  Toast.makeText(clinics.this,result,Toast.LENGTH_LONG).show();
    }


    }

