package com.example.clinics;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.backendless.Backendless;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.exceptions.BackendlessFault;


public class Login extends AppCompatActivity {
    EditText loginMail, loginPass;
    Button signup;
    TextView singinedit;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login );
        loginMail = findViewById(R.id.loginMail);
        loginPass = findViewById(R.id.loginPass );
        signup = findViewById(R.id.signup);
        singinedit = findViewById(R.id.singinedit);
        progressBar=findViewById(R.id.progressBar);
        Backendless.initApp(this,"23EA1D8E-4BDB-C659-FFD3-49FD03424E00","0E61FAA8-5FBD-49C8-91EF-E060161DCA95");



    }


    public void onClick(View view) {
        String mail=loginMail.getText().toString();
        String pass=loginPass.getText().toString();
        Backendless.UserService.login(mail, pass, new AsyncCallback<BackendlessUser>() {
            @Override
            public void handleResponse(BackendlessUser response) {
                Toast.makeText(Login.this, " تم التسجيل ", Toast.LENGTH_SHORT).show();
                progressBar.setVisibility(View.VISIBLE);
                Intent in = new Intent( Login.this, MainActivity.class);
                startActivity(in);

            }

            @Override
            public void handleFault(BackendlessFault fault) {
                if (fault.getCode().equals("3003")) {
                    Toast.makeText(Login.this, " بيانات غير صحيحه", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    public void ok(View view) {
        Intent in = new Intent( Login.this, Register.class);
        startActivity(in);
    }
}


