/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_27_conversiones;

/**
 *
 * @author fer
 */
public class EVA1_27_Conversiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int temp;
        double tempDecimal;
        tempDecimal = 24.5;
        temp = (int)tempDecimal; //esto es casting
        System.out.println(temp);
        
        String cade, mensaje;
        mensaje = "La temperatura es: ";
        cade = mensaje + true;//esto es concatenacion se agrega si ...+ ... //pegame todo 
        //convierte de entero a string todo lo convierte de booleano a no se que en string
        System.out.println(cade);
    }
    
}
