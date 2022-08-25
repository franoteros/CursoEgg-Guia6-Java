
package guia6ejextra1;

import java.util.Scanner;
public class Guia6Ejextra1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double horas, mins, dias;
        System.out.println("Ingrese minutos");
        mins = leer.nextDouble();
        
        if (mins <= 1440){
            horas = mins/60;
            dias = 0;
        }else{
            dias = (mins/60)/24;
            horas = (mins/60)%24;
        }
        System.out.println("Dias: " + Math.floor(dias));
        System.out.println("Horas: " + Math.floor(horas));
        
        
    }
    
}
