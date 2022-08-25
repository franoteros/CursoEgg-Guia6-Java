
package guia6ejextra6;
import java.util.Scanner;
public class Guia6Ejextra6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i, N, j;
        double prom, h, suma;
        suma = 0;
        prom = 0;
        j = 0;
        System.out.println("Ingrese cantidad de personas");
        N = leer.nextInt();
        
        for (i=0; i<N; i++){
            System.out.println("Inrese altura de la " + (i+1) + "° persona");
            h = leer.nextDouble();
            if (h >= 1.60){
                suma = suma + h;
                j = j + 1;
            }
        }
        
        prom = suma/j;
        System.out.println("El promedio de altura de " + j + " personas es de " + prom);
       
        
        
    }
}
