
package guia6ejextra5;

import java.util.Scanner;
public class Guia6Ejextra5 {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       String clase, tratam;
       double descuento, costoTrat;
       descuento = 0;
       costoTrat = 0;
       
        System.out.println("Ingrese clase de socio: A, B o C");
        clase = leer.nextLine();
        System.out.println("Ingrese tipo de tratamiento a realizarse");
        System.out.println("1 = Odontologia");
        System.out.println("2 - Psicologia");
        System.out.println("3 - Clinica");
        System.out.println("4 - Traumatologia");
        tratam = leer.nextLine();
        clase = clase.toUpperCase();
        
        switch(clase){
            case "A":
                descuento = 0.50;
                break;
            case "B":
                descuento = 0.60;
                break;
            case "C":
                descuento = 1;
                break;
        }
        
        switch(tratam){
            case "1":
                costoTrat = 1000*descuento;
                break;
            case "2":
                costoTrat = 2500*descuento;
                break;
            case "3":
                costoTrat = 700*descuento;
                break;
            case "4":
                costoTrat = 1200*descuento;
                break;
        }

        System.out.println("El monto por el tratamiento segun la clase de afiliado es de " + costoTrat);
       
    }
}
