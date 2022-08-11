
package guia6ej4;

import java.util.Scanner;

public class Guia6Ej4 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese grados C");
        double gradosC = leer.nextDouble();
        double gradosF = 32+(9*gradosC/5);
        System.out.println("Los " + gradosC + " convertidos a farenheit son " + gradosF);
        
    }
    
}
