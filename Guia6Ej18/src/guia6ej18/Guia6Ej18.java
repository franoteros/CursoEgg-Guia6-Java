
package guia6ej18;
import java.util.Scanner;
public class Guia6Ej18 {

 
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int [][] matriz = new int [3][3];
       int i, j;
       
       for (i=0; i<3; i++){
           for (j=0; j<3; j++){
               matriz[i][j] = (int) (Math.random() * 10);
               System.out.print("(" + matriz[i][j] + ")");
           }
               System.out.println("");
       }
       
        System.out.println("");
       
       for (j=0; j<3; j++){
           for (i=0; i<3; i++){
               System.out.print("(" + matriz[i][j] + ")");
           }
           System.out.println("");
       }
    }
   
}
