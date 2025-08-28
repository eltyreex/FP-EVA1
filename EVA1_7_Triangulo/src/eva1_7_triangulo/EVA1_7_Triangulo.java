
package eva1_7_triangulo;

public class EVA1_7_Triangulo {
    public static void main(String[] args) {
        //area de un triangulo
        //area= (base por altura) entre 2
        double base, h, area; //tres variables del mismo tipo asi no debo de poner doble a toda variable
        //inicializacion:
        base = 16.23;
        h = 3.41592653589793;
        area = (base * h)/2.0; //cuando se usa ()es para denotar q primero va el parentecis igual que en mates
        //ahora cuando quiera dividir necesito que  me de la parte decimal tambien osea la flooting entonces voy a poner todos mis enteros como decimales
        // ejemplo de ello es 16 a 16.0 y ya xd 
        //si necesito q solo me salga un entero entonces pos lo dejo asi en la parte entera de 16.0 a 16 y ya 
        System.out.print("El area de un triangulo es: ");
        System.out.println(area);
              
    }
    
}
