
import java.util.Scanner;

//Realizar un programa que pida dos números enteros positivos por teclado y muestre por
//pantalla el siguiente menú:

/*El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.*/

public class Ejercicio11 {

  
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
         //Scanner entrada2 = new Scanner(System.in);
        
        System.out.println("Ingrese dos numeros  ");
        int num1= entrada.nextInt();
        int num2=entrada.nextInt();
        
        System.out.println("Menu");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("Elija una opcion:");
        
        int opcion , decision;
        
        do{
       
        opcion = entrada.nextInt();
        switch(opcion){
            case 1:
                System.out.println("La suma es: " + (num1+num2));
                break;
            case 2:
                System.out.println("La resta es: " + (num1-num2));
                break;
            case 3:
                System.out.println("La multiplicacion es: " + (num1*num2));
                break;
            case 4:
                System.out.println("La division es: " + (num1/num2));
                break;                      
            case 5:                
                System.out.println("Salir");
                System.out.println("Estas seguro que desa salir? 1/2");
                decision = entrada.nextInt();
                
               if (decision==1){
                   System.out.println("Saliste existosamente del programana");
               }else {
                   opcion = 1;
               }        
                break;
        }
      }while(opcion != 5);
    }
    
}
