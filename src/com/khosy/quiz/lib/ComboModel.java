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
public class ComboModel {
    private ArrayList<Item> items; // varaibel items untuk menyimpan item dari objek

    //disini saya menambahkan kontruktor dengan 1 parameter
    public ComboModel(ArrayList<Item> items) {
        this.items = items;
    }
    
    //mengkonversikan variabel array yang telah di buat agar bisa mengembalikan hasilnya
    public Item[] toArray(){
        Item[] a = new Item[this.items.size()];
            for(int i = 0; i < a.length; i++){
                a [i] = this.items.get(i);
            }
            return a;
    }
    
    //untuk mendambahkan item ke list dari Item
    public void tambahItem(Item item){
        this.items.add(item);
    }
}
