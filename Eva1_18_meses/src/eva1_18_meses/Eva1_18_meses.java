/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_meses;

import java.util.Scanner;

/**
 *
 * @author fer
 */
public class Eva1_18_meses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int anno; //no era anno era mes xddd pero me dio 
        Scanner input =new Scanner(System.in);
        System.out.println("Numero del mes");
        anno = input.nextInt();
        
        if(anno==1){
            System.out.println("january");
        } else if(anno==2){
            System.out.println("febrary");
        }else if(anno==3){
            System.out.println("march");
        }else if(anno==4){
            System.out.println("abril");
        }else if(anno==5){
            System.out.println("may");
        }else if(anno==6){
            System.out.println("june");
        }else if(anno==7){
            System.out.println("july");
        }else if(anno==8){
            System.out.println("agoust");
        }else if(anno==9){
            System.out.println("september");
        }else if(anno==10){
            System.out.println("october");
        }else if(anno==11){
            System.out.println("november");
        }else if(anno==12){
            System.out.println("December");
        }else{
            System.out.println("numero invalido son 12 meses");
        }
        // TODO code application logic here
    }
    
}
