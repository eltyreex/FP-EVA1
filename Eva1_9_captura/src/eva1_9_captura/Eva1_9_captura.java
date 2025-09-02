/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_captura;

import java.util.Scanner; // aca se uso una herramienta para ponre

public class Eva1_9_captura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name;
        int edad;
        double promedio;
        Scanner input = new Scanner(System.in); // ne java no existe scanner asi que lo que necesito es usar new Scanner(System.in)
        // scanner tambien es variable va al inicio xd
        
        //como se captura en java:
        System.out.println("Nombre completo");
        name = input.nextLine(); // eso lo que hace es capturara texto y con eso queda al cien
        
        System.out.println("Tu edad es :");
        edad = input.nextInt();
        
        System.out.println("Tu promedio es :");
        promedio = input.nextDouble();
        
        
    }
    
}
