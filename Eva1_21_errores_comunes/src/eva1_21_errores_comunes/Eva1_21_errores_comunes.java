/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_21_errores_comunes;

/**
 *
 * @author fer
 */
public class Eva1_21_errores_comunes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1 = 1, num2= 2;
        if(num1>num2);
            System.out.println("ups pa fuera");
        if(num1>num2)
            System.out.println("Num1 es mayor");
        else //parece que pertenece al primer if pero en realidad es solo del segundo, se arrgla poniendo bien las llaves
            System.out.println("Num2 es mayor");
        if(num1>num2){
            if(num1>num2)
                System.out.println("ola");
        }
            
        
    }
    
}
