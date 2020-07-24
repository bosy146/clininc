package com.example.clinics.gym;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;

import com.backendless.BackendlessUser;
import com.example.clinics.R;

public class gymb extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gymb);


    }


    public void click(View view) {
        Toast.makeText ( this, "تم الحجز", Toast.LENGTH_SHORT ).show ();
    }
}
