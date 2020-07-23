package com.example.clinics.gym;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.backendless.BackendlessUser;
import com.example.clinics.R;

public class gymb extends AppCompatActivity {


    Spinner departmentSp, daySp, hourSp;
    EditText phoneEd, emailEd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_gymb );

        initViews ();
    }

    void initViews() {
        departmentSp = findViewById ( R.id.department_spinner );
        daySp = findViewById ( R.id.day_spinner );
        hourSp = findViewById ( R.id.hour_spinner );
        phoneEd = findViewById ( R.id.phone_edit_text );
        emailEd = findViewById ( R.id.email_edit_text );
    }

    public void click(View view) {

        if (departmentSp.getSelectedItemPosition () == 0) {
            Toast.makeText ( this, "لم يتم اختيار القسم", Toast.LENGTH_SHORT ).show ();
        } else if (daySp.getSelectedItemPosition () == 0) {
            Toast.makeText ( this, "لم يتم اختيار اليوم", Toast.LENGTH_SHORT ).show ();
        } else if (hourSp.getSelectedItemPosition () == 0) {
            Toast.makeText ( this, "لم يتم اختيار الساعة", Toast.LENGTH_SHORT ).show ();
        } else if (phoneEd.getText ().length () == 0) {
            Toast.makeText ( this, "لم يتم ادخال رقم الهاتف", Toast.LENGTH_SHORT ).show ();
        } else if (emailEd.getText ().length () == 0) {
            Toast.makeText ( this, "لم يتم ادخال البريد الاكترونى", Toast.LENGTH_SHORT ).show ();
        } else {
            Toast.makeText ( this, "تم الحجز", Toast.LENGTH_SHORT ).show ();
        }
    }
}
