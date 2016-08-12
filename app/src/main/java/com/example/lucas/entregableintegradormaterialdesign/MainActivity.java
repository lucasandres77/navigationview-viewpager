package com.example.lucas.entregableintegradormaterialdesign;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewPager viewPager = (ViewPager)findViewById(R.id.viewPager);
        MiFragmentPageAdapter adapterViewPager = new MiFragmentPageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapterViewPager);


        viewPager.setClipToPadding(false);
        viewPager.setPageMargin(12);


        navigationView = (NavigationView) findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(new ListenerMenu());



    }

    private void selectedMenuItem(MenuItem item){

        switch (item.getItemId()){
            case R.id.nav_Seleccion:
               Intent unIntent = new Intent(this, ListaDeJugadoresActivity.class);
                startActivity(unIntent);
                break;

            default:
                Toast.makeText(this,"default" ,Toast.LENGTH_LONG).show();

        }

    }

    private class ListenerMenu implements NavigationView.OnNavigationItemSelectedListener {

        @Override
        public boolean onNavigationItemSelected(MenuItem item) {
            selectedMenuItem(item);
            return true;
        }
    }
}
