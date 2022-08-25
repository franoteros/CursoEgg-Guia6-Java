
package manosalaobra11;

import java.util.Scanner;
public class Manosalaobra11 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       String frase = leer.nextLine();
       String oracion = cambialetra(frase);
       System.out.println(oracion);
    }
    
    public static String cambialetra(String frase) {
        int largo = frase.length();
        String letra, newfrase;
        newfrase = "";
        int i;
        for (i=0; i<largo; i++){
           letra = frase.substring(i,i+1); 
           switch (letra){
            case "a":
                letra = "@";
                break;
            case "e":
                letra = "#";
                break;
            case "i":
                letra = "$";
                break;
            case "o":
                letra = "%";
                break;
            case "u":
                letra = "*";
                break;
            }
            newfrase = newfrase.concat(letra);
        }
        return(newfrase);

       
    }
}
