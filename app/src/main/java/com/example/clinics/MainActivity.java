package com.example.clinics;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;

import com.google.android.material.navigation.NavigationView;


public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        toolbar = findViewById ( R.id.toolbar );
        setSupportActionBar ( toolbar );

        drawerLayout = findViewById ( R.id.drawar );
        navigationView = findViewById ( R.id.navigation_view );

        actionBarDrawerToggle = new ActionBarDrawerToggle ( this, drawerLayout, toolbar, R.string.open, R.string.close );
        actionBarDrawerToggle.getDrawerArrowDrawable ().setColor ( ContextCompat.getColor ( this, R.color.white ) );
        drawerLayout.addDrawerListener ( actionBarDrawerToggle );
        actionBarDrawerToggle.setDrawerIndicatorEnabled ( true );
        actionBarDrawerToggle.syncState ();

        getSupportFragmentManager ().beginTransaction ().replace ( R.id.content_fragment, new Home () ).commit ();

    }
}
