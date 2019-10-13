package com.example.proyek2.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.proyek2.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleIndonesiaFood(View view) {
        Intent intent = new Intent(this, IndonesianFood.class);
        startActivity(intent);

    }

    public void handleWesternFood(View view) {
        Intent intent = new Intent(this, WesternFood.class);
        startActivity(intent);
    }
}
