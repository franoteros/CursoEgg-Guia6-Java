
package guia6ej19;
import java.util.Scanner;
public class Guia6Ej19 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i, j, k;
        k = 0;
        int [][] matriz = new int [3][3];
        String retorno = "";
        
        for (i=0; i<3 ; i++){
            for (j=0; j<3; j++){
                System.out.println("Coordenada " + i + "," + j);
                matriz[i][j] = leer.nextInt();
            }
        }
        
        for (i=0; i<3 ; i++){
            for (j=0; j<3; j++){
                System.out.print("(" + matriz[i][j] + ")");
            }System.out.println("");
        }
        System.out.println("");
        
        for (i=0; i<3 ; i++){
            for (j=0; j<3; j++){
                System.out.print("(" + -(matriz[i][j]) + ")");
            }System.out.println("");
        }
        
        for (i=0; i<3 ; i++){
            for (j=0; j<3; j++){
                if (matriz[i][j] == -(matriz[j][i])){
                    k++;
                }
            }
        }
        
        if (k==9){
            retorno = "Verdadero";
            System.out.println(k);
        }else{
            retorno = "Falso";
            System.out.println(k);
        }
        
        System.out.println("Las matrices son anti simetricas? " + retorno);
      
    }
    
}
