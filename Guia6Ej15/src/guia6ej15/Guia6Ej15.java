
package guia6ej15;

import java.util.Scanner;
public class Guia6Ej15 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int vector[] = new int [101];
        int i;
        for (i = 100; i >= 0; i--){
            vector[i] = i;
            System.out.print("(" + i + ")");
        }
        System.out.println("");
    }
}
