/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_25_bisiesto;

import java.util.Scanner;

/**
 *
 * @author fer
 */
public class EVA1_25_Bisiesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ano;
        Scanner input = new Scanner(System.in);
        
        System.out.println();
        System.out.println("Tu ano es?");
        
        ano = input.nextInt();
        
        if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0) )
            System.out.println("es bisiesto");
        else
            System.out.println("NO es un ano bisiesto");
            
       
        
            
    }
    
}
