package Basicos;

public class Array_Bidimensional {
    public static void main (String args[]){

        double acumulado;
        double interes = 0.10;

        double saldo[][] = new double[6][5];

        for(int i=0; i < 6; i++){
            saldo[i][0] = 10000;
            acumulado = 10000;

            for(int j =1; j < 5; j++){

                acumulado += (acumulado*interes);
                saldo[i][j] = acumulado;
            }
            interes += 0.01;
        }

        for(int z=0; z < 6; z++){
            for(int l = 0; l < 5; l++){
                System.out.printf("%1.2f", saldo[z][l]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
