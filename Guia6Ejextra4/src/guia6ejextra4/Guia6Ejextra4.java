
package guia6ejextra4;
import java.util.Scanner;
public class Guia6Ejextra4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero del 1 al 10");
        numero = leer.nextInt();
        String numeroString;
        
        while(numero>10 || numero<1){
            System.out.println("El numero no esta entre 1 y 10. Ingrese de nuevo");
            numero = leer.nextInt();
        }
        
        numeroString = String.valueOf(numero);
        
        switch(numeroString){
            case "1":
                numeroString = "I";
                System.out.println(numeroString);
                break;
            case "2":
                numeroString = "II";
                System.out.println(numeroString);
                break;
            case "3":
                numeroString = "III";
                System.out.println(numeroString);
                break;
            case "4":
                numeroString = "IV";
                System.out.println(numeroString);
                break;
            case "5":
                numeroString = "V";
                System.out.println(numeroString);
                break;
            case "6":
                numeroString = "VI";
                System.out.println(numeroString);
                break;
            case "7":
                numeroString = "VII";
                System.out.println(numeroString);
                break;
            case "8":
                numeroString = "VIII";
                System.out.println(numeroString);
                break;
            case "9":
                numeroString = "IX";
                System.out.println(numeroString);
                break;
            case "10":
                numeroString = "X";
                System.out.println(numeroString);
                break;
        }
    }
    
}
