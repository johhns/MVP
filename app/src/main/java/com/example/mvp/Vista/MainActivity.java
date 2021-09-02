package com.example.mvp.Vista;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.mvp.Adaptadores.AdaptadorViewPager2;
import com.example.mvp.R;

public class MainActivity extends AppCompatActivity {

    ViewPager2 viewPager2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager2 = findViewById(R.id.viewPagerMain) ;
        viewPager2.setAdapter( new AdaptadorViewPager2( getSupportFragmentManager() , getLifecycle() ));



    }
}