
package guia6ej16a;

import java.util.Scanner;


public class Guia6Ej16A {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int vector[] = new int [100];
        int i, buscaNum, j;
        buscaNum = 37;
        j = 0;
        
        for (i=0; i<100; i++){
            vector[i] = (int) (Math.random() * 100);
            System.out.print("(" + vector[i] + ")");
        }
        System.out.println("");
        
        for (i=0; i<100; i++){
            if (vector[i] == buscaNum){
                j++;
                System.out.println("El numero " + buscaNum + " esta en el vector " + i);
            }
        }
        System.out.println("El numero " + buscaNum + " se encuentra " + j + " veces");
    }
   
}

