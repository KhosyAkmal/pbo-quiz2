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
public class TabelModel {
    private String[] kolom; //variabel kolom untuk menyimpan nama kolom yang bertipe String array

    //kontruktor yang berisi atau menjelaskan tentang array kolom
    public TabelModel() {
        this.kolom = new String []{
        "Nama", "Harga", "Jumlah"};
    }
    
    //getter untuk mendapatkan nama kolom
    public String[] getKolom(){
        return this.kolom;
    }  
    
}
