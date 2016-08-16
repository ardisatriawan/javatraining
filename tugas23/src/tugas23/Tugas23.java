/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas23;

/**
 *
 * @author Luthfi Pratama
 */
public class Tugas23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        prisma Volume = new prisma();
        
        double volumePrisma;
        volumePrisma = Volume.volumePrisma();
        
        System.out.println("Volume Prisma: "+volumePrisma);
    }
    
}
