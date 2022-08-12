
package guia6ej8;
import java.util.Scanner;
public class Guia6Ej8 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase de 8 caracteres");
        String frase = leer.next();
        int longitud = frase.length();
        if (longitud == 8){
            System.out.println("La frase es correcta");
        } else {
            System.out.println("La frase NO es correcta");
    }
    }
}
