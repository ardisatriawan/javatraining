/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author luthf
 */
@ManagedBean
@RequestScoped
public class kalkulator {
    private int nilai1;
    private int nilai2;
    private String hasil;

    public int getNilai1() {
        return nilai1;
    }

    public void setNilai1(int nilai1) {
        this.nilai1 = nilai1;
    }

    public int getNilai2() {
        return nilai2;
    }

    public void setNilai2(int nilai2) {
        this.nilai2 = nilai2;
    }

    public String getHasil() {
        return hasil;
    }
    
    public String tambah() {
        hasil = Integer.toString(nilai1 + nilai2);
        return "";
    }
    
    public String kurang() {
        hasil = Integer.toString(nilai1 - nilai2);
        return "";
    }
    
    public String kali() {
        hasil = Integer.toString(nilai1 * nilai2);
        return "";
    }
    
    public String bagi() {
        hasil = Integer.toString(nilai1 / nilai2);
        return "";
    }
    
}
