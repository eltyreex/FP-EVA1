/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_if;

import java.util.Scanner;

/**
 *
 * @author fer
 */
public class Eva1_13_if {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double califa;
        Scanner input = new Scanner (System.in);
        System.out.println("aqui vas a ver tu cali:");
        califa = input.nextDouble();
        //imprimir 
     //solo evalua verdadero y falso 
     //aqui va lo que corresponde a verdaddero entre lo{}
        
        if(califa >= 70){ //ahora ya no utiliza ; ahora es con las {}
        
        System.out.println("Felicidades por tu califa vas a peru :");
        System.out.println(califa);
        } else { //la parte de else es opcional
                System.out.println("pene");}
    }
    
}
