/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarif;

import java.util.Scanner;

/**
 *
 * @author Luthfi Pratama
 */
public class Tarif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan tipe pelanggan:");
        int tipe = scan.nextInt();
        System.out.println("Masukkan jumlah pemakaian:");
        int jumlah = scan.nextInt();
        
        int biaya = 0;
        int tarif = 0;
        
        if(tipe == 1) {
            biaya = 25000;
            tarif = 1000;
        } else if(tipe == 2) {
            biaya = 27500;
            tarif = 1500;
        } else {
            biaya = 32500;
            tarif = 2250;
        }
        
        int tagihan = biaya + jumlah * tarif;
        int bayar = tagihan + (tagihan * 10/100);
        
        System.out.println("Jumlah tagihan bulanan:" +tagihan);
        System.out.println("Jumlah tagihan akhir:" +bayar);
    }
    
}
