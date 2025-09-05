/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_operaciones_booleanas;

/**
 *
 * @author fer
 */
public class EVA1_12_operaciones_booleanas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int rad=5; //declaro e inicializo
        boolean res; //true or false
        //uso de los operadores booleanos
        res = rad != 0; //radio (5)> 0
        System.out.println("radio (5) != 0 :");
        System.out.println(res); //== es una comparacion = es igual a asignacion
        //!= eso significa diferencia asi que ve va a dar false
         res = rad == 0; 
        System.out.println("radio (5) == 0 :");
        System.out.println(res);
         res = rad < 0; 
        System.out.println("radio (5) < 0 :");
        System.out.println(res);
        
         res = rad > 0; 
        System.out.println("radio (5) > 0 :");
        System.out.println(res);
        
        
        
               
    }
    
}
