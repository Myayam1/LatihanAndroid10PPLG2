package com.example.latihanandroid10pplg2;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecViewActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        recyclerView = (RecyclerView)findViewById(R.id.items);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new MyAdapter(getList());
        recyclerView.setAdapter(adapter);
    }

    private List<MyModel> getList() {
        List<MyModel> myModels = new ArrayList<>();

        myModels.add(new MyModel("Ayam Geprek", "Rp 10.000", R.drawable.geprek_img));
        myModels.add(new MyModel("Nasi Goreng", "Rp 12.000", R.drawable.nasgor_img));

        return myModels;
    }
}