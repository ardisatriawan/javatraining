/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohkelas;

/**
 *
 * @author Luthfi Pratama
 */
public class mobil {
    int jumlahroda;
    String warna;
    String merk;
    int lintang;
    int bujur;

    void setLintang(int lintang) {
        this.lintang = lintang;
    }

    void setBujur(int bujur) {
        this.bujur = bujur;
    }
    
    void setWarna(String warna) {
        this.warna = warna;
    }
    
    void setRoda(int jumlahroda) {
        this.jumlahroda = jumlahroda;
    }
    
    void setMerk(String merk) {
        this.merk = merk;
    }
    
    void Maju(int langkah) {
        this.lintang = this.lintang + langkah;
    }
    
    void Mundur(int langkah) {
        this.lintang = this.lintang - langkah;
    }
    
    void Kanan(int langkah) {
        this.bujur = this.bujur + langkah;
    }
    
    void Kiri(int langkah) {
        this.bujur = this.bujur - langkah;
    }

    public int getLintang() {
        return lintang;
    }

    public int getBujur() {
        return bujur;
    }
    
    
}
