package com.example.latihanandroid10pplg2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
    private List<MyModel> myModels;
    private ItemClickListener mClickListener;

    public MyAdapter(List<MyModel> myModels) {
        this.myModels = myModels;
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
        final MyModel model = this.myModels.get(position);
        holder.tvNama.setText(model.getNama());
        holder.tvHarga.setText(model.getHarga());
        holder.imgMakanan.setImageResource(model.getImgId());


    }

    @Override
    public int getItemCount() {
        return this.myModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView tvNama;
        public TextView tvHarga;
        public ImageView imgMakanan;

        public ViewHolder(View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.tvName);
            tvHarga = itemView.findViewById(R.id.tvno);
            imgMakanan = itemView.findViewById(R.id.img);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (mClickListener != null) mClickListener.onItemClick(v, getAdapterPosition());
        }
    }

    // convenience method for getting data at click position
    MyModel getItem(int id) {
        return myModels.get(id);
    }

    // allows clicks events to be caught
    void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    // parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}