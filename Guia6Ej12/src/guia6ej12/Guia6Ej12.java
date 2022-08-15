
package guia6ej12;
import java.util.Scanner;
public class Guia6Ej12 {

       public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i, j;
        i = 0;
        j = 0;
        String cadenas;
        boolean retorno = false;
        
        System.out.println("Ingrese cadena");
        cadenas = leer.nextLine();
        
        while (!cadenas.equals("&&&&&")){
            
            if ((cadenas.length() <= 5) && (cadenas.startsWith("x")) && (cadenas.endsWith("o"))) {
                System.out.println("La cadena es CORRECTA");
                i++;
            } else if (cadenas.equals("&&&&&")) {
                break;
            }else {
                System.out.println("La cadena es INCORRECTA");
                j++;
            }
            System.out.println("Ingrese cadena");
            cadenas = leer.nextLine();
        }  
        System.out.println("Las correctas fueron " + i + " cadenas, y las incorrectas fueron " + j + " cadenas");
    }
}
