/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demobukualamat;

import java.util.Scanner;

/**
 *
 * @author Luthfi Pratama
 */
public class DemoBukuAlamat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        bukuAlamat bukualamat = new bukuAlamat();
        kontak kontak = new kontak();
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan 1 untuk menambah kontak, 2 untuk melihat kontak, 3 untuk mencari kontak, 4 untuk menghapus kontak, 5 untuk keluar dari program:");
        int input = scan.nextInt();
        
        do {
            System.out.println("Masukkan 1 untuk menambah kontak, 2 untuk melihat kontak, 3 untuk mencari kontak, 4 untuk menghapus kontak, 5 untuk keluar dari program:");
            input = scan.nextInt();
            
            if(input == 1) {
                System.out.println("Masukkan nama:");
                String nama = scan.next();
                System.out.println("Masukkan alamat:");
                String alamat = scan.next();
                System.out.println("Masukkan nomor telepon:");
                String telepon = scan.next();

                bukualamat.tambahKontak(nama, alamat, telepon);
            } else if(input == 2 ) {
                bukualamat.lihatKontak();
            } else if(input == 3) {
                System.out.println("Nama yang dicari: ");
                String nama = scan.next();
                
                bukualamat.cariKontak(nama);
            } else if(input == 4) {
                System.out.println("Nama yang ingin dihapus: ");
                String nama = scan.next();
                
                bukualamat.hapusKontak(nama);
            }
        } 
        while(input != 5);
    }
    
}
