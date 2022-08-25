
package manosalaobra12;
import java.util.Scanner;
public class Manosalaobra12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese dos numeros enteros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        esmultiplo(num1, num2);
    }
    
    public static void esmultiplo(int num1, int num2){
        if (num1%num2 == 0){
            System.out.println("El 1° numero ES multiplo del 2°");
        }else{
            System.out.println("El 1° numero NO ES multiplo del 2°");
        }
    }
   
}
