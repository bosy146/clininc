package com.example.clinics.beauty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.clinics.R;

public class beautyb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beautyb);
    }

    public void beautyc(View view) {
        Toast.makeText ( this, "تم الحجز", Toast.LENGTH_SHORT ).show ();

    }
}
