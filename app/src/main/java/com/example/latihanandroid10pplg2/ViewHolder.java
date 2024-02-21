package com.example.latihanandroid10pplg2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    public TextView tvNama;
    public TextView tvHarga;
    public ImageView imgMakanan;

    public ViewHolder(View itemView) {
        super(itemView);
        tvNama = itemView.findViewById(R.id.tvName);
        tvHarga = itemView.findViewById(R.id.tvno);
        imgMakanan = itemView.findViewById(R.id.img);
    }
}
