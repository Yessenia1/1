import java.util.Scanner;

public class cuatro8 {
  
  public static void main(String[] args) {
    static Scanner lt=new Scanner(System.in);
    
    double tiempoanti;
    double sueldo;
    double bonotiempo=0;
    double bonosueldo;
    double bonomayor;

    System.out.println("Ingrese tiempo de antiguedad:");
    tiempoanti=lt.nextInt();
    System.out.println("Ingrese el sueldo reciente:");
    sueldo=lt.nextInt();
    double bonotiempo=sueldo*0.20;
    double bonotiempo=sueldo*0.30);
    double bonosueldo=sueldo*0.10;
    double bonosueldo=sueldo*0.15;
    double bonosueldo=sueldo*0.25;
    double bonomayor=bonotiempo;
    double bonomayor=bonosueldo;
    if (tiempoanti>2&&tiempoanti<5)
      System.out.print("Bono de antiguedad: " + bonotiempo);
       
    if (tiempoanti>=5){ 
       System.out.print("Bono de antiguedad: " + bonotiempo);}
    if (sueldo>3500){
      System.out.print("Bono sueldo: " + bonosueldo);}
       
    if (sueldo>=1000&&sueldo<=3500){ 
      System.out.print("Bono sueldo: " + bonosueldo);}
       
    if (sueldo<=1000){ 
      System.out.print("Bono sueldo: " + bonosueldo);}
       
    if ((bonotiempo)>(bonosueldo)){ 
      System.out.print("Bono mayor: " + bonomayor);}
       
    if{ 
       
       System.out.println("El bono mayor es: " + bonomayor);}
    
    
  }
}