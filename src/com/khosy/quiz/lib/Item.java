/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khosy.quiz.lib;

/**
 *
 * @author khosy
 */
public class Item {
    private String nama; // variabel nama untuk menyimpan Item nama yang bertipe String
    private float harga; // variabel harga untuk menyimpan Item harga yang bertipe float
    private int banyak; // variabel banyak untuk menyimpan Item banyak yang bertipe integer
    
       //kontruktor dengan 2 parameter untuk mengisi Jcombo box
    public Item(String nama, float harga) {
        this.nama = nama;
        this.harga = harga;
    }
        //konstruktor dengan semua parameter yang ada untuk transaksi set Itemnya.
    public Item(String nama, float harga, int banyak) {
        this.nama = nama;
        this.harga = harga;
        this.banyak = banyak;
    }
        //setter nama
    public void setNama(String nama) {
        this.nama = nama;
    }
        //setter harga
    public void setHarga(float harga) {
        this.harga = harga;
    }
        //setter banyak
    public void setBanyak(int banyak) {
        this.banyak = banyak;
    }
        //getter nama
    public String getNama() {
        return nama;
    }
        //getter harga
    public float getHarga() {
        return harga;
    }
        //getter banyak
    public int getBanyak() {
        return banyak;
    }
        // getter untuk mendapatkan harga total dengan operasi perkalian harga dikali banyak
    public float getTotal() {
        return this.harga * this.banyak;
    }
    
    
        //overide toString untuk mendapatkan informasi tentang nama
    @Override
    public String toString() {
        return this.nama;
    }
}
