package com.example.clinics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.clinics.R;
import com.example.clinics.gymb;

public class gym extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gym);
        Intent intent=getIntent();
        //String result=intent.getStringExtra("name");
        //Toast.makeText(gym.this,result,Toast.LENGTH_LONG).show();
    }



    public void bookat(View view) {
        Intent in = new Intent ( this, gymb.class );
        startActivity ( in );
    }
}
