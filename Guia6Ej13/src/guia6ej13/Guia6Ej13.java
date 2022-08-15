
package guia6ej13;
import java.util.Scanner;
public class Guia6Ej13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, i, j;
        System.out.println("Ingrese tamaño del lado del cuadrado");
        n = leer.nextInt();
        
        for (i=1; i<=n; i++){
            for (j=1; j<=n; j++){
                if ((i > 1) && (i < n) && (j > 1) && (j < n)){
                    System.out.print("   ");
                }else{
                    System.out.print(" * ");
                }
            }
            System.out.println("");
        }
    }
}
