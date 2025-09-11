/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_23_compras;

import java.util.Scanner;

/**
 *
 * @author fer
 */
public class EVA1_23_Compras {
    
    public static void main(String[] args) {
        String din, cred;
        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenido a Liverpool");
        System.out.println();
        System.out.println("Tiene dinero? ");
        din = input.nextLine();
        System.out.println();
        System.out.println("Tiene credito? ");
        System.out.println();
        cred = input.nextLine();
        System.out.println();
        if(din.equals("si")||cred.equals("si")){
            System.out.println("Pasele a endeudarse");
        }else{
            System.out.println("vayase pinche jodido");
        }
        
    }
    
}
