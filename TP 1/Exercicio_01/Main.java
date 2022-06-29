package Exercicio_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double maos[] = new double[5];
        double pes[] = new double[5];
        double pod[] = new double[5];

        double preço_ma;
        double preço_pe;
        double preço_po;

        double salario;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o preço do serviço de Mãos = ");
        preço_ma = scan.nextDouble();
        System.out.println("Digite o preço do serviço de Pés = ");
        preço_pe = scan.nextDouble();
        System.out.println("Digite o preço do serviço de Podologia = ");
        preço_po = scan.nextDouble();
        System.out.println("\n--------  Quantidade de serviços realizados  --------");
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.println("Serviços de MÃO feitos pela funcionária " + (i + 1));
            maos[i] = scan.nextDouble();
            System.out.println("Serviços de PÉS feitos pela funcionária " + (i + 1));
            pes[i] = scan.nextDouble();
            System.out.println("Serviços de PODOLOGIA feitos pela funcionária " + (i + 1));
            pod[i] = scan.nextDouble();
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            salario = ((preço_ma * maos[i]) + (preço_pe * pes[i]) + (preço_po * pod[i])) / 2;
            System.out.printf("\nSalário da funcionária nº %d = %.2f", (i + 1), salario);
        }
        System.out.println();
    }
}
