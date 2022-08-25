
package guia6ejextra2;
import java.util.Scanner;
public class Guia6Ejextra2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a, b, c, d, aux;
        System.out.println("Ingrese 4 valores enteros");
        a = leer.nextInt();
        b = leer.nextInt();
        c = leer.nextInt();
        d = leer.nextInt();
        
        aux = a;
        a = d;
        d = b;
        b = c;
        c = aux;
        
        System.out.println("b = " + b + " c = " + c + " a = " + a + " d = " + d);
    }
}
