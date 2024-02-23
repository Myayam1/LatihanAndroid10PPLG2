package com.example.latihanandroid10pplg2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity {

    ImageButton btnKalkulator, btnRecView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnKalkulator = findViewById(R.id.kalkulator_btn);
        btnRecView = findViewById(R.id.recyclerview_btn);

        btnKalkulator.setOnClickListener(this::onClick);
        btnRecView.setOnClickListener(this::onClick);
    }

    public void onClick(View v) {
        Intent kalkulatorActivity = new Intent(HomeActivity.this, KalkulatorActivity.class);
        Intent recViewActivity = new Intent(HomeActivity.this, RecViewActivity.class);

        if (v.getId() == R.id.kalkulator_btn) {
            startActivity(kalkulatorActivity);
        } else if (v.getId() == R.id.recyclerview_btn) {
            startActivity(recViewActivity);
        }
    }
}