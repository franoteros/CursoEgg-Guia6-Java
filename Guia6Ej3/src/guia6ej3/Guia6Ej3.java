
package guia6ej3;

import java.util.Scanner;

public class Guia6Ej3 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la frase");
        String frase = leer.nextLine();
        System.out.println(frase.toUpperCase() + frase.toLowerCase());
    }
    
}
