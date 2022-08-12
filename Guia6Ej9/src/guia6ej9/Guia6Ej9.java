
package guia6ej9;

import java.util.Scanner;
public class Guia6Ej9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese frase");
        String frase = leer.next();
        String primLetra = frase.substring(0, 1);
        String A = "a";
        if (primLetra.equals(A)) {
            System.out.println("La primer letra es correcta");
        }else{
            System.out.println("La primer letra NO es correcta");
            
        }
    }
    
}
