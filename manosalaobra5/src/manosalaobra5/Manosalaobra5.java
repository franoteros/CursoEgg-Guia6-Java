
package manosalaobra5;


import java.util.Scanner;

public class Manosalaobra5 {

   
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese el numero con decimales:");
       double numero = leer.nextDouble();
        System.out.println("Ingrese la letra:");
       char letras;
       letras = leer.next().charAt(0);
       boolean logico = false;
       logico = numero != letras;
        System.out.println(logico);
        
       
    
}
    
}