
package manosalaobra8;

import java.util.Scanner;
public class Manosalaobra8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese nota");
        int nota = leer.nextInt();
        while (nota < 0 || nota > 10) {
            System.out.println("La nota es incorrecta, ingrese nota de nuevo");
            nota = leer.nextInt();
        }
            System.out.println("La nota es " + nota);  
            
    }
    
}
