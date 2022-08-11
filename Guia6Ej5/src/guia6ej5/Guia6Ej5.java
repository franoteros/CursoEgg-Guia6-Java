
package guia6ej5;

import java.util.Scanner;

public class Guia6Ej5 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese numero entero");
        int num = leer.nextInt();
        int doble = num * 2;
        int triple = num * 3;
        double raiz2 = Math.sqrt(num);
        System.out.println("El doble es: " + doble + " el triple es " + triple + " y la raiz cuadrada es " + raiz2);
        
    }
    
}
