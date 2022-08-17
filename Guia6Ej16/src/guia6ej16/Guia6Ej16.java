
package guia6ej16;
import java.util.Scanner;
import java.util.Random;

public class Guia6Ej16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int vector[] = new int [100];
        int i;
        
        for (i=0; i<100; i++){
            vector[i] = generateRandomIntIntRange(1, 101);
            System.out.print("(" + vector[i] + ")");
        }
    }
    public static int generateRandomIntIntRange(int min, int max) {
    Random r = new Random();
    return r.nextInt((max - min) + 1) + min;
} 
}
