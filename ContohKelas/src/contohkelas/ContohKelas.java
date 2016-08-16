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
public class ContohKelas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mobil MobilA = new mobil();
        
        MobilA.setLintang(2);
        MobilA.setBujur(3);
        
        MobilA.Maju(2);
        MobilA.Kanan(4);
        MobilA.Mundur(5);
        MobilA.Kiri(3);
        
        System.out.println("Lintang: "+MobilA.getLintang()+ " Bujur: "+MobilA.getBujur());
    }
    
}
