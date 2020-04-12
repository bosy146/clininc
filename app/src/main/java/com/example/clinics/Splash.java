package com.example.clinics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

////
public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_splash );

        // دا تايمر بينفذ الى جواه  بعد وقت معين بالملي ثانية
        //new Handler ().postDelayed ( new Runnable () {
           // @Override
            //public void run() {
              //  Intent in = new Intent ( Splash.this, Login.class );
              //  startActivity ( in );
         //   }
       // }, 3000 );
    }

    public void main(View view) {

        Intent in = new Intent ( this, Login.class );
        startActivity ( in );
    }
}
