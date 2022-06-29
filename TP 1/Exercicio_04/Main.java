package Exercicio_04;

import java.util.Scanner;

public class Main {
    //Função q
    public static void Preenche_matriz(float mat[][]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("----- Cadastro de vendas -----\n");
        for (int i = 0; i < mat.length; i++) {
            System.out.println("* Mês " + (i + 1) + " *");
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println("Semana " + (j + 1) + " =");
                mat[i][j] = scan.nextFloat();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        float mat[][] = new float[12][4];
        float tot_mes = 0;
        float tot_sems = 0;
        float tot_ano = 0;

        Preenche_matriz(mat);

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                tot_mes += mat[i][j];
                tot_ano += mat[i][j];
            }
            System.out.println("Total do mes " + (i + 1) + " = " + tot_mes);
            tot_mes = 0;
        }

        System.out.println();

        for (int i = 0; i < mat[i].length; i++) {
            for (int j = 0; j < mat.length; j++) {
                tot_sems += mat[j][i];
            }
            System.out.println("Total de cada Semana  " + (i + 1) + " do ano = " + tot_sems);
            tot_sems = 0;
        }

        System.out.println("\nTotal vendido no ano = " + tot_ano);
    }
}