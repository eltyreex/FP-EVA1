/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_28_moneda;

import java.util.Scanner;

/**
 *
 * @author fer
 */
public class EVA1_28_Moneda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //juego de la moneda
        Scanner input = new Scanner(System.in);
        int usuario;
        double num;
        num = Math.random();
        System.out.println("Cara o Cruz? (1/0)");
        usuario = input.nextInt();
        System.out.println("Num aleatorio : " + num);
        
       if(num > 0.5)
            System.out.println("Salio cara");
       else
            System.out.println("salio cruz");
       if(num > 0.5 && usuario == 1 || num <= 0.5 && usuario ==0)
            System.out.println("Ganaste");
       else
            System.out.println("perdiste");
    }
    
}
