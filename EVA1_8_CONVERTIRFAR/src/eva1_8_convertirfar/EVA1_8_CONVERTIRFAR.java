
package eva1_8_convertirfar;

public class EVA1_8_CONVERTIRFAR {

    public static void main(String[] args) {
        double cel, far, kel;
        cel = 35; //pues en esto es lo mismo que en todos lados en lo cual es primero defino la variable con double despues
        // hago lo que siempre me queda mejor lo cual es organizar segun los parametros 
        //c* 1.8 mas 32
        far = ((9*cel)/5)+32; // aqui lo que no hice fue poner la varible la puse de forma como numero osea que pues no hice uso de la variable cel
        System.out.println(far);
        kel = (cel + 273.15);
        System.out.println(kel);
        cel = (5*(far - 32)) /9; //me falto el mugre *
        System.out.println(cel);
           }
    
}
