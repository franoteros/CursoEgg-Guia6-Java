
package eja;


import java.util.Scanner;
public class EjA {


    public static void main(String[] args) {
        
        Scanner leer= new Scanner (System.in);
        String clave ;
        int longitud, contadorCorrecto, contadorIncorrecto;
       contadorCorrecto=0;
       contadorIncorrecto=0;
                
        do {
                
        System.out.println("ingrese un clave que comience con X y finalice con O");
        
        
       clave = leer.nextLine();
       
       
       if (clave.length()<=5 && clave.startsWith("X")&& clave.endsWith("O")){
           
           contadorCorrecto++;
           
       }else if ( clave.equalsIgnoreCase("&&&&&")){
           break;
                    
       }else{
           contadorIncorrecto++;
       }
        
        } while (!clave.equalsIgnoreCase("&&&&&"));
       
        System.out.println("la cantidad de claves correctas ingresadas es : "+ contadorCorrecto);
        System.out.println("la cantidad de claves incorrectas ingresadas es : "+ contadorIncorrecto);
        
    }
    
}

