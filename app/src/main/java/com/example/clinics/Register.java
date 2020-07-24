package com.example.clinics;

import android.annotation.SuppressLint;
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
    EditText emtext, nameText, pwText, pwText2;
    TextView siedit;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_register );
        emtext = findViewById ( R.id.emText );
        nameText = findViewById ( R.id.nameText );
        pwText = findViewById ( R.id.pwText );
        pwText2 = findViewById ( R.id.pwText2 );
        siedit = findViewById ( R.id.siedit );
        progressBar=findViewById(R.id.progressBar);


    }

    public void sigin(View view) {
        BackendlessUser user = new BackendlessUser();
        user.setEmail(emtext.getText().toString());
        user.setPassword(pwText.getText().toString());
        user.setPassword(pwText2.getText().toString());
        user.setProperty("name", nameText.getText().toString());

        Backendless.UserService.register(user,this);
    }

    @Override
    public void handleResponse(BackendlessUser response) {
        Toast.makeText(this, " تم الحفظ ", Toast.LENGTH_SHORT).show();
        progressBar.setVisibility(View.VISIBLE);

        Intent in=new Intent(Register.this,MainActivity.class);
        startActivity(in);

    }

    @SuppressLint("ResourceType")
    @Override
    public void handleFault(BackendlessFault fault) {

        if (fault.getCode().equals("3033")) {
            Toast.makeText(this, " تم التسجيل من قبل", Toast.LENGTH_SHORT).show();
        }
        else
            Toast.makeText(this, " خطا فى التسجيل", Toast.LENGTH_SHORT).show();
    }
}





