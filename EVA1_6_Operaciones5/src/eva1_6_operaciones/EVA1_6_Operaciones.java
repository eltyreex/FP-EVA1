package eva1_6_operaciones;
public class EVA1_6_Operaciones {

    public static void main(String[] args) {
        //area de un circulo 
        double radio; //en eso estoy definiendo variables
        double py;
        double area;
        py = 3.141592; // todo eso que hice es la inicializacion:
        radio = 5; // estoy difiniendo todo lo que yo quiero q mi variable 
        area = py * radio * radio;
        // imprimir
        System.out.print("El valor de un circulo de radio 5 es : ");
        System.out.println(area);
        //nuevo circulo de radio 100
        //no tengo q cambiar las variables anteriores solo debo de poner un nuevo valor
        radio = 100;
        area = py * radio * radio;
        System.out.print("El area de un circulo de radio 100 es: ");
        System.out.println(area);
    }
    
}
