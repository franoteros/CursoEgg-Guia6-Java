
package guia6ej14;

import java.util.Scanner;
public class Guia6Ej14 {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tipo de cambio");
        System.out.println("1-Libra");
        System.out.println("2-Dolar");
        System.out.println("3-Yen");
        String moneda;
        moneda = leer.nextLine();
        System.out.println("Ingrese el monto en Euros");
        double euro;
        euro = leer.nextInt();
        
        conversionEuro(euro, moneda);        
    }
    
    public static void conversionEuro (double euro, String moneda){
        double cambio;
        cambio = 0;
        switch (moneda){
            case "1":
                cambio = 0.86 * euro;
                break;
            case "2":
                cambio = 1.28611 * euro;
                break;
            case "3":
                cambio = 129.852 * euro;
                break;
        }
        System.out.println("El valor a cambio es de " + cambio);
            
        }
    }
