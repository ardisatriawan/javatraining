/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagoras;

import java.util.Scanner;

/**
 *
 * @author Luthfi Pratama
 */
public class Pythagoras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan nilai sisi a:");
        int a = scan.nextInt();
        System.out.println("Masukkan nilai sisi b:");
        int b = scan.nextInt();
        
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        
        System.out.println("Nilai sisi c adalah:" +c);
    }
    
}
