package com.example.latihanandroid10pplg2;

public class MyModel    {
    private String nama;
    private String harga;
    private int imgId;

    public MyModel(String nama, String harga, int imgId) {
        this.nama = nama;
        this.harga = harga;
        this.imgId = imgId;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}