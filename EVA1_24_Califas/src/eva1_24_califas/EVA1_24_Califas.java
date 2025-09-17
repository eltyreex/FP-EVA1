/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_24_califas;

import java.util.Scanner;

/**
 *
 * @author fer
 */
public class EVA1_24_Califas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int califa;
        Scanner input = new Scanner(System.in);
        System.out.println("cual fue tu califa?");
        System.out.println();
        califa = input.nextInt();
        if(califa >= 90 && (califa<= 100)){
            System.out.println("Tienes una A");}
        else if(califa>= 80 && (califa<=89)){
            System.out.println("Tienes una B");}
        else if(califa>= 70 && (califa<=79)){
            System.out.println("Tienes una C");}
        else if(califa>= 60 && (califa<=69)){
            System.out.println("Tienes una D");}
        else if(califa>= 0 && (califa<=59)){
            System.out.println("Tienes una F");}
        //aqui lo que se debio de hacer es de que los menores van primero de menor a mayor 
        
            
             
    }
    
}
