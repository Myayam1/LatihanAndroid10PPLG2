package com.example.latihanandroid10pplg2;

public class MyModel    {
    private String nama;
    private String harga;
    private String imgSrc;

    public MyModel(String nama, String harga, String imgSrc) {
        this.nama = nama;
        this.harga = harga;
        this.imgSrc = imgSrc;
    }

    public String getNama() {
        return nama;
    }
    public String getHarga() {
        return harga;
    }
    public String getImgSrc() {
        return imgSrc;
    }
}