
package guia6ej10;
import java.util.Scanner;
public class Guia6Ej10 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese numero limite");
       int numeroL = leer.nextInt();
       int numero;
       int suma = 0;
       int i = 1;
       do  {
           System.out.println("Ingrese " + i + "° numero a sumar");
           numero = leer.nextInt();
           suma = numero + suma;
           System.out.println("La suma parcial es " + suma);
           i = i+1;
       } while (suma <= numeroL);
        System.out.println("La suma de todos los numeros es " + suma);
        System.out.println("Es menor o igual a " + numeroL);
        
    }
    
}
