
package guia6ej21d;

public class Guia6Ej21D {

    public static void main(String[] args) {
        
        
        int i, j, coordI, coordJ, x, y, a, b;
        coordI = 0;
        coordJ = 0;
        boolean retorno = false;
     
        int[][] matriz10 = new int[][]{
            {1, 26, 36, 47, 5, 6, 72, 81, 95, 10},
            {11, 12, 13, 21, 41, 22, 67, 20, 10, 61},
            {56, 78, 87, 90, 9, 90, 17, 12, 87, 67},
            {41, 87, 24, 56, 97, 74, 87, 42, 64, 35},
            {32, 76, 79, 1, 36, 5, 67, 96, 12, 11},
            {99, 13, 54, 88, 89, 90, 75, 12, 41, 76},
            {67, 78, 87, 45, 14, 22, 26, 42, 56, 78},
            {98, 45, 34, 23, 32, 56, 74, 16, 19, 18},
            {24, 67, 97, 46, 87, 13, 67, 89, 93, 24},
            {21, 68, 78, 98, 90, 67, 12, 41, 65, 12}};

        int[][] matriz3 = new int[][]{{36, 5, 67}, {89, 90, 75}, {14, 22, 26}};
        
        for (i=0; i<10; i++){
            for (j=0; j<10; j++){
                a=0;
                b=0;
                            if (matriz10[i][j] == matriz3[0][0]){
                                if (matriz10[i][j+1] == matriz3[0][1]){
                                    if (matriz10[i][j+2] == matriz3[0][2]){
                                        if (matriz10[i+1][j] == matriz3[1][0]){
                                            if (matriz10[i+1][j+1] == matriz3[1][1]){
                                                if (matriz10[i+1][j+2] == matriz3[1][2]){
                                                    if (matriz10[i+2][j] == matriz3[2][0]){
                                                        if (matriz10[i+2][j+1] == matriz3[2][1]){
                                                            if (matriz10[i+2][j+2] == matriz3[2][2]){
                                                                retorno = true;
                                                                coordI = i;
                                                                coordJ = j;
                                                                System.out.println("(" + i + "," + j + ")" + "-" + "(" + a + "," + b + ")");
                                                            }else{
                                                                retorno = false;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }           
            }
        }
        if (retorno == true){
            System.out.println("La matriz P se encuentra dentro de la matriz M. Las coordenadas del primer elemento son " + coordI + "," + coordJ);
        }
        if (retorno == false){
        System.out.println("La matriz P NO se encuentra dentro de la matriz M");
        }

        
        
    }              
}

           

        
        

