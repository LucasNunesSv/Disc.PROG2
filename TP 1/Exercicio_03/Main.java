package Exercicio_03;

import java.util.Scanner;

public class Main {

    public static int Funç(int num) {
        if (num < 2) {
            return num;
        } else {
            return 2 * Funç(num - 1) + 3 * Funç(num - 2);
        }
    }

    public static void main(String[] args) {

        int num, result;
        Scanner n = new Scanner(System.in);

        System.out.println("Digite um numero n - ");
        num = n.nextInt();

        System.out.println();

        for (int i = 0; i <= num; i++) {
            result = Funç(i);
            System.out.println("F(" + i + ") = " + result);
        }
    }
}
