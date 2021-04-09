/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tiket;

/**
 *
 * @author Nanda D. Cahyo
 */
public class Eksekutif implements Tiket {
    String nama = "";
    int harga = 110000;
    
    Eksekutif (String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    public int getHarga() {
        return this.harga;
    }
}
