package Exercicio_02;

import java.util.Locale;

import java.util.Scanner;

public class Main {

    //pesquisei por algo que substitua o "#define" de C em java, assim nao sera preciso modificar o codigo
    //tendo em vista que o valor pode ser alterado.
    public static final int QTD = 50;

    public static void main(String[] args) {

        String flor[] = new String[QTD];
        int ideal[] = new int[QTD];
        int qtd[] = new int[QTD];

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < QTD; i++) {
            System.out.printf("Nome da flor %d = \n", i + 1);
            flor[i] = in.nextLine();
            System.out.println("Quantidade ideal = ");
            ideal[i] = in.nextInt();
            System.out.println("Quantidade em estoque = ");
            qtd[i] = in.nextInt();
            System.out.println("\n");
            in.nextLine();
        }

        for (int i = 0; i < QTD; i++) {
            if (qtd[i] < ideal[i]) {
                System.out.printf("É preciso comprar %d unidade(s) de %s para atingir o estoque ideal\n", (ideal[i] - qtd[i]), flor[i].toUpperCase());
            }
        }
    }
}
