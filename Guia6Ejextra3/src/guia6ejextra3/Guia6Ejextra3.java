
package guia6ejextra3;
import java.util.Scanner;
public class Guia6Ejextra3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String letra;
        System.out.println("Ingrese uan letra");
        letra = leer.nextLine();
        
            if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")){
                System.out.println("La letra ingresada ES una vocal");
            }else{
                System.out.println("La letra ingresada NO es una vocal");
            }
    }
}
