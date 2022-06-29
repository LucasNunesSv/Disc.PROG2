package Exercicio_05;

public class Main {
    public static void main(String[] args) {

        int mat[][] = new int[3][3];
        int cont = 0;

        System.out.println();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = cont + 1;
                cont++;
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        int j = 0;
        do {
            for (int i = mat.length - 1; i >= 0; i--) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
            j++;
        } while (j < mat.length);
    }
}
