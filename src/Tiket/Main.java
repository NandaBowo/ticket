/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tiket;

import java.util.Scanner;

/**
 *
 * @author Nanda D. Cahyo
 */
public class Main {
    public static void main(String[] args) {
        Tiket[] tiket = {
            new Bisnis("Bisnis"),
            new Ekonomi("Ekonomi"),
            new Eksekutif("Eksekutif"),
        };
        mulai(tiket);
    }
    
    public static void mulai(Tiket[] tiket) {
        boolean berhenti = false;
        
        while(!berhenti) {
            daftarTiket(tiket);
            
            Scanner input = new Scanner(System.in);
            int indexTiket, kuantitas;
            String ulang;
            
            System.out.println("Masukkan Pesanan Anda");
            
            System.out.print("Kelas : ");
            indexTiket = input.nextInt();
            
            if (tiket.length < indexTiket) {
                System.out.println("============================================");
                
                System.out.println("Pilihan anda tidak ada dalam menu!");
                System.out.println("");
                
                continue;
            }
            
            System.out.print("Jumlah penumpang : ");
            kuantitas = input.nextInt();
            
            int total = tiket[indexTiket - 1].getHarga() * kuantitas;
            
            System.out.println("Total bayar : Rp " + total);
            
            System.out.println("============================================");
            
            boolean ulangi = false;
            
            while(!ulangi) {
                System.out.print("Pesan lagi? (Y/N) : ");
                ulang = input.next();
                
                if (!ulang.toLowerCase().equals("y") && !ulang.toLowerCase().equals("n")) {
                    continue;
                }
                
                ulangi = true;
                
                if (ulang.toLowerCase().equals("n")) {
                    berhenti = true;
                    System.out.println("Terima kasih...");
                }
            }
        }
    }
    
    public static void daftarTiket(Tiket[] tiket) {
        System.out.println("============================================");
        System.out.println("Daftar Tiket Kereta Api | Surabaya - Malang");
        
        for (int i = 0; i < tiket.length; i++) {
            System.out.println((i + 1) + ". " + tiket[i].getNama() + " (Rp " + tiket[i].getHarga() + ")");
        }
        
        System.out.println("============================================");
    }
}
