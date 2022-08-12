
package manosalaobra6;

import java.util.Scanner;
public class Manosalaobra6 {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        if (num1 > 25 && num2 > 25) {
            System.out.println("Los dos numeros son mayores a 25");
        }else if (num1 > 25) {
            System.out.println("El numero " + num1 + " es mayor a 25");
        }else if (num2 > 25) {
            System.out.println("El numero " + num2 + " es mayor a 25");
        }else{
            System.out.println("Ningun numero es mayor a 25");
            
        }
                
    }
    
}
