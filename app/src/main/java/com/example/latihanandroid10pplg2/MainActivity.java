package com.example.latihanandroid10pplg2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText userInput, pwInput;
    Button logBtn, regBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_constraint);

        userInput = findViewById(R.id.username_txt);
        pwInput = findViewById(R.id.password_txt);
        logBtn = findViewById(R.id.login_btn);
        regBtn = findViewById(R.id.register_btn);

        Intent recyclerViewActivity = new Intent(MainActivity.this, RecyclerViewActivity.class);

        logBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (userInput.getText().toString().equals("admin") && pwInput.getText().toString().equals("admin")) {
                    startActivity(recyclerViewActivity);
                } else {
                    Toast.makeText(MainActivity.this, "Login Gagal", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}