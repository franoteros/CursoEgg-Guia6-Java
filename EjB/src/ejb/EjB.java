/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

/**
 *
 * @author Administrador
 */
public class EjB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
		int j;
		int lado;
                Scanner consola = new Scanner(System.in);
		System.out.println("Ingrese un N");
		lado = consola.nextInt();
                //------------------TECHO------------------
		for (i=1;i<=lado;i++) {
			System.out.print("* ");
		}
		System.out.println("");
		//------------------CENTRO------------------
		for (i=3;i<=lado;i++) {
			System.out.print("* ");
			for (j=2;j<=lado-1;j++) {
				System.out.print("  ");
			}
			System.out.println("* ");
		}
		//------------------PISO------------------
		for (i=1;i<=lado;i++) {
			System.out.print("* ");
		}
		System.out.println("  ");
    }
    
}

