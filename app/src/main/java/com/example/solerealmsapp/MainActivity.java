package com.example.solerealmsapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.solerealmsapp.adapter.AdidasAdapter;
import com.example.solerealmsapp.adapter.JordanAdapter;
import com.example.solerealmsapp.adapter.NikeAdapter;
import com.example.solerealmsapp.model.Adidas;
import com.example.solerealmsapp.model.Jordan;
import com.example.solerealmsapp.model.Nike;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView adidasRecycle;
    AdidasAdapter adidasAdapter;

    RecyclerView jordanRecycle;
    JordanAdapter jordanAdapter;

    RecyclerView nikeRecycle;
    NikeAdapter nikeAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CoordinatorLayout coordinatorLayout = findViewById(R.id.mainLayout);
        AnimationDrawable animationDrawable = (AnimationDrawable) coordinatorLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(5000);
        animationDrawable.start();



        BottomNavigationView bottomNavigationView = findViewById(R.id.nav_view);
        bottomNavigationView.setSelectedItemId(R.id.home);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        return true;
                    case R.id.search:
                        startActivity(new Intent(getApplicationContext()
                                ,SearchActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.menu:
                        startActivity(new Intent(getApplicationContext()
                                ,MenuActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.settings:
                        startActivity(new Intent(getApplicationContext()
                                ,SettingsActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

        List<Adidas> adidasList = new ArrayList<>();
        adidasList.add(new Adidas("Yeezy 700 V3 'Dark Glow'", R.drawable._02585_01_jpg));
        adidasList.add(new Adidas("Yeezy Boost V2 'Zebra'", R.drawable._05568_01_jpg));
        adidasList.add(new Adidas("Yeezy Foam Runner 'Stone'", R.drawable._06312_01_jpg));
        adidasList.add(new Adidas("Yeezy Foam Runner 'Onyx'", R.drawable._07868_01_jpg));
        adidasList.add(new Adidas("Ultra 4D 5.0 'Carbon'", R.drawable._08097_01_jpg));
        adidasList.add(new Adidas("Yeezy Slides 'Bone' 2022", R.drawable._52291_01_jpg));
        adidasList.add(new Adidas("Yeezy Boost 350 V2 'Blue Tint'", R.drawable._52603_01_jpg));
        adidasList.add(new Adidas("Yeezy Boost 700 'Analog'", R.drawable._80136_01_jpg));
        adidasList.add(new Adidas("Yeezy 450 ‘Utility Black’", R.drawable._94556_01_jpg));
        adidasList.add(new Adidas("Superstar 'Footwear White Black'", R.drawable.eg4958_png));
        setAdidasRecycle(adidasList);

        List<Jordan> jordanList = new ArrayList<>();
        jordanList.add(new Jordan("Jordan 8 Aqua", R.drawable._0210_01_converted));
        jordanList.add(new Jordan("Jordan 11 Space Jam", R.drawable._2015_01_converted));
        jordanList.add(new Jordan("Jordan 1 Royal", R.drawable._21225_01_converted));
        jordanList.add(new Jordan("Jordan 13 Breds", R.drawable._32786_01_converted));
        jordanList.add(new Jordan("Jordan 5 Grape", R.drawable._3553_01_converted));
        jordanList.add(new Jordan("Jordan 1 Breds", R.drawable._3578_01_converted));
        jordanList.add(new Jordan("Jordan 4 Military Blue", R.drawable._3649_01_converted));
        jordanList.add(new Jordan("Jordan 3 White Cement", R.drawable._3680_01_converted));
        jordanList.add(new Jordan("Jordan 4 Breds", R.drawable._61782_01_converted));
        jordanList.add(new Jordan("Jordan 6 Black Infrared", R.drawable._64372_01_converted));
        setJordanRecycle(jordanList);


        List<Nike> nikeList = new ArrayList<>();
        nikeList.add(new Nike("Air Force 1 '07",R.drawable._12867_01_converted));
        nikeList.add(new Nike("Dunk Low 'Black White'",R.drawable._19082_01_converted));
        nikeList.add(new Nike("Nike Mag 'Back To The Future'",R.drawable._2154_01_converted));
        nikeList.add(new Nike("Nike Mag 2016 'Auto-Lacing'",R.drawable._9985_01_converted));
        nikeList.add(new Nike("Off-White x Air Force 1 Low '07 'MCA'",R.drawable._19943_01_converted));
        nikeList.add(new Nike("Off-White x Air Presto 'Black'",R.drawable._51623_01_converted));
        nikeList.add(new Nike("Off-White x Dunk Low 'University Red'",R.drawable._40455_01_converted));
        nikeList.add(new Nike("Supreme X Air Force 1 Low 'Box Logo - White'",R.drawable._85307_01_converted));
        nikeList.add(new Nike("Off-white x Blazer Mid 'The Ten'",R.drawable._88248_01_converted));
        nikeList.add(new Nike("Off-White x Air Max 90 'The Ten'",R.drawable._49380_01_converted));
        setAdidasRecycle(adidasList);
    }
    private void setAdidasRecycle(List<Adidas> adidasList){
        adidasRecycle = findViewById(R.id.adidasRecycle);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        adidasRecycle.setLayoutManager(layoutManager);
        adidasAdapter = new AdidasAdapter(this,adidasList);
        adidasRecycle.setAdapter(adidasAdapter);
    }
    private void setJordanRecycle(List<Jordan> jordanList){
        jordanRecycle = findViewById(R.id.jordanRecycle);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        jordanRecycle.setLayoutManager(layoutManager);
        jordanAdapter = new JordanAdapter(this,jordanList);
        jordanRecycle.setAdapter(jordanAdapter);
    }
    private void setNikeRecycle(List<Nike> nikeList) {
        nikeRecycle = findViewById(R.id.nikeRecycle);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        nikeRecycle.setLayoutManager(layoutManager);
        nikeAdapter = new NikeAdapter(this,nikeList);
        nikeRecycle.setAdapter(nikeAdapter);
    }
}