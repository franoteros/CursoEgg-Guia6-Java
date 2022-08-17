
package guia6ej17;
import java.util.Scanner;
public class Guia6Ej17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int vector[] = new int [101];
        int i, unD, dosD, tresD, cuatroD, cincoD;
        unD=0;
        dosD=0;
        tresD=0;
        cuatroD=0;
        cincoD=0;
        
        for (i=0; i<100; i++){
            vector[i] = (int) (Math.random() * 99999);
            System.out.println("(" + vector[i] + ")");
        }
        
        for (i=0; i<100; i++){
            if (vector[i]<10){
                unD++;
            }
            if (vector[i]<100 && vector[i]>=10){
                dosD++;
            }
            if (vector[i]<1000 && vector[i]>= 100){
                tresD++;
            }
            if (vector[i]<10000 && vector[i]>= 1000){
                cuatroD++;
            }
            if (vector[i]<100000 && vector[i]>=10000){
                cincoD++;
            }
        }
        System.out.println("Hay " + unD + " de 1 digito");
        System.out.println("Hay " + dosD + " de 2 digitos");
        System.out.println("Hay " + tresD + " de 3 digitos");
        System.out.println("Hay " + cuatroD + " de 4 digitos");
        System.out.println("Hay " + cincoD + " de 5 digitos");
    }
   
}
