/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_captura.de.datos;

import java.util.Scanner; //eso significa que si funciono

public class Eva1_10_capturaDeDatos {

    public static void main(String[] args) {
        //solicitar la temperatura en farenheit
        //darle la temperatura en grados centigrados
        Scanner input = new Scanner(System.in); //siempre que quiero usar eso cuando sea Scanner
        double c, f; //definir variables 
        //captura de datos
        System.out.println("Temperatura en grados farenheit : ");
      f = input.nextDouble(); //usar el .next q aqui es 
      //ahora va el uso de mi formula ya pa todo
      c = 5*(f-32)/9;
        System.out.print("La temperatura es: ");
        System.out.println(c);
    }
    
}
