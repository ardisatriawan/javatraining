/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demobukualamat;

import java.util.ArrayList;

/**
 *
 * @author Luthfi Pratama
 */
public class bukuAlamat {
    private ArrayList<kontak> listKontak = new ArrayList();
    boolean exist = false;
    
    void tambahKontak(String nama, String alamat, String telepon) {
        kontak kontakbaru = new kontak();
        kontakbaru.setNama(nama);
        kontakbaru.setAlamat(alamat);
        kontakbaru.setTelepon(telepon);
        
        listKontak.add(kontakbaru);
    }
    
    void lihatKontak() {
        for (int i = 0; i < listKontak.size(); i++) {
            System.out.println(listKontak.get(i).getNama()+", "+listKontak.get(i).getAlamat()+", "+listKontak.get(i).getTelepon());
        }
    }
    
    void cariKontak(String nama) {
        for (int i = 0; i < listKontak.size(); i++) {
            if(listKontak.get(i).getNama().equals(nama)) {
                System.out.println(listKontak.get(i).getNama()+", "+listKontak.get(i).getAlamat()+", "+listKontak.get(i).getTelepon());
            }
        }
    }
    
    void hapusKontak(String nama) {
        for (int i = 0; i < listKontak.size(); i++) {
            if(listKontak.get(i).getNama().equals(nama)) {
                listKontak.remove(i);
            }
            System.out.println("Kontak telah dihapus");
        }
    }
}
