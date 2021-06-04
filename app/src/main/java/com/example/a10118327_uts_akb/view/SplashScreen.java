package com.example.a10118327_uts_akb.view;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

import com.example.a10118327_uts_akb.R;
import com.example.a10118327_uts_akb.view.MainActivity;


public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash_screen);
        final Handler handler = new Handler();
        handler.postDelayed(() -> {
            startActivity(new Intent(getApplicationContext(), GetStartedActivity.class));
            finish();
        }, 3000L);
    }
    }
    // 31 MEI 2021
    //10118327
    // DERAN DERIYANA FAUZZAN
    //IF-8

