package com.example.clinics;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        setSupportActionBar ( toolbar );

        intiViews ();

        toggle = new ActionBarDrawerToggle ( this, drawerLayout, toolbar, R.string.open, R.string.close );
        toggle.getDrawerArrowDrawable ().setColor ( ContextCompat.getColor ( this, R.color.black ) );
        drawerLayout.addDrawerListener ( toggle );
        toggle.setDrawerIndicatorEnabled ( true );
        toggle.syncState ();
        navigationView.setNavigationItemSelectedListener ( this );
        navigationView.bringToFront ();


        if (savedInstanceState == null) {
            getSupportFragmentManager ().beginTransaction ().replace ( R.id.content_fragment, new Home () ).commit ();
            navigationView.setCheckedItem ( R.id.nav_home );
        }
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId ()) {
            case R.id.nav_home:
                Toast.makeText ( this, "home", Toast.LENGTH_SHORT ).show ();
                break;
            case R.id.nav_favorite:
                Toast.makeText ( this, "favorite", Toast.LENGTH_SHORT ).show ();
                break;
            case R.id.nav_chat:
                Toast.makeText ( this, "chat", Toast.LENGTH_SHORT ).show ();
                break;
            default:

        }
        return true;
    }


    public void intiViews() {
        drawerLayout = findViewById ( R.id.drawar );
        navigationView = findViewById ( R.id.navigation_view );
        toolbar = findViewById ( R.id.toolbar );
    }
}


