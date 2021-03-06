package com.example.amikom.pamretrofit.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by amikom on 26/12/2018.
 */

public class ModelData {
    @SerializedName("id")
    String id;
    @SerializedName("ikon")
    String ikon;
    @SerializedName("gambar")
    String  gambar;
    @SerializedName("nama")
    String nama;
    @SerializedName("nomor")
    String nomor;
    @SerializedName("age")
    String age;
    @SerializedName("team")
    String tim;
    @SerializedName("posisi")
    String posisi;
    @SerializedName("negara")
    String negara;
    @SerializedName("deskripsi")
    String deskripsi;

    public ModelData(String id, String ikon, String gambar, String nama, String nomor, String age, String tim, String posisi, String negara, String deskripsi) {
        this.id = id;
        this.ikon = ikon;
        this.gambar = gambar;
        this.nama = nama;
        this.nomor = nomor;
        this.age = age;
        this.tim = tim;
        this.posisi = posisi;
        this.negara = negara;
        this.deskripsi = deskripsi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIkon() {
        return ikon;
    }

    public void setIkon(String ikon) {
        this.ikon = ikon;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getTim() {
        return tim;
    }

    public void setTim(String tim) {
        this.tim = tim;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public String getNegara() {
        return negara;
    }

    public void setNegara(String negara) {
        this.negara = negara;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
