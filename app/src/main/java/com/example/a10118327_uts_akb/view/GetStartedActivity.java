package com.example.a10118327_uts_akb.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.a10118327_uts_akb.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class GetStartedActivity extends AppCompatActivity {

    private ViewPager screenPager;
    private ViewPagerAdapter adapter;
    private Button buttonGetStarted;
    TabLayout tabIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);
        tabIndicator = findViewById(R.id.tab_indicator);
        buttonGetStarted = findViewById(R.id.btn_start);
        screenPager = findViewById(R.id.viewpager);
        adapter = new ViewPagerAdapter(this);

        screenPager.setAdapter(adapter);

        tabIndicator.setupWithViewPager(screenPager);
        buttonGetStarted.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            finish();
        });
    }
}
// 03 JUNI 2021
//10118327
// DERAN DERIYANA FAUZZAN
//IF-8