package com.example.clinics;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.api.internal.RegisterListenerMethod;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.iid.Registrar;

public class sigin extends AppCompatActivity {
    EditText nameText, phText, emText, pwText;
    TextView siedit;
    FirebaseAuth mFirebaseAuth;
    ProgressBar progressBar;


    private FirebaseAuth.AuthStateListener mAuthStateListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sigin);
        nameText = findViewById(R.id.nameText);
        phText = findViewById(R.id.phText);
        emText = findViewById(R.id.emtext2);
        pwText = findViewById(R.id.pwText);
        siedit = findViewById(R.id.siedit);

        mFirebaseAuth = FirebaseAuth.getInstance();
        progressBar = findViewById(R.id.progressBar);

        if (mFirebaseAuth.getCurrentUser() != null){
            startActivity(new Intent(getApplicationContext(),Main2Activity.class));
            finish();
        }
        siedit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = emText.getText().toString().trim();
                String pwd = pwText.getText().toString().trim();
                if (email.isEmpty()) {
                    emText.setError("please enter your email");
                    return;
                }
                if (pwd.isEmpty()) {
                    emText.setError("please enter your password");
                    return;
                }
                if (pwd.length()<6){
                    pwText.setError("Password Must be >= 6 Characterr");
                    return;
                }
                progressBar.setVisibility(View.VISIBLE);
                // register the user in firebase
                mFirebaseAuth.createUserWithEmailAndPassword(email,pwd).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(sigin.this, "User created", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(),Main2Activity.class));
                        }
                        else {
                            Toast.makeText(sigin.this, "Error! " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }


                    }
                });




            }
        });
        siedit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(sigin.this, login.class);
                startActivity(in);
            }
        });
    }
}


