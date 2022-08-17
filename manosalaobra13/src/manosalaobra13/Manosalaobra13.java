
package manosalaobra13;

import java.util.Scanner;
public class Manosalaobra13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String [] equipo = new String [6];
        int i;
        for (i = 0; i < 6; i++){
            equipo[i] = leer.nextLine();
        }
        for (i = 0; i < 6; i++){
            System.out.print("(" + equipo[i] + ")");
        }
        System.out.println("");
    }
}
