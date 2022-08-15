
package guia6ej11;
import java.util.Scanner;
public class Guia6Ej11 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        String menu, opc;
        double suma, resta, multip, divid; 
        boolean retorno = true;
                
        do {
            if (retorno = false)
                break;
            System.out.println("Elija una opcion");
            System.out.println("1 - suma");
            System.out.println("2 - resta");
            System.out.println("3 - multiplicacion");
            System.out.println("4 - division");
            System.out.println("5 - salir");
            menu = leer.nextLine();
            
            switch (menu) {
                case ("1"):
                    suma = num1 + num2;
                    System.out.println("La suma es " + suma);
                    break;
                case ("2"):
                    if (num1 > num2){
                        resta = num1 - num2;
                    }else{
                        resta = num2 - num1;
                    }
                    System.out.println("La resta es " + resta);
                    break;
                case ("3"):
                    multip = num1 * num2;
                    System.out.println("La multiplicacion es " + multip);
                    break;
                case ("4"):
                    if (num1 > num2){
                        divid = num1/num2;                      
                    }else{
                        divid = num2/num1;
                    }
                    System.out.println("La division es " + divid);
                    break;
                case ("5"):
                    System.out.println("Esta seguro que quiere salir? s/n");
                    opc = leer.nextLine();
                    if (opc == "s")
                        retorno = false;     
            }           
        } while (retorno != true);
                
    }
    
}

