/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_captura2;

import java.util.Scanner;

/**
 *
 * @author fer
 */
public class EVA1_11_captura2 {

    public static void main(String[] args) {
        //INSTRUCCIONES:
        //1.-calculo de velocidades 
        //2.-distancia y tiempo 
        //3.-solicitar distancia(M) y tiempo en (S)
        //4.-calcular la velocidad (M/S)
        
        //declarar variables y Scanner          
        Scanner input = new Scanner(System.in);//primero hay que usar el scanner
        double d, t, v, velocidadkh; //despuees va las demas variables
        
       //solicitar datos:
        System.out.println("la distancia es:");
        d = input.nextDouble();
       //solicitar datos:
        System.out.println("el tiempo es:");
         t = input.nextDouble();
          //Realizar calculos
         v = (d/t);
        
         //Mostrar resultados:
         System.out.println("Tu velocidad en (m/s) :");
         System.out.print(v);
         System.out.print(" m/s ");
         System.out.println("");
         //ahora en k/h
        velocidadkh = v*3.6;
        System.out.println("Tu velocidad en k/h");
        System.out.println(velocidadkh);
    }
    
}
