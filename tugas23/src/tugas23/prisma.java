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
public class prisma {
    double sisiTrapesium1 = 2.5;
    double sisiTrapesium2 = 4.25;
    double tinggiTrapesium = 6;
    double tinggiPrisma = 10;
    
    private double luasAlas() {
        double hasil = (sisiTrapesium1 + sisiTrapesium2) * tinggiTrapesium / 2;
        return hasil;
    }
    
    public double volumePrisma() {
        double hasil = luasAlas() * tinggiPrisma;
        return hasil;
    }
}
