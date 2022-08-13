
package manosalaobra10;
import java.util.Scanner;
public class Manosalaobra10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String ast = "";
        String ast1 = "";
        String ast2 = "";
        String ast3 = "";
        String ast4 = "";
        
        int num1, num2, num3, num4;
        
            System.out.println("Ingrese 4 numeros");
            num1 = leer.nextInt();
            num2 = leer.nextInt();
            num3 = leer.nextInt();
            num4 = leer.nextInt();
            
            for (int j = 1; j < 20; j++) {
                ast = ast.concat("*");
                if (j == num1) {
                    ast1 = ast;
                } 
                if (j == num2) {
                    ast2 = ast;
                }
                if (j == num3) {
                    ast3 = ast;
                }
                if (j == num4) {
                     ast4 = ast;
                }   
            }  
            System.out.println(num1 + ast1);
            System.out.println(num2 + ast2);
            System.out.println(num3 + ast3);
            System.out.println(num4 + ast4);
    }
}
