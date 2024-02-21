package com.example.latihanandroid10pplg2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class MyAdapter extends RecyclerView.Adapter<ViewHolder>{

    private Context context;
    private List<MyModel> myList;



    public MyAdapter(Context context, List<MyModel> makanlist) {
        this.context = context;
        this.myList = myList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.items_layout, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final MyModel makanpls = this.myList.get(position);
        holder.tvNama.setText(makanpls.getNama());
        holder.tvHarga.setText(makanpls.getNo());
        holder.imgMakanan.setImageResource(makanpls.getImgSrc());


    }

    @Override
    public int getItemCount() {
        return this.myList.size();
    }
}