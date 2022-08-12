
package guia6ej7;
import java.util.Scanner;
public class Guia6Ej7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese frase");
        String frase = leer.next();
        String eureka = "eureka";
        if (frase.equals(eureka)){
            System.out.println("La frase es correcta");
        } else {
            System.out.println("La frase no es correcta");
        }
    }
    
}
