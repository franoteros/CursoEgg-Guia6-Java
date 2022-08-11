
package guia6ej1;

import java.util.Scanner;

public class Guia6Ej1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el 1er numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el 2do numero");
        int num2 = leer.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma de ambos numeros es " + suma);
        
    }
    
}
