
package guia6ej20;
import java.util.Scanner;
public class Guia6Ej20 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][]matriz = new int[3][3];
        int i, j, col1, col2, col3, fila1, fila2, fila3, diag1, diag2;
        col1=0;
        col2=0;
        col3=0;
        fila1=0;
        fila2=0;
        fila3=0;
        diag1=0;
        diag2=0;                        
        
        for (i=0; i<3; i++){
            for (j=0; j<3; j++){
                System.out.println("Coordenada " + i + "," + j);
                matriz[i][j] = leer.nextInt();}}
            
        for (i=0; i<3; i++){
            for (j=0; j<3; j++){
                if (j==0){
                    col1 = col1 + matriz[i][j];
                }
                if (j==1){
                    col2 = col2 + matriz[i][j];
                }
                if (j==2){
                    col3 = col3 + matriz[i][j];
                }
                if (i==0){
                    fila1 = fila1 + matriz[i][j];
                }
                if (i==1){
                    fila2 = fila2 + matriz[i][j];
                }
                if (i==2){
                    fila3 = fila3 + matriz[i][j];
                }
                if (i==j){
                    diag1 = diag1 + matriz[i][j];
                }
                if (i+j==2){
                    diag2 = diag2 + matriz[i][j];
                }
            }  
        }
        
        if(col1==col2 && col2==col3 && col3==fila1 && fila1==fila2 && fila2==fila3
                && fila3==diag1 && diag1==diag2){
            System.out.println("La suma de cada linea da " + col3);
            System.out.println("El cuadrado es magico");
        }
        
        
        
    }
}
