/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khosy.quiz.lib;
import java.util.ArrayList;

/**
 *
 * @author khosy
 */
public class Transaksi {
    private final String kode; // variabel kode untuk menyimpan variabel kode yang ada di class Transaksi yang bertipe String
    private ArrayList<Item> items = new ArrayList<>(); // variabel item untuk menyimpan variabel item yang ada di class Transaksi yang bertipe ArrayList
    private float total; // variabel total untuk menyimpan variabel total yang ada di class Transaksi yang bertipe float

        //kontruktor dengan 2 parameter 
    public Transaksi(String kode, ArrayList<Item> items) {
        this.kode = kode;
        this.items = items;
    }
    
        //membuat setter untuk menghitung total
    public void setTotal(){
        float tot = 0;
        for(Item item : this.items){
            tot += item.getTotal();
        }this.total = tot;
    }
    
    public String detail(){
        setTotal();
        String str = "";
        str += "Kode \t\t: " + this.kode + "\n";
        str += "Daftar Belanja : \n";
        for(Item item : this.items){
            str += "\t" + item.getNama() + "(x" + item.getBanyak() + ") : " + item.getTotal() + "\n";
        }
        str += "Total \t\t : " + this.total;
        return str;
    }

    
}
