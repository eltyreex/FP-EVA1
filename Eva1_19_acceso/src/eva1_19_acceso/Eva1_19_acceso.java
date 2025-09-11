/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_acceso;

import java.util.Scanner;

/**
 *
 * @author fer
 */
public class Eva1_19_acceso {
    //aqui ponemos la constante
    final static String User_Correcto = "Luis"; //final static con eso hace q mis variables sean constantes
    final static String Contrasena_Correcto = "1234"; //es el valor final que le vas a poner y de ahi no hay cambios
    
    public static void main(String[] args) { //lo de arriba para usarlo abajo tiene que ser de arriba osea static si quieres que sea abajo
        //vamos a usar usuario y contrasena
        //la contra y ususario son string osea una cadena
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
        //ahora van las condicionales 
        if(user.equals(User_Correcto)){//aqui primero va la variable que el usuario debe de poner despues la comparo con la que es la correcta
            if(contra.equals(Contrasena_Correcto)){ //aqui lo que paso fue de que usamos si las dos user y cntra son correcto puede pasar si una esta mal 
                //no deja pasar de ahi lo que debo de hacer es si los dos son correctos pasa 2 inco es malo
                System.out.println("Acceso concedido");
            }else{
                System.out.println("Acceso denegado");
            }
        }else{ //esto es el peor de los casos pq aqui nada esta bien
            System.out.println("incorrecto bro ff");
        }
        //lo primeor que paso aqui es de que me da el incorrecto aunque sea igual la unica variable de comparacion osea solo user me da error aun
        //eso paso pq las cadenas no se pueden comparar ya que son cadenas no es lo mismo que numero 
        //son objetos y tenemos que usar otra cosa para comparar
        //vamos a declarar constantes para que asi no cambie el valor
    }
    
}
