package uno;
import java.util.Scanner;
public class uno {
   static Scanner lt=new Scanner(System.in);

    public static void main(String[] args) {
        int edad;
        String mensaje;
        System.out.println("Ingrese la edad:");
        edad=lt.nextInt();
        if (edad>=18) {
            mensaje="Puede votar porque su edad es "+edad;
        } else {
            mensaje="No puede votar porque su edad es "+edad;
        }
        System.out.println(mensaje);
    }
}