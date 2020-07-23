package com.example.clinics;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private ViewPager pager;
    private PagerAdapter pagerAdapter;
    DrawerLayout drawer;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        pager = findViewById ( R.id.viewPager );
        pagerAdapter = new SlidePageAdapter ( getSupportFragmentManager (), this );
        pager.setAdapter ( pagerAdapter );

        Toolbar toolbar = findViewById ( R.id.toolbar );
        setSupportActionBar ( toolbar );
        drawer = findViewById ( R.id.drawar_layout );
        NavigationView navigationView = findViewById ( R.id.nav_view );
        navigationView.setNavigationItemSelectedListener ( this );
        toggle = new ActionBarDrawerToggle ( this, drawer, toolbar, R.string
                .navigation_drawer_open, R.string.navigation_drawer_close );
        toggle.getDrawerArrowDrawable ().setColor ( getResources ().getColor ( R.color.white ) );
        drawer.addDrawerListener ( toggle );
        toggle.syncState ();
        intiViews ();


        if (savedInstanceState == null) {
            getSupportFragmentManager ().beginTransaction ().replace ( R.id.fragment_container, new Home () ).commit ();
            navigationView.setCheckedItem ( R.id.nav_home );
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId ()) {
            case R.id.nav_home:
                Toast.makeText ( this, "الرئيسيه", Toast.LENGTH_SHORT ).show ();
                pager.setCurrentItem ( 0 );
                break;
            case R.id.nav_favorite:
                Toast.makeText ( this, "المفضله", Toast.LENGTH_SHORT ).show ();
                pager.setCurrentItem ( 1 );
                break;
            case R.id.nav_chat:
                Toast.makeText ( this, "الدردشه", Toast.LENGTH_SHORT ).show ();
                pager.setCurrentItem ( 2 );
                break;
            case R.id.about:
                Toast.makeText ( this, " حول التطبيق", Toast.LENGTH_SHORT ).show ();
                pager.setCurrentItem ( 3 );
                break;
            case R.id.share:
                Toast.makeText ( this, " مشاركه التطبيق", Toast.LENGTH_SHORT ).show ();
                pager.setCurrentItem ( 4 );
                break;
            case R.id.nav_profile:
                Toast.makeText ( this, "الحساب الشخصى", Toast.LENGTH_SHORT ).show ();
                pager.setCurrentItem ( 5 );
                break;


            default:

        }
        drawer.closeDrawer ( GravityCompat.START );
        return true;
    }

    @Override
    public void onBackPressed() {
        int fragNumber = pager.getCurrentItem ();
        switch (fragNumber) {
            case 0:
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                pager.setCurrentItem ( 0 );
                break;
        }
    }
    //}


    public void intiViews() {
        drawer = findViewById ( R.id.drawar_layout );
        navigationView = findViewById ( R.id.nav_view );
        toolbar = findViewById ( R.id.toolbar );
    }
}


