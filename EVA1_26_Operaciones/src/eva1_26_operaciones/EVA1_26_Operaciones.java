/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_26_operaciones;

import java.util.Scanner;

/**
 *
 * @author fer
 */
public class EVA1_26_Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //divisiones para ssaber que es bisiesto podemos saberlo con su residuo si es entero si queda
        int val1 =1, val2=3;
        int resu;
        resu = val1 / val2;
        System.out.println("1/3 =");
        System.out.println(resu);
        
        
        double v1 =1.0, v2=3.0;
        double res;
        res = v1 / v2;
        System.out.println("1/3 =");
        System.out.println(res);
        //calcular residuo 
        //residuo = modulo = %
        
        int num1=2024, num2=4;
        int resultado;
    
        resultado = num1 % num2;
        System.out.println("2024 % 4 ==");
        System.out.println(resultado);
        if(resultado ==0){//division exacta entre 4 
            System.out.println("Puede ser bisiesto");
        } 
               
    }
    
}
