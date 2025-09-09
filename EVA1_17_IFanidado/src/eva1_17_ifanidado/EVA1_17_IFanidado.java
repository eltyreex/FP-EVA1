/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_ifanidado;

import java.util.Scanner;

/**
 *
 * @author fer
 */
public class EVA1_17_IFanidado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //primero es la captura de datos
       int dias;
       Scanner input =new Scanner(System.in);
        System.out.println("Numero del dia de la semana");
        dias = input.nextInt();
        //if anidado ya que necesito mas de 2 cosas
        //else if
        //funciona para cosas de mas de 2
        if(dias==1){
            System.out.println("Tu dia es domingo");
        }else if(dias==2){
            System.out.println("tu dia es el lunes");
        }else if(dias==3){
            System.out.println("tu dia es el martes");
        }else if(dias==4){
            System.out.println("tu dia es el miercoles");
        }else if(dias==5){
            System.out.println("tu dia es el juevebes");
        }else if(dias==6){
            System.out.println("tu dia es el viernmemes");
        }else if(dias==7){
            System.out.println("tu dia es el sabadrinks");
        }else{//opcional
            System.out.println("tu respues es invalida solo numeros de 1 a 7");
        }
             
    }
    
}
