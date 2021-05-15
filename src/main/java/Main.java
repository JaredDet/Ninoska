import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        //Matriz A

        int[][] MatrizA = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                MatrizA[i][j] = (int) (Math.random() * 10);
                System.out.print(" " + MatrizA[i][j]);
            }
            System.out.println();
        }
        //Matriz B

        System.out.println();
        int[][] MatrizB = new int[3][2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                MatrizB[i][j] = (int) (Math.random() * 10);
                System.out.print(" " + MatrizB[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        int[][] MatrizAB = new int[MatrizA.length][MatrizB[0].length];

        for (int i = 0; i < MatrizA.length; i++) {
            for (int j = 0; j < MatrizB[0].length; j++) {
                for (int k = 0; k < MatrizA[0].length; k++) {
                    MatrizAB[i][j] += MatrizA[i][k] * MatrizB[k][j];
                }
                System.out.print(" " + MatrizAB[i][j]);
            }
            System.out.println();
        }


    }
}