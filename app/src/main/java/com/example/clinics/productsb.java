package com.example.clinics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class productsb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productsb);
    }

    public void click(View view) {
        Toast.makeText ( this, "تم الحجز", Toast.LENGTH_SHORT ).show ();

    }
}
