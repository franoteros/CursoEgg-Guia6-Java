/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc;

/**
 *
 * @author Administrador
 */
public class EjC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String moneda="";
        double valor;
        int opcion;
        
        System.out.println(" ingrese la cantidad de euros a convertir en otra  moneda");
        valor = leer.nextDouble();
        
        System.out.println("1:libras,2:dolares,3 yenes");
        opcion = leer.nextInt();
        
        switch (opcion) {
            case 1:
                moneda = "libras";
                break;
            case 2:
                moneda = "dolares";
                break;
            case 3:
                moneda = "yenes";
                break;
            default:
                System.out.println("ingrese opcion correcta");
        }
       valorDeCambio(valor,moneda);
    }
    
    public static void valorDeCambio(double valor, String moneda) {
        switch (moneda) {
            case "libras":
                valor = valor*0.86;

