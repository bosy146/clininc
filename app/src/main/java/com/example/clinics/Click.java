package com.example.clinics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Click extends AppCompatActivity {

    Spinner daySp, hourSp;
    EditText phoneEd, emailEd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_click );
        Intent intent = getIntent ();

        initViews ();
    }

    void initViews() {
        daySp = findViewById ( R.id.day_spinner );
        hourSp = findViewById ( R.id.hour_spinner );
        phoneEd = findViewById ( R.id.phone_edit_text );
        emailEd = findViewById ( R.id.email_edit_text );
    }

    public void click(View view) {

        if (daySp.getSelectedItemPosition () == 0) {
            Toast.makeText ( this, "لم يتم اختيار اليوم", Toast.LENGTH_SHORT ).show ();
        } else if (phoneEd.getText ().length () == 0) {
            Toast.makeText ( this, "لم يتم ادخال رقم الهاتف", Toast.LENGTH_SHORT ).show ();
        }


//        Toast.makeText ( this, "تم الحجز", Toast.LENGTH_SHORT ).show ();

    }
}
