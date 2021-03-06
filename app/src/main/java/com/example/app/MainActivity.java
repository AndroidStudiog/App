package com.example.app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.app.fragments.AboutUsFragment;
import com.example.app.fragments.ContactUsFragment;
import com.example.app.fragments.CategorizeByAgeFragment;
import com.example.app.fragments.FavouriteFragment;
import com.example.app.fragments.HomeFragment;
import com.example.app.fragments.MyCartFragment;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawer;
    Toolbar toolbar;
    NavigationView view;
    Fragment fragment=null;
    Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        transaction.replace(R.id.replace_layout,new HomeFragment());
        transaction.commit();

        toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        view=(NavigationView) findViewById(R.id.navigationView);

        drawer=(DrawerLayout) findViewById(R.id.drawerLayout);

        ActionBarDrawerToggle actionBarDrawerToggle=new ActionBarDrawerToggle(this,drawer,toolbar,R.string.open,R.string.close);
        actionBarDrawerToggle.syncState();

        view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        replaceFragment(new HomeFragment());
                        break;
                    case R.id.daily_meal:
                        replaceFragment(new CategorizeByAgeFragment());
                        break;
                    case R.id.favourite:
                        replaceFragment(new FavouriteFragment());
                        break;
                    case R.id.my_cart:
                        replaceFragment(new MyCartFragment());
                        break;
                    case R.id.about_us:
                        replaceFragment(new AboutUsFragment());
                        break;
                    case R.id.contact_us:
                        replaceFragment(new ContactUsFragment());
                        break;
                }
                return true;
            }
        });
        logout=(Button) findViewById(R.id.btn_logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,WelcomeActivity.class);
                startActivity(intent);
            }
        });
    }
    public void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        transaction.replace(R.id.replace_layout,fragment);
        transaction.commit();
        drawer.closeDrawer(GravityCompat.START);
    }
}