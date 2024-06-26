package com.example.latihanandroid10pplg2;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class RecViewActivity extends AppCompatActivity implements MyAdapter.ItemClickListener {
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
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    private List<MyModel> getList() {
        List<MyModel> myModels = new ArrayList<>();

        String[] foodNames = getResources().getStringArray(R.array.food_name);
        String[] foodPrices = getResources().getStringArray(R.array.food_price);
        String[] foodImgSrcs = getResources().getStringArray(R.array.food_img_src);

        for (int i = 0; i < foodNames.length; i++) {

            myModels.add(new MyModel(foodNames[i], foodPrices[i], foodImgSrcs[i]));
        }

        return myModels;
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "You clicked " + adapter.getItem(position).getNama() + " on row number " + position, Toast.LENGTH_SHORT).show();
    }
}