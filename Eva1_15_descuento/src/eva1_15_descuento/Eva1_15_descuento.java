/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_descuento;

import java.util.Scanner;

/**
 *
 * @author fer
 */
public class Eva1_15_descuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //si el monto de la venta es mayor a mil me debe dar un descuento del 15%
        double costo, costdesc, descuento;
       Scanner input = new Scanner (System.in);
        System.out.println("Su articulo costo :");
        costo = input.nextDouble();
       if (costo > 1000) { //le damos decuento
          costdesc =costo*0.15; //una variable es para determinar el descuento
          descuento =costo-costdesc; //aqui funciona el costo menos lo que se desconto
           System.out.print("Tu prenda ahora cuesta: ");
        System.out.println(descuento);
       } else{ //si no cumplo con esa condicion me da este resultado
           System.out.print("No recibes nada de descuento vas a pagar:  ");
           System.out.println(costo);
           
       }
            
        
        
    }
    
}
