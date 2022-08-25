
package guia6ejextra7;
import java.util.Scanner;

public class extra7B {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    double max, min, N, i, j, suma, num, prom;
     max = 0;
     min = 999999999;
     prom = 0;
     i = 0;
     j = 0;
     suma = 0;   
     
     do{
        System.out.println("Ingrese cantidad de numeros para calcular");
        N = leer.nextInt();
        }while(N==0 || N < 0);
     
     do{
          System.out.println("Ingrese el " + (i+1) + "° numero");
          num = leer.nextInt();
          i++;
          suma = suma + num;
          if (num>max){
              max = num;
          }if (num<min){ 
              min = num;
          }
        }while(i<N);
     
         prom = suma/i;
            
         System.out.println("max = " + max + ", min = " + min + " prom = " + prom);
     
    }
}
