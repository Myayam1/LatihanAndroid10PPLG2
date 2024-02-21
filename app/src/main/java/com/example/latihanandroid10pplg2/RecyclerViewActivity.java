package com.example.latihanandroid10pplg2;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {
    RecyclerView rvmakanan;
    ArrayList<MyModel> listmakanan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        listmakanan = new ArrayList<>();
        rvmakanan = (RecyclerView)findViewById(R.id.items);

        MyModel makan1 = new MyModel();
        makan1.setNama("Ayam Geprek");
        makan1.setNo("RP 10.000");
        makan1.setImgSrc(R.drawable.persipur);
        listmakanan.add(makan1);

        MyModel makan2 = new MyModel();
        makan2.setNama("Mie Ayam");
        makan2.setNo("RP 8.000");
        makan2.setImgSrc(R.drawable.logo);
        listmakanan.add(makan2);



        rvmakanan.setLayoutManager(new LinearLayoutManager(this));
        rvmakanan.setAdapter(new MyAdapter(getApplicationContext(),listmakanan));
    }
}