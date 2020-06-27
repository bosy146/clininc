package com.example.clinics;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private ViewPager pager;
    private PagerAdapter pagerAdapter;
    DrawerLayout drawer;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pager=findViewById(R.id.pager);
        pagerAdapter=new SlidePageAdapter(getSupportFragmentManager(),this);
        pager.setAdapter(pagerAdapter);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawer = findViewById(R.id.drawar_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string
                .navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        intiViews();
        // toggle = new ActionBarDrawerToggle ( this, drawer, toolbar, R.string.open, R.string.close );
        // toggle.getDrawerArrowDrawable ().setColor ( ContextCompat.getColor ( this, R.color.black ) );
        // drawer.addDrawerListener ( toggle );
        // toggle.setDrawerIndicatorEnabled ( true );
        //toggle.syncState ();
        // navigationView.setNavigationItemSelectedListener ( this );
        // navigationView.bringToFront ();
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Home()).commit();
            navigationView.setCheckedItem(R.id.nav_home); } }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId ()) {
            case R.id.nav_home:
                Toast.makeText ( this, "الرئيسيه", Toast.LENGTH_SHORT ).show ();
                pager.setCurrentItem(0);
                break;
            case R.id.nav_favorite:
                Toast.makeText ( this, "المفضله", Toast.LENGTH_SHORT ).show ();
                pager.setCurrentItem(1);
                break;
            case R.id.nav_chat:
                Toast.makeText ( this, "الدردشه", Toast.LENGTH_SHORT ).show ();
                pager.setCurrentItem(2);
                break;
            case R.id.about:
                Toast.makeText ( this, " حول التطبيق", Toast.LENGTH_SHORT ).show ();
                pager.setCurrentItem(3);
                break;
            case R.id.share:
                Toast.makeText ( this, " مشاركه التكبيق", Toast.LENGTH_SHORT ).show ();
                pager.setCurrentItem(4);
                break;
            case R.id.nav_profile:
                Toast.makeText ( this, "الحساب الشخصى", Toast.LENGTH_SHORT ).show ();
                pager.setCurrentItem(5);
                break;

                default: }
        drawer.closeDrawer(GravityCompat.START);
        return true; }
        @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);}
        else {
            super.onBackPressed();
        }
    }
    //}
    public void intiViews() {
        drawer = findViewById ( R.id.drawar_layout );
        navigationView = findViewById ( R.id.nav_view );
        toolbar = findViewById ( R.id.toolbar );
    }
}


