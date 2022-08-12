
package guia6ej6;
import java.util.Scanner;
public class Guia6Ej6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int num = leer.nextInt();
        if (num%2 == 0){
            System.out.println("El numero es par");
        }else {
            System.out.println("El numero es impar");
        }
    }
}
