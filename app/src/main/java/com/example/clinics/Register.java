package com.example.clinics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.backendless.Backendless;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.exceptions.BackendlessFault;


public class Register extends AppCompatActivity implements AsyncCallback<BackendlessUser> {
    EditText nameText, phText, emText, pwText;
    TextView siedit;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_register );
        nameText = findViewById ( R.id.activity_register_ed_name );
        phText = findViewById ( R.id.phText );
        emText = findViewById ( R.id.emtext2 );
        pwText = findViewById ( R.id.activity_register_ed_password );
        siedit = findViewById ( R.id.siedit );
        progressBar=findViewById(R.id.progressBar);


    }

    public void sigin(View view) {
        BackendlessUser user = new BackendlessUser();
        user.setEmail(emText.getText().toString());
        user.setPassword(pwText.getText().toString());
        user.setProperty("name", nameText.getText().toString());
        user.setProperty("phone", phText.getText().toString());
        Backendless.UserService.register(user,this);
    }

    @Override
    public void handleResponse(BackendlessUser response) {
        Toast.makeText(this, " تم الحفظ ", Toast.LENGTH_SHORT).show();
        progressBar.setVisibility(View.VISIBLE);
        Intent in=new Intent(Register.this,Login.class);
        startActivity(in);

    }

    @Override
    public void handleFault(BackendlessFault fault) {

        if (fault.getCode().equals("3033")) {
            Toast.makeText(this, " تم التسجيل من قبل", Toast.LENGTH_SHORT).show();
        }
        else
            Toast.makeText(this, " خطا فى التجيل", Toast.LENGTH_SHORT).show();
    }
}





