/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_22_acceso_tabla;

import java.util.Scanner;

/**
 *
 * @author fer
 */
public class EVA1_22_acceso_tabla {
    final static String User_Correcto = "Luis"; //final static con eso hace q mis variables sean constantes
    final static String Contrasena_Correcto = "1234"; //es el valor final que le vas a poner y de ahi no hay cambios
    public static void main(String[] args) {
        String user, contra;
        Scanner input = new Scanner(System.in);
        //mis datos ya capturados 
        System.out.println("*****Contorol de acceso*****");
        System.out.println("Restaurante luis");
        System.out.println("Usuario: ");
        user = input.nextLine();
        System.out.println();
        System.out.println("Contrasena");
        contra = input.nextLine();
        if(user.equals(User_Correcto) && contra.equals(Contrasena_Correcto)){
             System.out.println("Acceso concedido");
        }else
            System.out.println("Accesso denegado");
            
        
        //usuario es correcto y contra es correcto
        //acceso es concedido
        // SI NO 
        //acceso denegado
        
        //operadores logicos
        //para aprender AND --> &&
        //OR --> ||
        // NOT !
    }
    
}
