
package manosalaobra9;

import java.util.Scanner;
public class Manosalaobra9 {

 
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num, suma, i;
        suma = 0;
        i = 0;
        
        do {
            System.out.println("Ingrese numero entero");
            num = leer.nextInt();
            if (num == 0)
                break;  
            i++;
            if (num < 0)
                continue;
            suma += num;
        } while (i < 20);
        
        if (num == 0) {
            System.out.println("Se capturó el numero 0");
        }
        System.out.println("La suma de todos los numeros positivos es " + suma);
    }
    
}
