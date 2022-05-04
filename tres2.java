import java.util.Scanner;
public class tres2 {
  static Scanner lt=new Scanner(System.in);
  
  public static void main(String[] args) {
    int cantidadhora;
    float pagohora;
    float sueldomensual;
    System.out.print("Ingrese el costo por hora: ");
        pagohora=lt.nextInt();
    System.out.print("Ingrese cantidad horas trabajadas en la semana:");
        cantidadhora=lt.nextInt();
    float total = (40*pagohora)+(2)*((cantidadhora-40)*pagohora);
    float total1 = cantidadhora*pagohora;
    if (cantidadhora>40); {
         System.out.print("El sueldo del trabajador es: " + total);
        }
    if (cantidadhora<40); {
        System.out.print("El sueldo del trabajador es: " + total1);
    }
  }
}