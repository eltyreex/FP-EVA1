/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_20_antro;

import java.util.Scanner;

public class Eva1_20_antro {
    final static String Credencial="si";
//aqui solo se uso 1 ya que el otro es mejor usar la edad 
    public static void main(String[] args) {
        //poner mis variables
        int edad;
        String crede;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Bienvenido al antro");
        System.out.println("Tienes credencial? ");
        crede=input.nextLine();
        System.out.println();
        System.out.println("Que edad tienes? ");
        edad=input.nextInt();
        //van mis if's
        if(crede.equals(Credencial)){
            if(edad >=18){
                System.out.println("Puedes pasar bro");
            }else {
                System.out.println("Aun no cumples 18");
            }
        }else{
            System.out.println("Nada se puede usar bro ff");
        }
        
    }
    
}
