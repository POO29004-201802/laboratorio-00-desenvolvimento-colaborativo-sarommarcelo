package POO;

import java.util.Scanner;

public class Principal {
    public static char [][] criaQuadrado(int dim){

        int aux = dim - 1;

        char [][] quadrado = new char[dim][dim];

        for(int i=0,j=1;j<dim;j++){
            quadrado[i][j] = '-';
        }

        for(int i=aux,j=1;j<dim;j++){
            quadrado[i][j] = '-';
        }


        for(int j=0,i=1;i<dim;i++){
            quadrado[i][j] = '|';
        }

        for(int j=aux,i=1;i<dim;i++){
            quadrado[i][j] = '|';
        }

        for(int i =1; i<aux; i++){
            for(int j=1; j<aux; j++){
                quadrado[i][j] = ' ';
            }
        }

        quadrado[0][0] = '+';
        quadrado[0][aux] = '+';
        quadrado[aux][0] = '+';
        quadrado[aux][aux] = '+';

        return quadrado;


    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a dimensão do seu quadrado: ");
        int par = teclado.nextInt();

        Principal figura = new Principal();
        char [][] quadrado = figura.criaQuadrado(par);

        for(int m=0; m < par; m++){
            for(int n = 0; n< par; n++){
                System.out.print(quadrado[m][n]);
            }
            System.out.print("\n");
        }

    }
}
