/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_año;

import java.util.Scanner;

/**
 *
 * @author fer
 */
public class EVA1_14_AÑO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;   //tuve q crear 2 variables de ahi 
        int anno;
        Scanner input = new Scanner (System.in);
        System.out.println("Captura tu anno de nacimiento :");
        anno = input.nextInt();
        edad = 2025-anno;  //aqui lo que se necesito fue restar el anno de nacimiento asi ya te da la cantidad de edad que alguien tiene
        
        if (edad >=18) {
            System.out.println("Felicidades puedes votar");
            System.out.println(edad);
            
            
        } else { System.out.println("usted no puede entrar aun no cumples con la mayotia de edad");
            
        }
    }
    
}
