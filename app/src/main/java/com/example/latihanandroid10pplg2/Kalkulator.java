package com.example.latihanandroid10pplg2;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.AdapterView;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Kalkulator extends AppCompatActivity {

    EditText num1, num2;
    Button btnCount;
    Spinner dropdown;
    TextView txtHasil;
    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        num1 = findViewById(R.id.first_num);
        num2 = findViewById(R.id.sec_num);
        btnCount = findViewById(R.id.btn_count);
        dropdown = findViewById(R.id.spinner_operator);
        txtHasil = findViewById(R.id.txt_hasil);

        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dropdown.getSelectedItem() != null) {
                    String selectedItem = dropdown.getSelectedItem().toString().toLowerCase();
                    int firstNum = Integer.parseInt(num1.getText().toString());
                    int secondNum = Integer.parseInt(num2.getText().toString());

                    switch(selectedItem) {
                        case "tambah":
                            txtHasil.setText(String.valueOf(firstNum + secondNum));
                            break;
                        case "kurang":
                            txtHasil.setText(String.valueOf(firstNum - secondNum));
                            break;
                        case "kali":
                            txtHasil.setText(String.valueOf(firstNum * secondNum));
                            break;
                        case "bagi":
                            txtHasil.setText(String.valueOf((double) firstNum / (double) secondNum));
                            break;
                    }
                }
                ;
            }
        });
    }
}