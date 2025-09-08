/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_num_mayor;

import java.util.Scanner;

/**
 *
 * @author fer
 */
public class EVA1_16_Num_Mayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //debo de solicitar dos numero y debo determinar cual es el mayor
        double num1, num2;
        Scanner input = new Scanner (System.in);
        System.out.println("Tu numero 1 es : ");
        num1 = input.nextDouble();
        System.out.println("Tu numero 2 es: ");
        num2 = input.nextDouble();
        if(num1 > num2) {
            System.out.println("Tu variable numero 1 es mayor");}
        else{
        System.out.println("Tu varibale numero 2 es mayor");
    }
        
    }
    
}
